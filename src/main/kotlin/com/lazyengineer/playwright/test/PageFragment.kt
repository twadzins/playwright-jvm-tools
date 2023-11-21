package com.lazyengineer.playwright.test

import com.lazyengineer.playwright.test.generated.GeneratedLocatorImpl
import com.microsoft.playwright.Frame
import com.microsoft.playwright.Locator
import com.microsoft.playwright.Page


//NOTE: some playwright internals (like LocatorAssertionsImpl) required that any class implementing Locator must be or extend LocatorImpl,
// so we must extend it rather than using delegation...
/**
 * PageFragment is an extension of Locator (and LocatorAssertionsImpl).
 * It offers the following features:
 * - Narrows the locator scope to a subsection of a page/frame
 * - No longer think in terms of Page vs frame vs locator. Everything is basically a locator call
 *     - This is handy when making helper/extension functions, because you don't need a Page/Locator/Frame version of each function.
 * - Can be extended to add "Page Object" functionality while still retaining direct access to Locator functions
 * - has highlightElementNearFailure functionality
 */
open class PageFragment(private val locator: Locator, val frame: Frame? = null) : GeneratedLocatorImpl(locator) {
    constructor(page: Page) : this(page.locator("body"))
    constructor(frame: Frame) : this(frame.locator("body"), frame)
}


inline fun <reified T : PageFragment> Page.navigateTo(url: String): T {
    navigate(url)

    return toPageFragment<T>()
}

inline fun <reified T : PageFragment> Page.toPageFragment(): T =
    T::class.java.getDeclaredConstructor(Locator::class.java).newInstance(this.locator("body"))

inline fun <reified T : PageFragment> Locator.toPageFragment(): T {
    if (T::class.java == PageFragment::class.java) {
        return PageFragment(this) as T
    }
    return T::class.java.getDeclaredConstructor(Locator::class.java).newInstance(this)
}

fun Frame.toPageFragment() = PageFragment(this)

