package com.lazyengineer.playwright.proxy.server

import com.lazyengineer.playwright.cacheCliDirIfNeeded
import com.microsoft.playwright.*
import com.microsoft.playwright.impl.ProxyPipeTransport
import com.microsoft.playwright.impl.ProxyServerUtil
import java.net.ServerSocket
import kotlin.io.path.Path


class ProxyPlaywrightServer {
    private lateinit var context: BrowserContext
    private lateinit var playwright: Playwright
    private lateinit var proxyPipeTransport: ProxyPipeTransport
    private var serverSocket: ServerSocket? = null
    fun start(port: Int) {

        cacheCliDirIfNeeded()

        val createOptions = Playwright.CreateOptions()
//        val javaSrcDir = "/Users/tomwadzinski/IdeaProjects/reaper-web/preset-browser-playwright/src/main/kotlin"
        val javaSrcDir =
            "/Users/tomwadzinski/IdeaProjects/reaper-web/preset-browser-playwright/src/main/kotlin:/Users/tomwadzinski/IdeaProjects/reaper-web/playwrightproxy-client-minimal/src/test/kotlin"
//        val javaSrcDir = "/Users/tomwadzinski/IdeaProjects/playwrightproxy-client-minimal/playwrightproxy-client-minimal/src/test/kotlin"
        if (javaSrcDir != null) {
            createOptions.setEnv(mapOf("PLAYWRIGHT_JAVA_SRC" to javaSrcDir))
        }
        val playwrightAndPipe = ProxyServerUtil.createPlaywrightAndPipe(createOptions, false)
        playwright = playwrightAndPipe.first
        proxyPipeTransport = playwrightAndPipe.second

        val (context, _) = initBrowser(playwright)


//        if (javaSrcDir != null) {
//            newPage.navigate("about:blank")
//        }

        proxyPipeTransport.serverInitComplete = true


//        newPage.navigate("file:///Users/tomwadzinski/Library/Application%20Support/REAPER/reaper_www_root/index.html")
//        System.err.println("***** after navigate()\n")
//        println("newPage = ${newPage}")


        serverSocket = ServerSocket(port)
        var i = 0
        //TODO: have some way for this to timeout/be cancelled
        while (true) {
            i++
            println("i = ${i}")
            proxyPipeTransport.setProxyClientSocket(serverSocket!!.accept(), context)
//            if (i == 2) {
//                System.exit(0)
//            }
            //TODO: prevent concurrent sockets
        }
    }


    fun stop() {
        serverSocket!!.close()
    }


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            ProxyPlaywrightServer().start(8185)
        }

        fun initBrowser(playwright: Playwright): Pair<BrowserContext, Page> {
            val useIncognito = false
            val headless = false
            return if (useIncognito) {
                val launchOptions =
                    BrowserType.LaunchOptions().setHeadless(headless).setArgs(listOf("--allow-file-access-from-files"))

                //needed for "cypress realworld" testing
                //            playwright.selectors().setTestIdAttribute("data-test");

                val browser = playwright.chromium().launch(launchOptions)
                System.err.println("***** after launch()")

                val context = browser.newContext(Browser.NewContextOptions().setBaseURL("http://localhost:3000"))
                context.addInitScript("console.log(\"server initscript: clear ls, set window.PlaywrightDebug\");window.localStorage.clear();window.Cypress={};window.PlaywrightDebug={};")

                System.err.println("***** after newContext()\n")
                val page = context.newPage()
                setTimeout(page)
                System.err.println("***** after newPage()\n")
                Pair(context, page)
            } else {
                val persistentLaunchOptions =
                    BrowserType.LaunchPersistentContextOptions().setHeadless(headless)
                        .setArgs(listOf("--allow-file-access-from-files"))

                val context =
                    playwright.chromium().launchPersistentContext(Path("/tmp/foo"), persistentLaunchOptions)
                context.addInitScript("console.log(\"server initscript: clear ls, set window.PlaywrightDebug\");window.localStorage.clear();window.Cypress={};window.PlaywrightDebug={};")
                val page = context.pages()[0]
                setTimeout(page)
                Pair(context, page)
            }
        }

        private fun setTimeout(page: Page) {
            page.setDefaultTimeout(2000.0)
            page.setDefaultNavigationTimeout(2000.0)
        }

    }

}
