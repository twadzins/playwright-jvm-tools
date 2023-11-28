package com.lazyengineer.playwright.proxy.client

import com.lazyengineer.playwright.test.extensions.getPrivateProperty
import com.lazyengineer.playwright.test.options
import com.microsoft.playwright.BrowserContext
import com.microsoft.playwright.Page
import com.microsoft.playwright.Playwright
import com.microsoft.playwright.PlaywrightException
import com.microsoft.playwright.impl.LazyEngineerClientUtil
import java.io.File
import java.io.FileInputStream
import java.util.Properties

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
    val baseUrl = playwrightProperties["baseUrl"] as String?
    when(playwrightProperties.getProperty("client", "default")) {
        "default" -> LazyEngineerClientUtil.getDefaultClient(baseUrl, playwrightProperties.getProperty("headed", "true").toBoolean())
        "chromeCDP" -> {
            val port = playwrightProperties.getProperty("chromeCDPPort")?.toInt() ?: throw IllegalArgumentException("chromeCDPPort must be set when client is chromeCDP, in ${configPropertiesFile.absoluteFile}")
            LazyEngineerClientUtil.getRemoteDebugClient(port, baseUrl)
        }
        else -> throw IllegalArgumentException("Unknown 'client' property in $configPropertiesFile, expected either 'default' or 'chromeCDP'")
    }
}

data class PlaywrightClient(val playwright: Playwright, val context: BrowserContext, val page: Page) {
    private val teardownListeners: MutableList<() -> Unit> = mutableListOf()

    var isFirstPage = true

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
        if (page != null) {
            val routes = page.getPrivateProperty("routes")?.getPrivateProperty("routes") as MutableList<*>?
                ?: throw PlaywrightException("Internal page.routes.routes not found via reflection. Perhaps the internal impl has changed... ")
            if (routes.isNotEmpty()) {
                routes.clear()

                // force an update of the backend routes which will clear all routes
                page.unroute("") // path doesn't matter
            }
        }
    }

    fun newPage(): Page {
        if (isFirstPage) {
            isFirstPage = false;
            return page;
        }
        val page = context.newPage()
//        thread { //faster, but seems to cause "Object doesn't exist: request@5b1d77df2ed3d96f1b808ef8d0e38c9e" errors
        //seems to run fast in something like RepeatedTest but not on a single keep junit running followup run
            closeAllButLastPage()
//        }
        return page
    }

    fun closeAllButLastPage() {
        context.pages().dropLast(1).forEach {
            it.close(options { runBeforeUnload = false })
        }
    }

}
