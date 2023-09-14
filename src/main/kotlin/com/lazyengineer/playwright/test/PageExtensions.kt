package com.lazyengineer.playwright.test

import com.microsoft.playwright.Locator
import com.microsoft.playwright.Page


//TODO: use this instead, since the reify way is strange compared with home we construct locator delegate from locators
//    fun Page.openPage(url: String): Locator {
//        navigate(url)
//        return this.locator("body")
//    }

inline fun <reified T : Locator> Page.navigateTo(url: String): T {
    navigate(url)

    val declaredConstructor = T::class.java.getDeclaredConstructor(LocatorDelegate2::class.java)
    declaredConstructor.trySetAccessible()
    return declaredConstructor.newInstance(LocatorDelegate2(this.locator("body")))
}

fun <T : Any> setAndReturnPrivateProperty(javaClass: T, variableName: String, data: Any): Any? {
    return javaClass.javaClass.getDeclaredField(variableName).let { field ->
        field.isAccessible = true
        field.set(javaClass, data)
        return@let field.get(javaClass)
    }
}
