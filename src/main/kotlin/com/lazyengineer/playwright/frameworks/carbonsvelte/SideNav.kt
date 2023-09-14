package com.lazyengineer.playwright.frameworks.carbonsvelte

import com.lazyengineer.playwright.test.K2JavaInterfaceWorkaroundLocator
import com.lazyengineer.playwright.test.LocatorDelegate2
import com.lazyengineer.playwright.test.LocatorValueClass
import com.microsoft.playwright.Locator


@JvmInline
value class SideNav(override val delegate: LocatorDelegate2) :
    K2JavaInterfaceWorkaroundLocator by delegate, LocatorValueClass {

    val navItems: Locator
        get() = locator(".bx--side-nav__item")
}
