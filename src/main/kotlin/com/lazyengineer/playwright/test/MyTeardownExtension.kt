package com.lazyengineer.playwright.test

import com.lazyengineer.playwright.client.playwrightClient
import org.junit.jupiter.api.extension.AfterEachCallback
import org.junit.jupiter.api.extension.ExtensionContext

class MyTeardownExtension: AfterEachCallback {

    override fun afterEach(context: ExtensionContext?)
    {
//        println("5System.currentTimeMillis() = ${System.currentTimeMillis()}")
        playwrightClient.onTeardown()
//        println("6System.currentTimeMillis() = ${System.currentTimeMillis()}")
    }

}
