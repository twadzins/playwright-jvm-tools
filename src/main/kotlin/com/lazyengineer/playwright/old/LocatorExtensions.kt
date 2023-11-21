package com.lazyengineer.playwright.old

import com.lazyengineer.playwright.test.extensions.applyFailurePreprocessing
import com.lazyengineer.playwright.test.options
import com.microsoft.playwright.Locator
import com.microsoft.playwright.Locator.GetByRoleOptions
import com.microsoft.playwright.TimeoutError
import com.microsoft.playwright.options.AriaRole


// TODO: consider replacing some/all of this with KotlinPoet code.
fun Locator.clickByLocator(locator: String) = withFailurePreprocessing {
    locator(locator).click()
}

fun Locator.clickByExactText(text: String) = withFailurePreprocessing {
    getByText(text, options { exact = true }).click()
}

private inline fun <T : Any?> Locator.withFailurePreprocessing(function: () -> T?): T? {
    try {
        return function.invoke()
    } catch (e: Throwable) {
        throw applyFailurePreprocessing(this, e)
    }
}
/*
//This has generally all been replaced with KotlinPoet generated code


fun Locator.clickByLocator(locator: String) = locator(locator).click()

fun Locator.clickByExactText(text: String) = withFailurePreprocessing {
    getByText(text, options { exact = true }).click()
}

fun Locator.clickByText(text: String) = withFailurePreprocessing {
    getByText(text).click()
}

private inline fun <T : Any?> Locator.withFailurePreprocessing(function: () -> T?): T? {
    try {
        return function.invoke()
    } catch (e: Throwable) {
        throw applyFailurePreprocessing(this, e)
    }
}



fun Locator.clickButtonByName(name: String) = getByRole(AriaRole.BUTTON, GetByRoleOptions().setName(name)).click()
fun Locator.clickButtonBy(init: GetByRoleOptions.() -> Unit) = getByRole(AriaRole.BUTTON, options(init)).click()

var GetByRoleOptions.exactName: Any
    get() {
        return this.name
    }
    set(value) {
        name = value
        exact = true
    }

*/
