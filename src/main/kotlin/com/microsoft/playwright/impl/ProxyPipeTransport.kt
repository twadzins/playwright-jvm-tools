package com.microsoft.playwright.impl


import com.google.gson.JsonObject
import com.lazyengineer.playwright.proxy.server.PlaywrightReaderThread
import com.lazyengineer.playwright.proxy.server.PlaywrightWriterThread
import com.lazyengineer.playwright.proxy.server.ProxyReaderThread
import com.microsoft.playwright.BrowserContext
import com.microsoft.playwright.PlaywrightException
import java.io.*
import java.net.Socket
import java.net.SocketException
import java.nio.charset.StandardCharsets
import java.time.Duration
import java.util.concurrent.ArrayBlockingQueue
import java.util.concurrent.BlockingQueue
import java.util.concurrent.TimeUnit
import kotlin.system.measureNanoTime


open class ProxyPipeTransport internal constructor(input: InputStream, val output: OutputStream) : Transport {
//    var activeClientProxyMessageId = -1

    private val incoming: BlockingQueue<JsonObject> = ArrayBlockingQueue(1000)
    private val outgoing: BlockingQueue<String> = ArrayBlockingQueue(1000)
    private val readerThread: PlaywrightReaderThread
    private val writerThread: PlaywrightWriterThread

    private lateinit var proxyReaderThread: ProxyReaderThread
    private lateinit var proxyClientOutputStream: OutputStream

//    private val idToProxyMessageIdMap = mutableMapOf<Int, Int>()

    internal var clientInitComplete = false

    companion object {
        val isApiLoggingEnable = System.getenv("DEBUG")?.contains("pw:channel") ?: false
    }

    private var isClosed = false

    private val idToInitMessagesResponsesMap = mutableMapOf<Int, MutableList<String>>()

    var highestInitId = -1

    var serverInitComplete = false

    init {
        val `in` = DataInputStream(BufferedInputStream(input))
        readerThread = PlaywrightReaderThread(`in`, incoming, this)
        readerThread.start()
        writerThread = PlaywrightWriterThread(output, outgoing, this)
        writerThread.start()
    }

    internal open fun setProxyClientSocket(socket: Socket, context: BrowserContext) {
        clientInitComplete = false
        proxyClientOutputStream = socket.getOutputStream()

        //TODO: handle interruption of any current thread so it doesn't listen anymore
        if (this::proxyReaderThread.isInitialized)
            proxyReaderThread.interrupt()

        //TODO: why is and bis??
        val `in` = DataInputStream(BufferedInputStream(socket.getInputStream()))
        //TODO: refactor out "this" instead, put in a sendHandler
        proxyReaderThread = ProxyReaderThread(`in`, this).apply { start() }
    }

    override fun send(message: JsonObject) {
        highestInitId = message.get("id").asInt
        System.err.println("****highestInitId = ${highestInitId}\n")
        sendInternal(message)
    }


    /**
     * From the original source
     */
    private fun sendInternal(message: JsonObject) {
        if (isClosed) {
            throw PlaywrightException("Playwright connection closed")
        }

        if (clientInitComplete) {
            println("shouldn't be here, I think...")
        }
        try {
            // We could serialize the message on the IO thread but there is no guarantee
            // that the message object won't be modified on this thread after it's added
            // to the queue.
            outgoing.put(Serialization.gson().toJson(message))
        } catch (e: InterruptedException) {
            throw PlaywrightException("Failed to send message", e)
        }
    }

    /**
     * From the original source
     */
    override fun poll(timeout: Duration): JsonObject? {
        val received = pollOriginal(timeout)
        if (received != null) {
//            val id = received.asJsonObject.get("id")?.asInt
//            if (id != null && id != activeId) {
//                throw RuntimeException("Mismatched id $id , expected $activeId")
//            }
            val receivedString = received.toString()
            if (!serverInitComplete) {
                val receivedMessagesList = idToInitMessagesResponsesMap.getOrPut(highestInitId) {
                    mutableListOf()
                }
                receivedMessagesList += receivedString
            } else {
                TODO("shouldn't ever get here since polling stops after init is complete")
//                val messageString = if (id != null) {
//                    val proxyMessage = received.deepCopy()
//                    System.err.println("Replacing message id with activeClientProxyMessageId: $id changed to $activeClientProxyMessageId")
//                    proxyMessage.addProperty("id", activeClientProxyMessageId)
//                    proxyMessage.toString()
//                } else {
//                    receivedString
//                }
//                sendMessageToProxyClient(messageString)
//
//                if (received.get("method")?.asString == "route") {
//                    //Don't allow route to be dispatched
//                    received.addProperty("method", "route-ignored")
//                    return received
//                }
////                //TODO: massage so that a no-op occurs
////                return received
//                return received
            }
        }

        return received
    }

    private fun pollOriginal(timeout: Duration): JsonObject? {
        if (isClosed) {
            throw PlaywrightException("Playwright connection closed")
        }
        return try {
            val message = incoming.poll(timeout.toMillis(), TimeUnit.MILLISECONDS)
            if (message == null && readerThread.exception != null) {
                try {
                    close()
                } catch (e: IOException) {
                    e.printStackTrace(System.err)
                }
                throw PlaywrightException("Failed to read message from driver, pipe closed.", readerThread.exception)
            }
            message
        } catch (e: InterruptedException) {
            throw PlaywrightException("Failed to read message", e)
        }
    }

    @Throws(IOException::class)
    override fun close() {
        if (isClosed) {
            return
        }
        isClosed = true
        // We interrupt only the outgoing pipe and keep reader thread running as
        // otherwise child process may block on writing to its stdout and never
        // exit (observed on Windows).
        readerThread.isClosing = true
        writerThread.out.close()
        writerThread.interrupt()
    }

    internal fun sendInitResponseToProxyClient(messageString: String) {
        val message = ProxyServerUtil.toMessage(messageString)
        val initMessageResponses = idToInitMessagesResponsesMap.get(message.id)
        if (initMessageResponses != null) {
//            System.err.println("Returning cached init messages = $initMessageResponses")


            val fullRequestsTime = measureNanoTime {
                initMessageResponses.forEach {
                    sendMessageToProxyClient(it)
//                    val nanoTime = measureNanoTime { sendMessageToProxyClient(it) }
//                    System.err.println(nanoTime)
                }
            }
            System.err.println("*  * fullRequestsTime" + fullRequestsTime)

            if (message.id >= highestInitId) {
                clientInitComplete = true
            }

//                sendMessageToProxyClient(it)
        } else {
            throw PlaywrightException("no cached init message found for: $message, shouldn't be possibly since we should have cached ids from 1 to $highestInitId")
        }
    }

    @Throws(IOException::class)
    fun sendMessageToProxyClient(message: String) {
        //TODO : caller should only ever send bytes
        sendMessageToProxyClient(message.toByteArray(StandardCharsets.UTF_8), false)
    }

    private fun logChannelSendMessage(bytes: ByteArray, fromJsProcess: Boolean) {
        if (isApiLoggingEnable) {
            val message = String(bytes, StandardCharsets.UTF_8)
            if (fromJsProcess) {
                System.err.println("◀ RECV $message")
            }
            System.err.println("Proxy SEND ► $message")
        }
    }

    private fun logChannelReceiveMessage(bytes: ByteArray) {
        if (isApiLoggingEnable) {
            val message = String(bytes, StandardCharsets.UTF_8)
            System.err.println("Proxy ◀ RECV $message")
            System.err.println("SEND ► $message")
        }
    }

    fun sendMessageToProxyClient(bytes: ByteArray, fromJsProcess: Boolean) {
        if (!this::proxyReaderThread.isInitialized) {
            System.err.println(
                "Proxy (not sending, since is not yet initialized) (TODO:do we care about sending this to the client?): ${
                    String(
                        bytes,
                        StandardCharsets.UTF_8
                    )
                }"
            )
            return
        }
//        if (clientInitComplete) {
//            System.err.println("here after clientInitComplete")
//        }
        logChannelSendMessage(bytes, fromJsProcess)
        try {
            writeIntLE(proxyClientOutputStream, bytes.size)
            proxyClientOutputStream.write(bytes)
        } catch (e: SocketException) {
            System.err.println(
                "Unable to send to proxy client (this can be expected for networkidle messages: ${
                    String(
                        bytes,
                        StandardCharsets.UTF_8
                    )
                }"
            )
            e.printStackTrace()
        }
    }

    @Throws(IOException::class)
    private fun writeIntLE(out: OutputStream, v: Int) {
        out.write(v ushr 0 and 255)
        out.write(v ushr 8 and 255)
        out.write(v ushr 16 and 255)
        out.write(v ushr 24 and 255)
    }

//    @Throws(IOException::class)
//    fun sendMessageToJsProcess(message: String) {
//        val bytes = message.toByteArray(StandardCharsets.UTF_8)
//        sendMessageToJsProcess(bytes)
//    }

    fun sendMessageToJsProcess(bytes: ByteArray) {
        writeIntLE(output, bytes.size)
        output.write(bytes)

        logChannelReceiveMessage(bytes)
        if (clientInitComplete) {
            //TODO: consider copying the queue logic for this, rather than flushing on each message
            output.flush()
//            System.err.println("here after clientInitComplete")
        } else {
            println("shoudln't be here...")
        }
    }
}
