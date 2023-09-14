package com.microsoft.playwright.impl

import com.microsoft.playwright.Playwright
import com.microsoft.playwright.PlaywrightException
import com.microsoft.playwright.impl.driver.Driver
import java.io.IOException


class ProxyServerUtil {
    companion object {
        fun createPlaywrightAndPipe(
            options: Playwright.CreateOptions?,
            forceNewDriverInstanceForTests: Boolean
        ): Pair<PlaywrightImpl, ProxyPipeTransport> {
            var env: Map<String?, String?>? = emptyMap<String?, String>()
            if (options?.env != null) {
                env = options.env
            }
            val driver = if (forceNewDriverInstanceForTests) {
                Driver.createAndInstall(env, true)
            } else {
                Driver.ensureDriverInstalled(env, true)
            }

            return try {
                val pb = driver.createProcessBuilder()
                pb.command().add("run-driver")
                pb.redirectError(ProcessBuilder.Redirect.INHERIT)
                val p = pb.start()
                val proxyPipeTransport = ProxyPipeTransport(p.inputStream, p.outputStream)
                val connection = Connection(proxyPipeTransport, env)
//            val connection = Connection(PipeTransport(p.inputStream, p.outputStream), env)
                val result = connection.initializePlaywright()
//            result.driverProcess = p //TODO: handle closing this properly
                result.initSharedSelectors(null)
                Pair(result, proxyPipeTransport)
            } catch (e: IOException) {
                throw PlaywrightException("Failed to launch driver", e)
            }
        }

        fun gson() = Serialization.gson()

        internal fun toMessage(messageString: String) =
            Serialization.gson().fromJson(messageString, Message::class.java)

    }

}
