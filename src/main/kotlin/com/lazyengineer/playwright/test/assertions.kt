package com.lazyengineer.playwright.test

import com.microsoft.playwright.Locator
import com.microsoft.playwright.assertions.LocatorAssertions
import com.microsoft.playwright.assertions.LocatorAssertions.IsVisibleOptions
import com.microsoft.playwright.impl.LocatorAssertionsImpl
import java.lang.reflect.InvocationTargetException
import java.lang.reflect.Method
import java.lang.reflect.Proxy



fun Locator.shouldBeVisible(init: IsVisibleOptions.() -> Unit = NOOP) = assertThat(this).isVisible(options(init))
fun Locator.shouldNotBeVisible(init: IsVisibleOptions.() -> Unit = NOOP) = assertThat(this).not().isVisible(options(init))

//fun assertThat(locator: Locator): LocatorAssertions = PlaywrightAssertions.assertThat(unwrap(locator))

fun unwrap(locator: Locator) = if (locator is LocatorValueClass) locator.wrappedLocator else locator

fun assertThat(locator: Locator): LocatorAssertions = getLocatorAssertionsProxy(locator)



//TODO: make this configurable
val ci = false

private fun getLocatorAssertionsProxy(locator: Locator): LocatorAssertions {
    val unwrappedLocator = unwrap(locator)
    val assertionsImpl = LocatorAssertionsImpl(unwrappedLocator)
    if (ci) {
        // skip extra troubleshooting info in CI
        return assertionsImpl
    }
    val assertionsImplClass = assertionsImpl::class.java

    fun findMethod(method: Method): Method {
        return try {
            //TODO: cache these for performance (and let them be disabled for ci tests)
            assertionsImplClass.getMethod(method.name, *method.parameterTypes)
        } catch (e: NoSuchMethodException) {
            //TODO: add context
            throw e
        }
    }

    return Proxy.newProxyInstance(
        locator::class.java.getClassLoader(), arrayOf<Class<*>>(LocatorAssertions::class.java)
    ) { proxy, method, methodArgs ->
        try {
            if (methodArgs == null) {
                findMethod(method).invoke(assertionsImpl)
            } else {
                findMethod(method).invoke(assertionsImpl, *methodArgs)
            }
        } catch (e: InvocationTargetException) {
            highlightElementNearFailure(locator)
            throw e.cause ?: e
        }
//        if (method.getName().equals("get")) {
//            return@newProxyInstance 42
//        } else {
//            throw UnsupportedOperationException(
//                "Unsupported method: " + method.getName()
//            )
//        }
    } as LocatorAssertions



//    //try proxy instead
//    class LocatorAssertionsDelegate(val locator: Locator, val delegate: LocatorAssertions = LocatorAssertionsImpl(unwrap(locator))) : LocatorAssertions by delegate {
//        override fun isVisible(options: IsVisibleOptions?) {
//            try {
//                return delegate.isVisible(options)
//            } catch (e: kotlin.Throwable) {
////        } catch (e: AssertionFailedError) {
//                locator.page().querySelector("body >> nav").evaluate("node => node.style.filter = \"drop-shadow(2px 2px 2px red)\"")
//                println(getLocatorString(locator))
//                println(getLocatorString(locator))
//                throw e
//            }
//        }
//    }

}

fun highlightElementNearFailure(locator: Locator) {
    // highlight parent locator in the DOM (if it exists) for easier troubleshooting
    var locatorMatchNotFound = true
    var targetLocatorString = getLocatorString(locator)
    while (locatorMatchNotFound) {
        val selector = locator.page().querySelector(targetLocatorString)
        if (selector == null) {
            targetLocatorString = getParentLocatorString(targetLocatorString)
            if (targetLocatorString == "" || targetLocatorString == "body") {
                //no interesting portion of the dom to higlight, just exit
                locatorMatchNotFound = false
            }
        } else {
            selector.evaluate(
                """
                                node => {
                                node.style.filter = "opacity(.92) drop-shadow(1px 1px 2px red)";
                                node.style.backdropFilter = "invert(0%)";
                                }""".trimIndent()
            )
            locatorMatchNotFound = false
        }
    }
}

private fun getParentLocatorString(locatorString: String) =
    locatorString.split(">>").dropLast(1).joinToString(">>").trim()


