package com.lazyengineer.playwright.test

import com.microsoft.playwright.Locator

interface LocatorValueClass {
    val delegate: LocatorDelegate2

    val wrappedLocator: Locator
        get() = delegate.getWrappedLocator()
}
