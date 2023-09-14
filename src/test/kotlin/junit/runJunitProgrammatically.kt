package junit


import com.lazyengineer.playwright.test.timing.elapsed
import org.junit.platform.engine.DiscoverySelector
import org.junit.platform.engine.TestExecutionResult
import org.junit.platform.engine.discovery.DiscoverySelectors
import org.junit.platform.launcher.EngineFilter.includeEngines
import org.junit.platform.launcher.LauncherDiscoveryRequest
import org.junit.platform.launcher.TestExecutionListener
import org.junit.platform.launcher.TestIdentifier
import org.junit.platform.launcher.TestPlan
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder
import org.junit.platform.launcher.core.LauncherFactory


fun runTestClass(clazz: Class<*>) {
    System.err.println("in test start Uptime 1.1 $elapsed")

    val launcher = LauncherFactory.create()
    System.err.println("in runTestClass after LauncherFactory.create()  Uptime 1.2 $elapsed")
    launcher.registerTestExecutionListeners(ConsoleTestExecutionListener())
    System.err.println("2in runTestClass Uptime 1.3 $elapsed")
    val request: LauncherDiscoveryRequest = LauncherDiscoveryRequestBuilder.request()
//        .selectors(DiscoverySelectors.selectClass(clazz), DiscoverySelectors.selectUniqueId("unique-id-1"))
//        .selectors(DiscoverySelectors.selectUniqueId("[engine:junit-jupiter]/[class:junit.DirectTest]"))
        .selectors(DiscoverySelectors.selectClass(clazz))
//        .selectors(DiscoverySelectors.selectClasspathRoots(setOf(Path("./build/classes/kotlin/test"))))
        .filters(
            includeEngines("junit-jupiter"),
//            PackageNameFilter.includePackageNames("sample"),
            // excludeEngines("junit-vintage"),
//            includeTags("fast"),
            // excludeTags("slow"),
//            includeClassNamePatterns("^junit.*Test[s]?")
            // includeClassNamePatterns("org\.example\.tests.*")
        )
        .build()
    System.err.println("i3n runTestClass Uptime 1.4 $elapsed")

    System.err.println("request = ${request.configurationParameters}")

    System.err.println("${request.getSelectorsByType(DiscoverySelector::class.java).forEach { System.err.println("selector: $it") }}")
    System.err.println("4in runTestClass Uptime 1.5 $elapsed")
    try {
        val testPlan = launcher.discover(request)
        System.err.println("5in runTestClass after launcher.discover() Uptime 1.6 $elapsed")
        System.err.println("exexute testPlan = ${testPlan}")
//        launcher.execute(testPlan)
//        System.err.println("exexute testPlan again = ${testPlan}")

        launcher.execute(testPlan)
        System.err.println("6in runTestClass Uptime $elapsed")
        System.err.println("done!")
    } catch (e: Exception) {
        e.printStackTrace()
        throw e
    }
}
class ConsoleTestExecutionListener : TestExecutionListener {
    override fun testPlanExecutionStarted(testPlan: TestPlan) {
        // Initialization code if needed
        System.err.println("testPlanExecutionStarted Uptime $elapsed")

        System.err.println("Running testPlan: ${testPlan}")
    }

    override fun executionStarted(testIdentifier: TestIdentifier) {
        // Called when a test execution starts
        System.err.println("executionStarted Uptime $elapsed")
        System.err.println("Running test: ${testIdentifier.displayName}")
    }

    override fun executionFinished(
        testIdentifier: TestIdentifier,
        testExecutionResult: TestExecutionResult,
    ) {
        System.err.println("executionFinished Uptime $elapsed")

        // Called when a test execution finishes
        System.err.println("Test [${testIdentifier.displayName}]: ${testExecutionResult.status}")
        val throwable = testExecutionResult.throwable.orElse(null)
        if (throwable != null) {
            System.err.println("Failure reason: ${throwable.stackTraceToString()}")
        }
    }

    override fun testPlanExecutionFinished(testPlan: TestPlan?) {
        System.err.println("testPlanExecutionFinished Uptime $elapsed")
        // Cleanup code if needed
    }
}
