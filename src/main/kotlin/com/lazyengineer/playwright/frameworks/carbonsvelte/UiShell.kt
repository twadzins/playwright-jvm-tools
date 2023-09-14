package com.lazyengineer.playwright.frameworks.carbonsvelte

import com.lazyengineer.playwright.test.K2JavaInterfaceWorkaroundLocator
import com.lazyengineer.playwright.test.LocatorDelegate2
import com.lazyengineer.playwright.test.LocatorValueClass


/**
 * TODO: when k2 bug is fixed (https://youtrack.jetbrains.com/issue/KT-60876/K2-NoSuchMethodError-when-a-value-class-method-is-called-where-the-value-class-uses-delegation-and-the-delegate-is-a-Java), get rid of K2JavaInterfaceWorkaroundLocatorDelegate and K2JavaInterfaceWorkaroundLocator
 * Instead, just use Locator: value class UiShellDelegate(private val l: Locator) : Locator by l, LocatorTester {...}
 *
 */
@JvmInline
value class UiShell(private val l: LocatorDelegate2) : K2JavaInterfaceWorkaroundLocator by l,
    LocatorValueClass {
    fun toggleSideNav(): SideNav {
        locator("button.bx--header__menu-toggle").click()
        return sideNav
    }

    fun getHeaderLabel() = locator(".bx--header__name--prefix")

    val sideNav: SideNav
        get() {
            return SideNav(LocatorDelegate2(locator(".bx--side-nav--expanded")))
        }

    override val delegate: LocatorDelegate2
        get() = l


}

////Marker interface
//interface LocatorTester {
//
//}

//@JvmInline
//value class UiShellLocator3(val value:Locator)

//typealias UiShellLocator = Locator
//interface UiShellLocator: Locator {
//
//}

/**
 * TODO: current this is toggle, not open
 */


//fun UiShellLocator3.openSideNav1(): SideNavLocator {
//    value.locator("button.bx--header__menu-toggle").click()
//    return sideNav
//}
//
//val UiShellLocator3.sideNav: SideNavLocator
//    get() {
//        return value.locator("nav") as SideNavLocator
//    }
//
//
//fun UiShellLocator.openSideNav1(): SideNavLocator {
//    locator("button.bx--header__menu-toggle").click()
//    return sideNav
//}
