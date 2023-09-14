package com.lazyengineer.playwright.test

import com.lazyengineer.playwright.client.playwrightClient
import com.microsoft.playwright.impl.LazyEngineerUtil.Companion.initGson
import kotlin.concurrent.thread


object TestInit {
    /**
     * Init slow resources in threads to speed up start time
     */
    fun initTestsAsync() {
        thread(name = "gson init") {
            initGson()
        }
        thread(name = "playwright init") {
            playwrightClient
        }
    }
}
