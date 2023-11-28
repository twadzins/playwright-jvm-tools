package com.lazyengineer.playwright.test.extensions

import com.lazyengineer.playwright.test.NOOP
import com.lazyengineer.playwright.test.PageFragment
import com.lazyengineer.playwright.test.options
import com.microsoft.playwright.Locator
import com.microsoft.playwright.assertions.LocatorAssertions
import com.microsoft.playwright.assertions.LocatorAssertions.IsVisibleOptions
import com.microsoft.playwright.impl.LocatorAssertionsImpl
import java.lang.reflect.InvocationTargetException
import java.lang.reflect.Method
import java.lang.reflect.Proxy

//TODO: make this configurable
val ci = false

fun Locator.shouldBeVisible(init: IsVisibleOptions.() -> Unit = NOOP) = assertThat(this).isVisible(options(init))
fun Locator.shouldNotBeVisible(init: IsVisibleOptions.() -> Unit = NOOP) = assertThat(this).not().isVisible(options(init))
fun Locator.shouldContainText(text: String) = assertThat(this).containsText(text)


fun toProxyLocatorProbablyDelete(locator: Locator): Locator {
    val proxyTargetInstance = PageFragment(locator)
    val whatIsThisAboutClazz = PageFragment::class.java
    if (ci) {
        // skip extra troubleshooting info in CI
        return proxyTargetInstance
    }
    val proxyClass = proxyTargetInstance::class.java

    fun findMethod(method: Method): Method {
        return try {
            //TODO: cache these for performance (and let them be disabled for ci tests)
            proxyClass.getMethod(method.name, *method.parameterTypes)
        } catch (e: NoSuchMethodException) {
            //TODO: add context
            throw e
        }
    }

    return Proxy.newProxyInstance(
        proxyTargetInstance::class.java.getClassLoader(), arrayOf<Class<*>>(Locator::class.java)
    ) { proxy, method, methodArgs ->
        try {
            if (methodArgs == null) {
                findMethod(method).invoke(proxyTargetInstance)
            } else {
                findMethod(method).invoke(proxyTargetInstance, *methodArgs)
            }
        } catch (e: InvocationTargetException) {
            highlightElementsNearFailure(locator)
            throw e.cause ?: e
        }
    } as Locator
}


fun assertThat(locator: Locator): LocatorAssertions {
//    val assertionsImpl = LocatorAssertionsImpl(unwrap(locator))
    val assertionsImpl = LocatorAssertionsImpl(locator)
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
            highlightElementsNearFailure(locator)
            throw e.cause ?: e
        }
    } as LocatorAssertions
}


