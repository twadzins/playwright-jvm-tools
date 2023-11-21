package com.microsoft.playwright.impl

import com.microsoft.playwright.Locator

class LazyEngineerUtil {
    companion object {
        @JvmStatic
        internal fun getLocatorString(locator: Locator): String = (locator as LocatorImpl).toProtocol().get("selector").asString
    }
}


