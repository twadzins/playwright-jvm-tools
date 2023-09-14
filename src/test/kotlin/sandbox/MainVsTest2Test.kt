package sandbox

import com.lazyengineer.playwright.test.timing.elapsed
import org.junit.jupiter.api.Test


class MainVsTest2Test {
    companion object {
        // This is the earliest hook during test startup, use it to init long running tasks, so that by the time the test starts they may already be ready to use
        init {
            System.err.println("initElapsedMillis: $elapsed ")
        }
    }
    @Test
    fun someTest() {
        System.err.println("in test Uptime $elapsed")
    }

    @Test
    fun someTest2() {
        System.err.println("in someTest2 Uptime $elapsed")
    }
}

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        MainVsTest2Test().someTest()
    }

}
