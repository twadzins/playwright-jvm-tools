package com.lazyengineer.playwright.test

import com.lazyengineer.playwright.client.playwrightClient
import com.microsoft.playwright.Playwright
import com.microsoft.playwright.PlaywrightException
import com.microsoft.playwright.impl.driver.Driver
import org.junit.jupiter.api.extension.AfterEachCallback
import org.junit.jupiter.api.extension.BeforeEachCallback
import org.junit.jupiter.api.extension.ExtensionContext
import java.nio.file.Paths
import java.util.*
import kotlin.concurrent.thread

class CollectTraceExtension : AfterEachCallback, BeforeEachCallback {
    override fun beforeEach(context: ExtensionContext) {
        startPlaywrightTracing()
    }

    override fun afterEach(context: ExtensionContext) {
        stopPlaywrightTracing()
    }


    companion object {
        init {
            Runtime.getRuntime().addShutdownHook(Thread {
                System.err.println("Stopping trace viewer on jvm shutdown (To keep open, use KeepJunitRunning Intellij plugin)")
                stopTraceViewerProcess()
            })
        }

        private var previousTraceProcess: Process? = null

        fun startPlaywrightTracing() {
            stopTraceViewerProcess()

            // first, blank out the page so that the trace doesn't show any previous content (in the event that we are reusing this page)
            val page = playwrightClient.page
            page.evaluate("document.body.innerHTML = '';")

            page.context().tracing().start(options {
                screenshots = true
                snapshots = true
                sources = true
            })
        }

        private fun stopTraceViewerProcess() {
            previousTraceProcess?.apply {
                //kill underlying node process (otherwise is stays alive)
                children().forEach { it.destroy() }
                destroy()
            }
        }

        fun stopPlaywrightTracing() {
            val tracePath = kotlin.io.path.createTempFile(Paths.get("./build/"), "trace-", ".zip")
            try {
                playwrightClient.page.context().tracing().stop(options { path = tracePath })
            } catch (e: PlaywrightException) {
                println("Ignoring copy error = ${e.message}")
            } finally {
                val tracePathString = tracePath.toRealPath().toString()
                println("Opening trace file ${tracePathString}")
                val traceProcess = createCliProcess(arrayOf("show-trace", tracePathString))
                previousTraceProcess = traceProcess
                thread {
                    traceProcess.waitFor()
                }
            }
        }

        private fun createCliProcess(args: Array<String>): Process {
            val driver = Driver.ensureDriverInstalled(emptyMap(), false)
            val processBuilder = driver.createProcessBuilder()
            processBuilder.inheritIO()
            processBuilder.command().addAll(Arrays.asList(*args))
            val version = Playwright::class.java.getPackage().implementationVersion
            if (version != null) {
                processBuilder.environment()["PW_CLI_DISPLAY_VERSION"] = version
            }
            return processBuilder.start()
        }
    }
}
