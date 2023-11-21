package examples

import com.lazyengineer.playwright.old.clickByExactText
import com.lazyengineer.playwright.proxy.client.playwrightClient
import com.lazyengineer.playwright.test.PageFragment
import com.lazyengineer.playwright.test.TestInit.initTestsAsync
import com.lazyengineer.playwright.test.navigateTo
import com.lazyengineer.playwright.test.toPageFragment
import com.microsoft.playwright.Locator
import org.junit.jupiter.api.Test


class PageFragmentWithChildFrameDemoTest {
    companion object {
        // This is the earliest hook during test startup, use it to init long running tasks, so that by the time the test starts they may already be ready to use
        init {
            initTestsAsync()
        }
    }

    class GoogleHomePage(locator: Locator) : PageFragment(locator) {
        fun openAppsMenu(): PageFragment {
            clickAriaButton(exactName = "Google apps")
            return page().frameByUrl("widget".toRegex().toPattern()).toPageFragment()
        }
    }

    @Test
    fun `show custom PageFragment functionality`() {
        //given
        val (playwright, context, page) = playwrightClient

        //when
        val googleHomePage = page.navigateTo<GoogleHomePage>("https://www.google.com")
        val appsMenu = googleHomePage.openAppsMenu()
        appsMenu.clickByExactText("Maps123")

        println(appsMenu)
        //then
    }

    @Test
    fun `show PageFragment functionality`() {
        //given
        val (playwright, context, page) = playwrightClient

        //when
        val pageFragment = page.navigateTo<PageFragment>("https://www.google.com")

        //then
    }













}


