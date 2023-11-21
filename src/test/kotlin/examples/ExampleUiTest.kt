package examples

import com.lazyengineer.playwright.proxy.client.playwrightClient
import com.lazyengineer.playwright.test.PageFragment
import com.lazyengineer.playwright.test.TestInit.initTestsAsync
import com.lazyengineer.playwright.test.extensions.assertThat
import com.lazyengineer.playwright.test.options
import com.lazyengineer.playwright.test.extensions.shouldBeVisible
import com.lazyengineer.playwright.test.navigateTo
import com.microsoft.playwright.Page
import com.microsoft.playwright.options.AriaRole
import com.microsoft.playwright.options.AriaRole.BUTTON
import org.junit.jupiter.api.Test


class ExampleUiTest {
    companion object {
        // This is the earliest hook during test startup, use it to init long running tasks, so that by the time the test starts they may already be ready to use
        init {
            initTestsAsync()
        }
    }

    @Test
    fun `show different visibility check approaches`() {
        //given
        val (playwright, context, page) = playwrightClient

        //when
        val pageFragment = page.navigateTo<PageFragment>("https://www.google.com")

        //then
        // (with no options passed in to shouldBeVisible() )
        page.getByRole(BUTTON, options { name = "I'm Feeling Lucky" }).shouldBeVisible()
        // or (with options passed in to shouldBeVisible() )
        page.getByRole(BUTTON, options { name = "I'm Feeling Lucky" }).shouldBeVisible { timeout = 2000.0 }
        // or (introducing another extension function)
        page.getButtonByName("I'm Feeling Lucky").shouldBeVisible()

        //Or using KotlinPoet output
        assertThat(pageFragment.getAriaButton(containsName = "I'm Feeling")).isVisible()
        pageFragment.getAriaButton(containsName = "I'm Feeling").shouldBeVisible()
        pageFragment.getAriaButton(exactName = "I'm Feeling Lucky").shouldBeVisible()
    }


    private fun Page.getButtonByName(buttonName: String) = getByRole(AriaRole.BUTTON, options { name = buttonName })












}


