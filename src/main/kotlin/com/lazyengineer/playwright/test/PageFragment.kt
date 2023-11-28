package com.lazyengineer.playwright.test

import com.lazyengineer.playwright.test.extensions.getPrivateProperty
import com.lazyengineer.playwright.test.generated.GeneratedWrappedLocatorImpl
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
open class PageFragment(public val wrappedLocator: Locator, val frame: Frame? = null) :
    GeneratedWrappedLocatorImpl(wrappedLocator)

inline fun <reified T : PageFragment> Page.navigateTo(url: String): T {
    if (!url.startsWith("http") && (context().getPrivateProperty("baseUrl").toString() + url) == url()) {
        //url is same as current, just reload (might only matter for "url fragment '#'" pages
        // this also only matter if reusing the page
        reload(options { timeout = 5000.0 })
    } else {
        navigate(url, options { timeout = 5000.0 })
    }

    return toPageFragment<T>()
}

inline fun <reified T : PageFragment> Page.toPageFragment(): T {
    val bodyLocator = this.locator("body")
    return bodyLocator.toPageFragment<T>()
}

inline fun <reified T : PageFragment> Locator.toPageFragment(): T {
    val thisLocator = if (this is PageFragment) this.wrappedLocator else this
    val pageFragment = if (T::class.java == PageFragment::class.java) {
        PageFragment(thisLocator) as T
    } else {
        T::class.java.getDeclaredConstructor(Locator::class.java).newInstance(thisLocator)
    }
    return pageFragment
//    return toProxyLocator(pageFragment) as T
}

fun Frame.toPageFragment() = PageFragment(locator("body"), this)

