package com.lazyengineer.playwright.misc

import com.lazyengineer.playwright.misc.PlaywrightJunitExtension.Companion.browserContexts
import com.microsoft.playwright.Page

//TODO: each browser type should be a different test instance, maybe with @RunWith
fun withPage(function: Page.() -> Unit): Unit {
    for (context in browserContexts) {
//        val page = context.newPage()
        val page = if (context.pages()
                .isNotEmpty()
        ) context.pages()[0].also { println("Using existing page") } else context.newPage()
        function.invoke(page)
    }
}
