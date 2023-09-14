package com.lazyengineer.playwright.misc

import com.lazyengineer.playwright.cacheCliDirIfNeeded
import com.microsoft.playwright.BrowserContext
import com.microsoft.playwright.BrowserType
import com.microsoft.playwright.Playwright
//import org.junit.jupiter.api.extension.BeforeAllCallback
//import org.junit.jupiter.api.extension.ExtensionContext
import java.lang.management.ManagementFactory


//class PlaywrightJunitExtension : BeforeAllCallback, ExtensionContext.Store.CloseableResource {
class PlaywrightJunitExtension {

//
//    override fun beforeAll(context: ExtensionContext?) {
//        if (browserContexts.isNotEmpty()) {
//            initBrowsers("/sdf")
//        }
//    }
//
//
//    override fun close() {
////        browserContexts.forEach(BrowserContext::close)
////        playwright.close()
//    }

    companion object {
        private var playwright: Playwright? = null

        fun initBrowsers(javaSrcDir: String?) {
            println("uptime at start of initBrowsers = ${ManagementFactory.getRuntimeMXBean().uptime}")
            playwright?.close()

            cacheCliDirIfNeeded()

            val createOptions = Playwright.CreateOptions()
            if (javaSrcDir != null) {
                createOptions.setEnv(mapOf("PLAYWRIGHT_JAVA_SRC" to javaSrcDir))
            }
            println("uptime b4    create = ${ManagementFactory.getRuntimeMXBean().uptime}")
            playwright = Playwright.create(createOptions)!!
            println("uptime after create = ${ManagementFactory.getRuntimeMXBean().uptime}")
            val playwrightInner = playwright!!
            val browserTypes: List<BrowserType> = listOf(
                playwrightInner.chromium(),
                //            playwright.webkit(),
                //            playwright.firefox()
            )
            val launchOptions =
                BrowserType.LaunchOptions().setHeadless(false).setArgs(listOf("--allow-file-access-from-files"))
            browserContexts = browserTypes.map {
//                val wsConnection = it.connect("ws://127.0.0.1:60194/")
//                wsConnection.newContext()

                it.connect("ws://127.0.0.1:60736/").newContext()
//                it.connectOverCDP("http://localhost:9222").contexts()[0]
//                it.launch(launchOptions).newContext()
            }
        }

        var browserContexts: List<BrowserContext> = emptyList()

        fun clearContexts() {
            browserContexts = emptyList()
        }

        fun initContextsIfNeeded(javaSrcDir: String?): Boolean {
            if (browserContexts.isEmpty()) {
                println("Init browser context...")
                initBrowsers(javaSrcDir)
                return true
            } else {
                return false
            }
        }
    }
}
