package com.lazyengineer.playwright.test

import com.lazyengineer.playwright.proxy.client.playwrightClient
import com.microsoft.playwright.impl.LazyEngineerClientUtil.initGson
import kotlin.concurrent.thread


object TestInit {
    fun initTestsAsync() {
        thread(name = "gson init") {
            initGson()
        }
        thread(name = "playwright init") {
            playwrightClient
        }
    }
}
