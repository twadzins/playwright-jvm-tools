package com.lazyengineer.playwright.proxy.client

import com.lazyengineer.playwright.client.PlaywrightClient
import com.lazyengineer.playwright.proxy.server.ProxyPlaywrightServer
import com.microsoft.playwright.Playwright
import com.microsoft.playwright.impl.ProxyClientUtil

internal fun getProxyClient(): PlaywrightClient {

    val createOptions = Playwright.CreateOptions()

//        val javaSrcDir = null
////        val javaSrcDir = "/Users/tomwadzinski/IdeaProjects/reaper-web/preset-browser-playwright/src/main/kotlin:/Users/tomwadzinski/IdeaProjects/reaper-web/playwrightproxy-client-minimal/src/test/kotlin"
////        val javaSrcDir = "/Users/tomwadzinski/IdeaProjects/playwrightproxy-client-minimal/playwrightproxy-client-minimal/src/test/kotlin"
//        if (javaSrcDir != null) {
//            createOptions.setEnv(mapOf("PLAYWRIGHT_JAVA_SRC" to javaSrcDir))
//        }

    val (playwright, transport) = ProxyClientUtil.createProxy(createOptions)

    val (context, page) = ProxyPlaywrightServer.initBrowser(playwright)
    return PlaywrightClient(playwright, context, page)
//        val useIncognito = false
//        if (useIncognito) {
//            val launchOptions =
//                BrowserType.LaunchOptions().setHeadless(false).setArgs(listOf("--allow-file-access-from-files"))
//            val browser = playwright.chromium().launch(launchOptions)
////            System.err.println("***** after launch(): ${getUptime()}")
//
//            val context = browser.newContext()
//
//            //This must be here to match proxy server call, does nothing...
//            context.addInitScript("")
//
////            System.err.println("***** after newContext(): ${getUptime()}")
//            val page = context.newPage()
////            System.err.println("***** after newPage(): ${getUptime()}")
//
//            // end cached calls
//
//            //Might be good to do for less flakiness (currently we only do on teardown to speed up "single test speed"
////            page.addInitScript("window.localStorage.clear()")
//
//            return PlaywrightProxyClient(page, context, playwright)
//
//        } else {
//            val persistentLaunchOptions =
//                BrowserType.LaunchPersistentContextOptions().setHeadless(false)
//                    .setArgs(listOf("--allow-file-access-from-files"))
//
//            val context =
//                playwright.chromium().launchPersistentContext(Path("/tmp/foo"), persistentLaunchOptions)
//            //This must be here to match proxy server call, does nothing...
//            context.addInitScript("")
//
//            // end cached calls
//            return PlaywrightProxyClient(context.pages()[0], context, playwright)
//
////            val newPage = context.newPage()
//        }
////        println("after createProxy   Uptime ${ManagementFactory.getRuntimeMXBean().uptime}")
//    //This is proxied and will return the existing cached browser instance results
//    val browser = playwright.chromium().launch()
////    System.err.println("launch() complete = ${System.currentTimeMillis()-now}")
//
////        println("after launch  Uptime ${ManagementFactory.getRuntimeMXBean().uptime}")
//
////        val context = browser.newContext()
////        val newPage = context.newPage()
//
//    val context = browser.newContext()
////    System.err.println("addInitScript() complete = ${System.currentTimeMillis()-now}")
//    context.addInitScript("window.localStorage.clear()")
//
////    System.err.println("newContext() complete = ${System.currentTimeMillis()-now}")
////        println("after newContext   Uptime ${ManagementFactory.getRuntimeMXBean().uptime}")
//    val page = context.newPage()

}
