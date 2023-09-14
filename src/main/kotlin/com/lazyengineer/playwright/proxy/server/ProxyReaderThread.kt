package com.lazyengineer.playwright.proxy.server

import com.microsoft.playwright.impl.ProxyPipeTransport
import java.io.DataInputStream
import java.io.EOFException
import java.io.IOException
import java.nio.charset.StandardCharsets
import kotlin.system.measureNanoTime

/**
 * Handles request from the proxy client, forwards to the parent pipe transport
 */
internal class ProxyReaderThread(
    private val `in`: DataInputStream, // in from the proxy client
    private val proxyPipeTransport: ProxyPipeTransport
) :
    Thread() {

    @Volatile
    var isClosing = false

    @Volatile
    var exception: Exception? = null

    override fun run() {
        while (!isInterrupted) {
            try {
                if (!proxyPipeTransport.clientInitComplete) {
                    val messageString = readMessage()
                    if (isInterrupted) {
                        System.err.println("\n  Interrupted TODO: do better socket close handling\n")
                        return
                    }

                    if (ProxyPipeTransport.isApiLoggingEnable) {
                        System.err.println("Proxy Init ◀ RECV $messageString")
                    }

                    val serializeAndSendTime = measureNanoTime {
                        proxyPipeTransport.sendInitResponseToProxyClient(messageString)
                    }
                    System.err.println("${System.currentTimeMillis()} *  * init message serializeAndSendTime (ms):" + serializeAndSendTime / 1000000.0)
                } else {
                    proxyPipeTransport.sendMessageToJsProcess(readBytes())
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
