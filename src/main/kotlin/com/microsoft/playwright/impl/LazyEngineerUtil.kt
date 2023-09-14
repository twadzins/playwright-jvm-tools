package com.microsoft.playwright.impl

import com.lazyengineer.playwright.test.unwrap
import com.microsoft.playwright.Locator


class LazyEngineerUtil {

    companion object {
        fun initGson() {
            Serialization.gson()
        }

        @JvmStatic
        internal fun getLocatorString(locator: Locator): String = (unwrap(locator) as LocatorImpl).toProtocol().get("selector").asString
    }
}


