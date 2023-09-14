package examples.carbonsvelte

import com.lazyengineer.playwright.frameworks.carbonsvelte.UiShell
import com.lazyengineer.playwright.client.playwrightClient
import com.lazyengineer.playwright.test.CollectTraceExtension
import com.lazyengineer.playwright.test.TestInit.initTestsAsync
import com.lazyengineer.playwright.test.navigateTo
import com.lazyengineer.playwright.test.options
import com.lazyengineer.playwright.test.shouldBeVisible
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith


class ExampleCarbonSvelteTest {
    companion object {
        // This is the earliest hook during test startup, use it to init long running tasks, so that by the time the test starts they may already be ready to use
        init {
            initTestsAsync()
        }
    }

    val url = "https://carbon-components-svelte.onrender.com/framed/UIShell/PersistedHamburgerMenu?theme=white"

    @Test
    fun `Open sideNav`() {
        //given
        val (playwright, context, page) = playwrightClient
        //when
        val uiShell = page.navigateTo<UiShell>(url)

        val sideNav = uiShell.toggleSideNav()

        //then
        sideNav.shouldBeVisible()
    }

    @Test
    fun `Open sideNav menu`() {
        //given
        val (playwright, context, page) = playwrightClient

        //when
        val uiShell = page.navigateTo<UiShell>(url)

        val sideNav = uiShell.toggleSideNav()
        val menu = sideNav.navItems.filter(options { hasText = "Menu" })

        //then
        menu.click()
        menu.getByText("Link 1").shouldBeVisible()
    }

    @ExtendWith(CollectTraceExtension::class)
    @Test
    fun `Open sideNav menu with trace collection and viewing`() {
        //given
        val (playwright, context, page) = playwrightClient

        //when
        val uiShell = page.navigateTo<UiShell>(url)

        val sideNav = uiShell.toggleSideNav()
        val menu = sideNav.navItems.filter(options { hasText = "Menu" })

        //then
        menu.click()
        menu.getByText("Link 1").shouldBeVisible()
    }

    @RepeatedTest(100)
    fun `Open sideNav menu - RepeatedTest stress test`() {
        //given
        val (playwright, context, page) = playwrightClient

        //when
        val uiShell = page.navigateTo<UiShell>(url)

        val sideNav = uiShell.toggleSideNav()
        val menu = sideNav.navItems.filter(options { hasText = "Menu" })

        //then
        menu.click()
        menu.getByText("Link 1").shouldBeVisible()
    }

    @RepeatedTest(3)
    fun `Open sideNav menu - internal repeated stress test`() {
        //given
        val (playwright, context, page) = playwrightClient

        //when
        val uiShell = page.navigateTo<UiShell>(url)

        val sideNav = uiShell.toggleSideNav()
        val menu = sideNav.navItems.filter(options { hasText = "Menu" })

        //then
        menu.click()
        menu.getByText("Link 1").shouldBeVisible()
        for (i in 0..50) {
            uiShell.toggleSideNav()
        }
    }


}
