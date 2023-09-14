package com.lazyengineer.playwright.test


/**
 * TODO: describe example in more detail:
 * ```
 *         sideNav.shouldBeVisible() {
 *             timeout = 0.00001
 *         }
 *```
 */
inline fun <reified T> options(noinline init: T.() -> Unit): T? {
    if (init == NOOP) {
        return null
    }
    val options = T::class.java.getDeclaredConstructor().newInstance()
    options.init()
    return options
}

object NOOP : (Any) -> Unit {
    override fun invoke(p1: Any) {
        throw RuntimeException("This line should never be reached under normal use")
    }
}
