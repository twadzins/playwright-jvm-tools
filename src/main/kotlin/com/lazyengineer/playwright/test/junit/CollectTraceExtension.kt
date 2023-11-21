package com.lazyengineer.playwright.test.junit

import com.lazyengineer.playwright.proxy.client.playwrightClient
import com.microsoft.playwright.CLI
import com.microsoft.playwright.PlaywrightException
import com.microsoft.playwright.Tracing
import org.junit.jupiter.api.extension.AfterEachCallback
import org.junit.jupiter.api.extension.BeforeEachCallback
import org.junit.jupiter.api.extension.ExtensionContext
import java.nio.file.Paths
import kotlin.concurrent.thread

class CollectTraceExtension: AfterEachCallback, BeforeEachCallback {
    override fun beforeEach(context: ExtensionContext) {
        startPlaywrightTracing()
    }

    override fun afterEach(context: ExtensionContext)
    {
        stopPlaywrightTracing()
    }


    companion object {
        fun startPlaywrightTracing() {
            //        playwrightProxyClient.page.context().tracing().stop()
            playwrightClient.page.context().tracing().start(
                Tracing.StartOptions().setScreenshots(true).setSnapshots(true).setSources(true)
            )
        }

        fun stopPlaywrightTracing() {
            val tracePath = kotlin.io.path.createTempFile(Paths.get("./build/"), "trace-", ".zip")
            try {
                playwrightClient.page.context().tracing().stop(
                    Tracing.StopOptions().setPath(tracePath)
                )
            } catch (e: PlaywrightException) {
                println("Ignoring copy error = ${e.message}")
//                playwrightClient.page.context().tracing().stop()
            } finally {
                val tracePathString = tracePath.toRealPath().toString()
                println("Opening trace file ${tracePathString}")
                thread {
                    CLI.main(arrayOf("show-trace", tracePathString))
                }
            }
        }
    }
}
