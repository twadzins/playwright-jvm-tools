package com.lazyengineer.playwright.test

import java.lang.management.ManagementFactory
import kotlin.properties.Delegates

object timing {
    private val showInitTiming = false
    private var appStartMillis by Delegates.notNull<Long>()

    init {
        val initMillis = System.currentTimeMillis()
        appStartMillis = ManagementFactory.getRuntimeMXBean().startTime
        if (showInitTiming) {
            System.err.println("timingInit init elapsed: ${System.currentTimeMillis() - appStartMillis} getRuntimeMXBean() millis:${System.currentTimeMillis() - initMillis}")
        }
    }

    val elapsed get() = System.currentTimeMillis() - appStartMillis

}

