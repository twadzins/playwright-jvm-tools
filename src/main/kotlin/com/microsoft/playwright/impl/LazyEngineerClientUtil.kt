package com.microsoft.playwright.impl

import com.google.gson.JsonObject
import com.lazyengineer.playwright.cacheCliDirIfNeeded
import com.lazyengineer.playwright.proxy.client.PlaywrightClient
import com.lazyengineer.playwright.test.options
import com.microsoft.playwright.Browser
import com.microsoft.playwright.BrowserType
import com.microsoft.playwright.Page
import com.microsoft.playwright.Playwright
import java.io.IOException
import java.lang.management.ManagementFactory
import java.net.Socket
import java.nio.charset.StandardCharsets
import java.util.*
import kotlin.io.path.Path

object LazyEngineerClientUtil {

    fun initGson() {
        Serialization.gson()
    }


    internal fun getDefaultClient(baseUrl: String?, headed: Boolean): PlaywrightClient {
        val defaultTimeout = 2500.0
        val now = System.currentTimeMillis()

        if (System.getProperty("playwright.cli.dir") == null) {
            val cachedCliDir = cacheCliDirIfNeeded()
            System.setProperty("playwright.cli.dir", cachedCliDir)
        }

        val createOptions = Playwright.CreateOptions()
        val playwright = Playwright.create(createOptions)

        val useIncognito = false //TODO make this configurable

        if (useIncognito) {
            val browser = playwright.chromium().launch(options {
                headless = !headed
                args = listOf("--allow-file-access-from-files")

            })

            val context = browser.newContext(options { baseURL = baseUrl; bypassCSP = true})

            context.addInitScript("window.localStorage.clear();window.Cypress={};window.PlaywrightDebug={};")
            val page = context.newPage()

            println("getDefaultClient complete = ${System.currentTimeMillis() - now}")
            return PlaywrightClient(playwright, context, page)
        } else {
            //TODO make this configurable
            val persistentLaunchOptions =
                BrowserType.LaunchPersistentContextOptions()
                    .setHeadless(!headed)
                    .setArgs(listOf("--allow-file-access-from-files"))
                    .setBaseURL(baseUrl)
                    .setBypassCSP(true)

            val context =
                playwright.chromium().launchPersistentContext(Path("/tmp/foo"), persistentLaunchOptions)
            context.addInitScript("window.Cypress={};window.PlaywrightDebug={};")
            context.setDefaultTimeout(defaultTimeout)
            val page = context.pages()[0]

            println("getDefaultClient (not incog) complete = ${System.currentTimeMillis() - now}")
            return PlaywrightClient(playwright, context, page)
        }
    }

    private const val useRealUptimeLogging = false

    private val startMillis = System.currentTimeMillis()

    fun getUptime(): String {
        if (useRealUptimeLogging) {
            println("b4 getRuntimeMXBean = ${System.currentTimeMillis() - startMillis}")
            val s = "actual:${ManagementFactory.getRuntimeMXBean().uptime}"
            println("after123 getRuntimeMXBean = ${System.currentTimeMillis() - startMillis}")
            return s
        } else {
            return "relative:${System.currentTimeMillis() - startMillis}"
        }
    }

    @Throws(IOException::class)
    private fun createMessageBytes(message: String): ByteArray {
        val messageBytes = ("0000$message").toByteArray(StandardCharsets.UTF_8)
        val messageSize = messageBytes.size - 4
        messageBytes[0] = (messageSize ushr 0 and 255).toByte()
        messageBytes[1] = (messageSize ushr 8 and 255).toByte()
        messageBytes[2] = (messageSize ushr 16 and 255).toByte()
        messageBytes[3] = (messageSize ushr 24 and 255).toByte()

        return messageBytes
    }

    fun createProxy(options: Playwright.CreateOptions?): Pair<Playwright, PipeTransport> {
        var env: Map<String?, String?>? = emptyMap<String?, String>()
//    println("createProxy() 1   Uptime ${ManagementFactory.getRuntimeMXBean().uptime}")

        if (options?.env != null) {
            env = options.env
        }
        val localUtils: LocalUtils? = null
        // create InputStream from string
//    val message = "{}"
//    val messageBytes = createMessageBytes(message)


        try {
//        val inputStreamStatic = ByteArrayInputStream(messageBytes)
            val socket = Socket("localhost", 8185)
//        println("createProxy() 2   Uptime ${ManagementFactory.getRuntimeMXBean().uptime}")
//        val inputStream = socket.getInputStream()
            val pipeTransport = PipeTransport(socket.getInputStream(), socket.getOutputStream())
//        println("createProxy() 3   Uptime ${ManagementFactory.getRuntimeMXBean().uptime}")

            val connection = Connection(pipeTransport, env, localUtils)
//        println("createProxy() 4   Uptime ${ManagementFactory.getRuntimeMXBean().uptime}")

            val params = JsonObject()
            params.addProperty("sdkLanguage", "java")
            val playwright = connection.initializePlaywright()
//        println("createProxy() 5 after  initializePlaywright()  Uptime ${ManagementFactory.getRuntimeMXBean().uptime}")
//        val result: JsonElement = connection.sendMessage("someGuid","connect", params)
//        val playwright = connection.getExistingObject<PlaywrightImpl>(
//            result.getAsJsonObject().getAsJsonObject("playwright")["guid"].asString
//        )

            playwright.initSharedSelectors(null)
            return Pair(playwright, pipeTransport)
        } catch (e: Exception) {
            e.printStackTrace()
            throw e
        }

//    val playwright = connection.initializePlaywright()
////    playwright.driverProcess = p
//    playwright.initSharedSelectors(null)
//    return playwright
    }

    fun getRemoteDebugClient(port: Int, baseUrl: String?): PlaywrightClient {
        System.err.println("Loading debug client...")

        val now = System.currentTimeMillis()

        if (System.getProperty("playwright.cli.dir") == null) {
            val cachedCliDir = cacheCliDirIfNeeded()
            System.setProperty("playwright.cli.dir", cachedCliDir)
        }
        val playwright = Playwright.create()
//        val browser: Browser = playwright.chromium().connectOverCDP("http://localhost:9394")
        val browser: Browser = playwright.chromium().connectOverCDP("ws://localhost:9394/devtools/browser/dbe9852f-d10b-4a60-95cc-3b2644d42cce")
        val context = browser.contexts()[0]
        (context as BrowserContextImpl).setBaseUrl(baseUrl)
        val page = context.pages()[0]
        setTimeout(page)
        context.addInitScript("console.log(\"server initscript: clear ls, set window.PlaywrightDebug\");window.localStorage.clear();window.Cypress={};window.PlaywrightDebug={};")

//        context.addInitScript("window.localStorage.clear();window.Cypress={};window.PlaywrightDebug={};")

        println("getRemoteDebugClient complete = ${System.currentTimeMillis() - now}")

        return PlaywrightClient(playwright, context, page)

    }

    private fun setTimeout(page: Page) {
        page.setDefaultTimeout(2000.0)
        page.setDefaultNavigationTimeout(2000.0)
    }

}

//class ProxyPlaywrightImpl {
//
//}
