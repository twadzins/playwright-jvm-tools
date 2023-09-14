package com.lazyengineer.playwright.test

import com.microsoft.playwright.Locator
import com.microsoft.playwright.Locator.GetByRoleOptions
import com.microsoft.playwright.options.AriaRole


fun Locator.clickByLocator(locator: String) = locator(locator).click()
fun Locator.clickByText(text: String) = try {
    getByText(text).click()
} catch (e: Throwable) {
    highlightElementNearFailure(this)
    throw e;
}

fun Locator.clickButtonByName(name: String) = getByRole(AriaRole.BUTTON, GetByRoleOptions().setName(name)).click()
fun Locator.clickButtonBy(init: GetByRoleOptions.() -> Unit) = getByRole(AriaRole.BUTTON, options(init)).click()

