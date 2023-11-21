package com.lazyengineer.playwright.proxy.client

import com.lazyengineer.playwright.test.extensions.getPrivateProperty
import com.microsoft.playwright.BrowserContext
import com.microsoft.playwright.Page
import com.microsoft.playwright.Playwright
import com.microsoft.playwright.PlaywrightException
import com.microsoft.playwright.impl.LazyEngineerClientUtil
import java.io.File
import java.io.FileInputStream
import java.lang.IllegalArgumentException
import java.util.*

private lateinit var playwrightProperties: Properties


val playwrightClient by lazy {
    val configPropertiesFile = File("playwright-config.properties")

    playwrightProperties = Properties()
    if (configPropertiesFile.exists()) {
        FileInputStream(configPropertiesFile).use {
            playwrightProperties.load(it)
        }
        println("Using playwright properties from ${configPropertiesFile.absoluteFile}...")
    }

    when(playwrightProperties.getProperty("client", "default")) {
        "default" -> LazyEngineerClientUtil.getDefaultClient()
        "chromeCDP" -> {
            val port = playwrightProperties.getProperty("chromeCDPPort")?.toInt() ?: throw IllegalArgumentException("chromeCDPPort must be set when client is chromeCDP, in ${configPropertiesFile.absoluteFile}")
            LazyEngineerClientUtil.getRemoteDebugClient(port)
        }
        else -> throw IllegalArgumentException("Unknown 'client' property in $configPropertiesFile, expected either 'default' or 'chromeCDP'")
    }
}

data class PlaywrightClient(val playwright: Playwright, val context: BrowserContext, val page: Page) {
    private val teardownListeners: MutableList<() -> Unit> = mutableListOf()

    fun onTeardown() {
        clearRoutes()
        for (teardownListener in teardownListeners) {
            teardownListener.invoke()
        }
    }

    fun addTestListener(function: () -> Unit) {
        teardownListeners += function
    }

    private fun clearRoutes() {
        val routes = page.getPrivateProperty("routes")?.getPrivateProperty("routes") as MutableList<*>?
            ?: throw PlaywrightException("Internal page.routes.routes not found via reflection. Perhaps the internal impl has changed... ")
        if (routes.isNotEmpty()) {
            routes.clear()

            // force an update of the backend routes which will clear all routes
            page.unroute("") // path doesn't matter
        }
    }

}
