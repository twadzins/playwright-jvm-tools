package com.lazyengineer.playwright

import com.microsoft.playwright.Playwright
import com.microsoft.playwright.impl.driver.Driver
import java.io.File
import java.io.IOException
import java.lang.management.ManagementFactory

val playwrightVerion = Playwright::class.java.getPackage().implementationVersion ?: "unknown-version"
val cachedDriverDir = "${System.getProperty("java.io.tmpdir")}/playwright-driver/$playwrightVerion/"

@Throws(IOException::class, InterruptedException::class)
fun main() {
    println("uptime at start of beforeAll = ${ManagementFactory.getRuntimeMXBean().uptime}")
    cacheCliDirIfNeeded()
}

/**
 * Save around 500ms of app startup time by caching the cli dir rather than unzipping it each on each startup.
 *
 * Also, patches the driver so that JCEF is allowed to run
 */
fun cacheCliDirIfNeeded(): String {
    if (File(cachedDriverDir, "playwright.sh").exists()) {
        println("Using existing cached driver at : $cachedDriverDir/")
        return cachedDriverDir;
    }

    val driver = Driver.createAndInstall(emptyMap(), false)
    val driverPath = driver.driverPath()
    val driverRootDir = driverPath.parent.toFile()

    val cacheDir = File(cachedDriverDir)
    println("Caching driver for reuse on subsequent runs to: ${cacheDir}/")
    driverRootDir.copyRecursively(cacheDir, overwrite = true)

    cacheDir.walk().filter { it.isFile }.forEach {
        if (isExecutable(it)) {
            it.setExecutable(true)
        }
        if (it.name == "crBrowser.js") {
            // avoid "setDownloadBehavior" error that happens if we are using a jcef browser
            val oldCheck = "if (this._browser.options.name !== 'electron' && this._browser.options.name !== 'clank') {"
            val patchedCheck = "if (false && this._browser.options.name !== 'electron' && this._browser.options.name !== 'clank') {"
            it.writeText(it.readText().replace(oldCheck, patchedCheck))
        }
    }
    return cachedDriverDir
}

private fun isExecutable(file: File): Boolean {
    val name = file.name
    return name.endsWith(".sh") || name.endsWith(".exe") || !name.contains(".")
}

