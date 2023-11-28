@file:OptIn(KotlinPoetMetadataPreview::class)

package com.lazyengineer.playwright.poet


import com.microsoft.playwright.Locator
import com.microsoft.playwright.impl.CustomLocatorImpl
import com.microsoft.playwright.impl.OpenLocatorImpl
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asTypeName
import com.squareup.kotlinpoet.metadata.KotlinPoetMetadataPreview
import com.squareup.kotlinpoet.metadata.specs.toTypeSpec
import java.io.File

/**
 * TODO: better docs...
 * This generates com.lazyengineer.playwright.test.generated.GeneratedLocatorImpl (which extends com.microsoft.playwright.impl.LocatorImpl)
 * It adds the following functionality:
 * * All locator functions that took a *Options argument now offer a named argument version of those functions
 * * functions now take "name" and "exact" now alternatively can be called with "containsName", "exactName", or "regexName", to make doing exact less verbose and making it clearer what type of match is occurring.
 * * Functions have been created for fetching and clicking by all Aria Roles: i.e. `clickAriaButton(exactName = "I'm Feeling Lucky")
 *
 * TODO: for name, exat functions, make exactName first argument to the function, so callers can do, for example, clickAriaButton("Create")
 */
object PoetAppCreateWrapperLocatorImpl {
    val generatedClassName = "GeneratedWrappedLocatorImpl"

    @OptIn(KotlinPoetMetadataPreview::class, ExperimentalStdlibApi::class)
    @JvmStatic
    fun main(vararg param: String) {
        val originalSpec = CustomLocatorImpl::class.toTypeSpec()

        val specBuilder = TypeSpec.classBuilder(generatedClassName)
            .addModifiers(KModifier.OPEN)
            .superclass(OpenLocatorImpl::class.asTypeName())
            .primaryConstructor(
                FunSpec.constructorBuilder().addParameter("locator", Locator::class.asTypeName()).build()
            )
            .addSuperclassConstructorParameter(CodeBlock.of("locator"))
            .addFunctions(buildWrappedFunctions(originalSpec.funSpecs))
            .build()

        FileSpec.builder("com.lazyengineer.playwright.test.generated", generatedClassName)
            .addType(specBuilder)
            .addImport("com.lazyengineer.playwright.test.extensions", "applyFailurePreprocessing")
            .build()
            .writeTo(File("./src/main/kotlin/").also { println("it = ${it.canonicalPath}") })
    }

    private fun buildWrappedFunctions(funSpecs: List<FunSpec>): List<FunSpec> {
        val locatorFunNames = Locator::class.java.methods.map { it.name }
        return funSpecs
            .filter { funSpec -> locatorFunNames.any { it == funSpec.name } } // only wrap Locator functions (not the extra ones in the impl)
            .map { funSpec ->
                funSpec.toBuilder(funSpec.name)
                    .clearBody()
                    .also { it.modifiers.clear() }
                    .addStatement(getStatement(funSpec))
                    .addModifiers(KModifier.OVERRIDE)
                    .build()
            }
    }

    private fun getStatement(funSpec: FunSpec): String {
        val (returnPrefix, returnPostfix) = when {
            //wrap anything that returns Locator so that we handle calls to it
            funSpec.returnType == Locator::class.asTypeName() -> "return $generatedClassName(" to ")"
            funSpec.returnType.toString() != "kotlin.Unit" -> "return " to ""
            else -> "" to ""
        }
        return """
                try {
                    ${returnPrefix}super.${funSpec.name}(${funSpec.parameters.joinToString() { it.name }})$returnPostfix
                    } catch (e: Throwable) {
                        throw applyFailurePreprocessing(this, e)
                    }
    
            """.trimIndent()
    }
}

