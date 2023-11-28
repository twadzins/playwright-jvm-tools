package examples

import com.lazyengineer.playwright.old.clickByExactText
import com.lazyengineer.playwright.proxy.client.playwrightClient
import com.lazyengineer.playwright.test.PageFragment
import com.lazyengineer.playwright.test.TestInit.initTestsAsync
import com.lazyengineer.playwright.test.extensions.assertThat
import com.lazyengineer.playwright.test.extensions.shouldContainText
import com.lazyengineer.playwright.test.generated.clickAriaButton
import com.lazyengineer.playwright.test.generated.getAriaMain
import com.lazyengineer.playwright.test.generated.getAriaNavigation
import com.lazyengineer.playwright.test.generated.getAriaTablist
import com.lazyengineer.playwright.test.navigateTo
import com.lazyengineer.playwright.test.toPageFragment
import com.microsoft.playwright.Locator
import org.junit.jupiter.api.Test


class PageFragmentDemoTest {
    companion object {
        // This is the earliest hook during test startup, use it to init long running tasks, so that by the time the test starts they may already be ready to use
        init {
            initTestsAsync()
        }
    }


    class PlaywrightDocsJavaHomePage(locator: Locator) : PageFragment(locator) {
        val sideNav get() = getAriaNavigation("Docs sidebar")
        val sideNavAsCustomPageFragment get() = getAriaNavigation(containsName = "Docs sideb").toPageFragment<SideNav>()
        val topNav get() = getAriaNavigation("Main")

        val main get() = getAriaMain()
    }

    class SideNav(locator: Locator) : PageFragment(locator) {
        fun expandMenuListItem(): Nothing = TODO()
    }

    @Test
    fun `show custom PageFragment functionality`() {
        //given
//        val (playwright, context, page) = playwrightClient
        val page = playwrightClient.newPage()

        //when
        val docsPage = page.navigateTo<PlaywrightDocsJavaHomePage>("https://playwright.dev/java/docs/intro")

        docsPage.sideNav.clickByExactText("Installation")

        //then
        assertThat(docsPage.main.locator("header")).containsText("Installation")

        docsPage.main.getAriaTablist().shouldContainText("App.java")

        // and when
        docsPage.topNav.clickAriaButton(exactName = "Java")
        docsPage.topNav.clickByExactText("Node.js")

        // then
        docsPage.main.getAriaTablist().shouldContainText("npm")

    }

    @Test
    fun `show PageFragment functionality`() {
        //given
//        val (playwright, context, page) = playwrightClient
        val page = playwrightClient.newPage()


        //when
        val pageFragment = page.navigateTo<PageFragment>("https://www.google.com")

        //then
    }













}


