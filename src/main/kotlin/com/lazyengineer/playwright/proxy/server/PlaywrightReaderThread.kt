package com.lazyengineer.playwright.proxy.server

import com.google.gson.JsonObject
import com.microsoft.playwright.impl.ProxyPipeTransport
import com.microsoft.playwright.impl.ProxyServerUtil
import java.io.DataInputStream
import java.io.EOFException
import java.io.IOException
import java.nio.charset.StandardCharsets
import java.util.concurrent.BlockingQueue

/**
 * Read from pw js process
 */
internal class PlaywrightReaderThread(
    private val `in`: DataInputStream,
    private val queue: BlockingQueue<JsonObject>,
    val proxyPipeTransport: ProxyPipeTransport
) :
    Thread() {
    private var serverInitComplete = false

    @Volatile
    var isClosing = false

    @Volatile
    var exception: Exception? = null
    override fun run() {
        while (!isInterrupted) {
            try {
                if (!serverInitComplete) {
                    val messageString = readMessage()
                    if (proxyPipeTransport.serverInitComplete) {
                        serverInitComplete = true;
                        // not sure if this is needed
                        proxyPipeTransport.sendMessageToProxyClient(
                            messageString.toByteArray(StandardCharsets.UTF_8),
                            false
                        )
                    } else {
                        val message = ProxyServerUtil.gson().fromJson(messageString, JsonObject::class.java)
                        queue.put(message)
                    }
                } else {
                    proxyPipeTransport.sendMessageToProxyClient(readBytes(), true)
                }
            } catch (e: IOException) {
                if (!isInterrupted && !isClosing) {
                    exception = e
                }
                break
            } catch (e: InterruptedException) {
                break
            }
        }
    }

    @Throws(IOException::class)
    private fun readMessage(): String {
        val raw = readBytes()
        return String(raw, StandardCharsets.UTF_8)
    }

    private fun readBytes(): ByteArray {
        val len = readIntLE(`in`)
//        if (proxyPipeTransport.clientInitComplete) {
//            System.err.println("here after clientInitComplete")
//        }

        val raw = ByteArray(len)
        `in`.readFully(raw, 0, len)
        return raw
    }

    companion object {
        @Throws(IOException::class)
        fun readIntLE(`in`: DataInputStream): Int {
            val ch1 = `in`.read()
            val ch2 = `in`.read()
            val ch3 = `in`.read()
            val ch4 = `in`.read()
            return if (ch1 or ch2 or ch3 or ch4 < 0) {
                throw EOFException()
            } else {
                (ch4 shl 24) + (ch3 shl 16) + (ch2 shl 8) + (ch1 shl 0)
            }
        }
    }
}
