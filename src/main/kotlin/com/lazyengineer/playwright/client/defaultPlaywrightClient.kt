package com.lazyengineer.playwright.client

import com.lazyengineer.playwright.cacheCliDirIfNeeded
import com.lazyengineer.playwright.test.options
import com.microsoft.playwright.Playwright
import kotlin.io.path.Path

internal fun getDefaultClient(): PlaywrightClient {
    val now = System.currentTimeMillis()
    //        println("in test  Uptime ${ManagementFactory.getRuntimeMXBean().uptime}")

    cacheCliDirIfNeeded()
//        System.setProperty("playwright.driver.impl", "playwrightexample.ProxyDriverJar")
    val createOptions = Playwright.CreateOptions()
    val playwright = Playwright.create(createOptions)


    val incognito = false

    if (!incognito) {
        val context =
            playwright.chromium().launchPersistentContext(Path("/tmp/pw-persistent-context"), options {
                headless = false
                args = listOf("--allow-file-access-from-files")
            })
        context.addInitScript("console.log(\"server initscript: clear ls, set window.PlaywrightDebug\");window.localStorage.clear();window.Cypress={};window.PlaywrightDebug={};")
        val page = context.pages()[0]
        setPageTimeout(page)

        println("getDefaultClient (incognito) complete = ${System.currentTimeMillis() - now}")

        return PlaywrightClient(playwright, context, page)
    } else {
        val browser = playwright.chromium().launch(options {
            headless = false
            args = listOf("--allow-file-access-from-files")
        })

        //TODO: get optional baseurl from properties file (but test specific somehow)
        val context = browser.newContext()
//        val context = browser.newContext(options { baseURL = "http://localhost:3000" })

        val page = context.newPage()
        context.addInitScript("window.localStorage.clear();window.Cypress={};window.PlaywrightDebug={};")

        setPageTimeout(page)

        println("getDefaultClient (incognito) complete = ${System.currentTimeMillis() - now}")

        return PlaywrightClient(playwright, context, page)

    }

}
