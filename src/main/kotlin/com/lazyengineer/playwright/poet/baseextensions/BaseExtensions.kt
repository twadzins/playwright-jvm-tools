package com.lazyengineer.playwright.poet.baseextensions

import com.microsoft.playwright.Locator
import com.microsoft.playwright.options.AriaRole


/**
 * Here only to be picked up by PoetApp and be expanded or directly included in the generated code
 */
internal object BaseExtensions {
    // new extensions
    fun Locator.clickByRole(role: AriaRole, options: Locator.GetByRoleOptions?): Locator {
        return this.getByRole(role, options).also {
            it.click()
        }
    }

    fun Locator.clickByText(text: String, options: Locator.GetByTextOptions?): Locator {
        return this.getByText(text, options).also {
            it.click()
        }
    }

}

