package junit

import com.lazyengineer.playwright.test.timing.elapsed


fun main() {
    val startMainMillis = System.currentTimeMillis()
    System.err.println("in test start Uptime 1 $elapsed")
    val directTest = DirectTest()
    System.err.println("in test start Uptime after construct $elapsed")
    val javaClass = directTest.javaClass
    System.err.println("in test start Uptime after class $elapsed")

    runTestClass(javaClass)
    System.err.println("in test end Uptime3  $elapsed")
}

