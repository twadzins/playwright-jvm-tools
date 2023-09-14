package com.microsoft.playwright.impl

import com.google.gson.JsonObject
import com.microsoft.playwright.Playwright
import java.net.Socket

object ProxyClientUtil {
    fun createProxy(options: Playwright.CreateOptions?): Pair<Playwright, PipeTransport> {
        var env: Map<String?, String?>? = emptyMap<String?, String>()

        if (options?.env != null) {
            env = options.env
        }
        val localUtils: LocalUtils? = null

        try {
            val socket = Socket("localhost", 8185)
            val pipeTransport = PipeTransport(socket.getInputStream(), socket.getOutputStream())

            val connection = Connection(pipeTransport, env, localUtils)

            val params = JsonObject()
            params.addProperty("sdkLanguage", "java")
            val playwright = connection.initializePlaywright()

            playwright.initSharedSelectors(null)
            return Pair(playwright, pipeTransport)
        } catch (e: Exception) {
            e.printStackTrace()
            throw e
        }
    }

}
