package com.lazyengineer.playwright.test.extensions

import com.lazyengineer.playwright.test.PageFragment
import com.microsoft.playwright.Locator
import com.microsoft.playwright.TimeoutError
import com.microsoft.playwright.impl.LazyEngineerUtil


fun applyFailurePreprocessing(locator: Locator, e: Throwable): Throwable {
    highlightElementsNearFailure(locator)
    if (e is TimeoutError) {
        // present more concise timeout error - original is filled with fluff, so instead just get the line after "================ logs ==============="
        val message = timeoutLogRegex.find(e.message!!)?.groupValues?.run {
            if (size == 2) {
                this[1]
            } else
                e.message
        } ?: e.message

        return PlaywrightTimeoutError(message, e.stackTrace)
    }
    return e;
}

internal val timeoutLogRegex = Regex("=*\\slogs123.*\n(.*)", RegexOption.MULTILINE)

class PlaywrightTimeoutError(message: String?, stackTrace: Array<StackTraceElement>) : RuntimeException(message, null, false, true) {
    init {
        super.setStackTrace(stackTrace)
    }
}

fun highlightElementsNearFailure(locator: Locator) {
    // highlight parent locator in the DOM (if it exists) for easier troubleshooting
    var locatorMatchNotFound = true
    var targetLocatorString = getLocatorString(locator)
    while (locatorMatchNotFound) {
        val selectors = if (locator is PageFragment && locator.frame != null) {
            locator.frame.querySelectorAll(targetLocatorString)
        } else {
            locator.page().querySelectorAll(targetLocatorString)
        }
        if (selectors.isEmpty()) {
            targetLocatorString = getParentLocatorString(targetLocatorString)
            if (targetLocatorString == "" || targetLocatorString == "body") {
                //no interesting portion of the dom to higlight, just exit
                locatorMatchNotFound = false
            }
        } else {
            selectors.forEach { it.evaluate(
                """
                                node => {
                                node.style.filter = "opacity(.92) drop-shadow(1px 1px 2px red)";
                                node.style.backdropFilter = "invert(0%)";
                                node.scrollIntoView({ behavior: "smooth", block: "end", inline: "nearest" });
                                }""".trimIndent()
            )
            }
            locatorMatchNotFound = false
        }
    }
}

private fun getParentLocatorString(locatorString: String): String {
    if (locatorString.endsWith("]")) {
        // handle cases like "body >> internal:role=button[name="I'm Feeling Lucky!"]" -> "body >> internal:role=button"
        return locatorString.substring(0, locatorString.lastIndexOf("["))
    }
    return locatorString.split(">>").dropLast(1).joinToString(">>").trim()
}

fun getLocatorString(locator: Locator): String = LazyEngineerUtil.getLocatorString(locator)
