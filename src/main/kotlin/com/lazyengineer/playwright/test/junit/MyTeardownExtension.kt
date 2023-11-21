package com.lazyengineer.playwright.test.junit

import com.lazyengineer.playwright.proxy.client.playwrightClient
import com.microsoft.playwright.CLI
import com.microsoft.playwright.PlaywrightException
import com.microsoft.playwright.Tracing
import org.junit.jupiter.api.extension.AfterEachCallback
import org.junit.jupiter.api.extension.ExtensionContext
import java.nio.file.Paths

class MyTeardownExtension: AfterEachCallback {

    override fun afterEach(context: ExtensionContext?)
    {
//        println("5System.currentTimeMillis() = ${System.currentTimeMillis()}")
        playwrightClient.onTeardown()
//        println("6System.currentTimeMillis() = ${System.currentTimeMillis()}")
    }

}
