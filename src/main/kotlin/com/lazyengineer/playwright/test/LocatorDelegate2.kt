package com.lazyengineer.playwright.test

import com.microsoft.playwright.Locator
import com.microsoft.playwright.options.AriaRole

/**
 * TODO: when k2 bug(https://youtrack.jetbrains.com/issue/KT-60876/K2-NoSuchMethodError-when-a-value-class-method-is-called-where-the-value-class-uses-delegation-and-the-delegate-is-a-Java) is fixed, get rid of K2JavaInterfaceWorkaroundLocatorDelegate and K2JavaInterfaceWorkaroundLocator
 */
open class LocatorDelegate2(val l: Locator) : Locator by l, K2JavaInterfaceWorkaroundLocator {
    override fun press(key: String?) {
        l.press(key)
    }

    override fun locator(selectorOrLocator: String?): Locator {
        return l.locator(selectorOrLocator)
    }

    override fun locator(selectorOrLocator: Locator?): Locator {
        return l.locator(selectorOrLocator)
    }

    override fun getByText(text: String?): Locator {
        return l.getByText(text)
    }

    override fun getByRole(role: AriaRole?): Locator {
        return l.getByRole(role)
    }

    override fun getByPlaceholder(text: String?): Locator {
        return l.getByPlaceholder(text)
    }
    fun getWrappedLocator() = l
}

/**
 * TODO: when k2 bug(https://youtrack.jetbrains.com/issue/KT-60876/K2-NoSuchMethodError-when-a-value-class-method-is-called-where-the-value-class-uses-delegation-and-the-delegate-is-a-Java) is fixed, get rid of K2JavaInterfaceWorkaroundLocatorDelegate and K2JavaInterfaceWorkaroundLocator
 */
interface K2JavaInterfaceWorkaroundLocator: Locator {
    override fun press(key: String?)
    override fun locator(selectorOrLocator: String?): Locator
    override fun locator(selectorOrLocator: Locator?): Locator
    override fun getByText(text: String?): Locator
    override fun getByPlaceholder(text: String?): Locator
    override fun getByRole(role: AriaRole?): Locator
}
