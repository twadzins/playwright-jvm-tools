package com.lazyengineer.playwright.test

import com.microsoft.playwright.Locator
import com.microsoft.playwright.impl.LazyEngineerUtil

internal fun <T : Any> T.setAndReturnPrivateProperty(variableName: String, data: Any): Any? {
    return javaClass.getDeclaredField(variableName).let { field ->
        field.isAccessible = true
        field.set(this, data)
        return@let field.get(this)
    }
}

fun <T : Any> T.getPrivateProperty(variableName: String): Any? {
    return javaClass.getDeclaredField(variableName).let { field ->
        field.isAccessible = true
        return@let field.get(this)
    }
}

fun getLocatorString(locator: Locator): String = LazyEngineerUtil.getLocatorString(locator)
