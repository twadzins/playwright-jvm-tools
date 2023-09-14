package com.lazyengineer.playwright.proxy.server

import com.microsoft.playwright.impl.ProxyPipeTransport
import java.io.IOException
import java.io.OutputStream
import java.nio.charset.StandardCharsets
import java.util.concurrent.BlockingQueue

/**
 * Writes to pw js process
 */
internal class PlaywrightWriterThread(
    val out: OutputStream,
    private val queue: BlockingQueue<String>,
    val proxyPipeTransport: ProxyPipeTransport
) : Thread() {

    override fun run() {
        while (!isInterrupted) {
            try {
                if (proxyPipeTransport.clientInitComplete) {
                    println("break here")
                }
                if (queue.isEmpty()) out.flush()
                sendMessage(queue.take())
            } catch (e: IOException) {
                if (!isInterrupted) e.printStackTrace()
                break
            } catch (e: InterruptedException) {
                break
            }
        }
    }

    @Throws(IOException::class)
    private fun sendMessage(message: String) {
        val bytes = message.toByteArray(StandardCharsets.UTF_8)
//        if (proxyPipeTransport.clientInitComplete) {
//            System.err.println("here after clientInitComplete")
//        }

        writeIntLE(out, bytes.size)
        out.write(bytes)
    }

    companion object {
        @Throws(IOException::class)
        fun writeIntLE(out: OutputStream, v: Int) {
            out.write(v ushr 0 and 255)
            out.write(v ushr 8 and 255)
            out.write(v ushr 16 and 255)
            out.write(v ushr 24 and 255)
        }
    }
}
