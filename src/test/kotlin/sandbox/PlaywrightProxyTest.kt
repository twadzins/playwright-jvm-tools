package sandbox

import com.lazyengineer.playwright.client.playwrightClient
import com.microsoft.playwright.Page
import com.microsoft.playwright.Route
import com.microsoft.playwright.impl.LazyEngineerUtil.Companion.initGson
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder
import kotlin.concurrent.thread

//import java.lang.management.ManagementFactory

@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
class PlaywrightProxyTest {
    companion object {
        init {
            System.err.println("in init")

//            println("in init Uptime ${ManagementFactory.getRuntimeMXBean().uptime}")
            thread(name = "gson init") {
//                System.err.println("gson init 1")
                initGson()
//                System.err.println("gson init 2")
            }
            thread(name = "playwright init") {
//                System.err.println("playwright init 1")
                playwrightClient
//                System.err.println("playwright init 2")

            }

        }
//        @JvmStatic
//        fun main(args: Array<String>) {
//            PlaywrightProxyTest().testProxy()
//        }
    }

    fun Page.supressCss() {
        route("**/*.{css}") {
            it.fulfill(
                Route.FulfillOptions().setBody("").setContentType("application/javascript")
                    .setStatus(200)
            );
        }
    }

    @Order(1)
    @Test
    fun testProxyANothing() {
    }

    @Order(2)
    @Test
    fun testProxyJustInit() {
        val (playwright, context, page) = playwrightClient
    }

    @Order(3)
    @Test
    fun testProxyToTheAboutBlankPage() {
        val (playwright, context, page) = playwrightClient

//        page.supressCss()

        page.navigate("about:blank")
//        context.newPage().apply {
//            navigate("file:///Users/tomwadzinski/Library/Application%20Support/REAPER/reaper_www_root/index.html")
//        }
//        transport.close()
    }

    @Order(4)
    @Test
    fun testProxyToRealPage() {
        val (playwright, context, page) = playwrightClient

//        page.supressCss()

        page.navigate("file:///Users/tomwadzinski/Library/Application%20Support/REAPER/reaper_www_root/index.html")
//        context.newPage().apply {
//            navigate("file:///Users/tomwadzinski/Library/Application%20Support/REAPER/reaper_www_root/index.html")
//        }
//        transport.close()
    }

    @Order(5)
    @Test
    fun testProxyToRealPageWithSupressCss() {
        System.err.println("in testProxy2")
        val (playwright, context, page) = playwrightClient
        page.supressCss()
        System.err.println("in testProxy2 2")

        page.navigate("file:///Users/tomwadzinski/Library/Application%20Support/REAPER/reaper_www_root/index.html")
    }

    @Order(6)
    @Test
    fun testProxyToRealPageWithSupressCssAndOthers() {
        System.err.println("in testProxy2")
        val (playwright, context, page) = playwrightClient
        page.supressCss()
        System.err.println("in testProxy2 2")

        page.navigate("file:///Users/tomwadzinski/Library/Application%20Support/REAPER/reaper_www_root/index.html")
//        Thread.sleep(2000)
        page.navigate("about:blank")
        page.navigate("file:///Users/tomwadzinski/Library/Application%20Support/REAPER/reaper_www_root/index.html")
//        context.newPage().apply {
//            println("after new tab  Uptime ${ManagementFactory.getRuntimeMXBean().uptime}")
//            navigate("file:///Users/tomwadzinski/Library/Application%20Support/REAPER/reaper_www_root/index.html")
//            println("after new tab navigate  Uptime ${ManagementFactory.getRuntimeMXBean().uptime}")
//            close()
//        }
    }

    @Order(7)
    @Test
    fun testProxyToRealPageWithSupressCssAndNewPage() {
        System.err.println("in testProxy2")
        val (playwright, context, page) = playwrightClient
        page.supressCss()
        System.err.println("in testProxy2 2")

        page.navigate("file:///Users/tomwadzinski/Library/Application%20Support/REAPER/reaper_www_root/index.html")
//        Thread.sleep(2000)
        page.navigate("about:blank")
        page.navigate("file:///Users/tomwadzinski/Library/Application%20Support/REAPER/reaper_www_root/index.html")
        context.newPage().apply {
            navigate("file:///Users/tomwadzinski/Library/Application%20Support/REAPER/reaper_www_root/index.html")
            close()
        }
    }

    @Order(8)
    @Test
    fun testProxyToNewAboutBlankPage() {
        val (playwright, context, page) = playwrightClient
        context.newPage().apply {
            navigate("file:///Users/tomwadzinski/Library/Application%20Support/REAPER/reaper_www_root/index.html")
            close()
        }
    }

}
