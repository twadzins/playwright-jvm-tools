package com.lazyengineer.playwright.client

import com.lazyengineer.playwright.cacheCliDirIfNeeded
import com.microsoft.playwright.Browser
import com.microsoft.playwright.Playwright

fun getRemoteDebugClient(port: Int): PlaywrightClient {
    System.err.println("Loading debug client on port $port...")

    val now = System.currentTimeMillis()

    cacheCliDirIfNeeded()

    val playwright = Playwright.create()
    val browser: Browser = try {
        playwright.chromium().connectOverCDP("http://localhost:$port")
    } catch (e: Exception) {
        throw RuntimeException("""
            Unable to connect to remote chrome instance on port $port
            To start a chrome instance with remote debugging, add the following arguments to the chrome executable call:
            --remote-debugging-port=$port --user-data-dir=path/to/custom/folder
            
            """.trimIndent(), e)
    }
    val context = browser.contexts()[0]
    val page = context.pages()[0]
    setPageTimeout(page)
    context.addInitScript("console.log(\"server initscript: clear ls, set window.PlaywrightDebug\");window.localStorage.clear();window.Cypress={};window.PlaywrightDebug={};")

    println("getRemoteDebugClient() millis: ${System.currentTimeMillis() - now}")

    return PlaywrightClient(playwright, context, page)

}
