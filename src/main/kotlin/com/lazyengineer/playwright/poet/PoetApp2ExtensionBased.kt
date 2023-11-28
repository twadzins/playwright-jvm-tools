package com.lazyengineer.playwright.poet


import com.lazyengineer.playwright.poet.baseextensions.BaseExtensions
import com.microsoft.playwright.Locator
import com.microsoft.playwright.impl.CustomLocatorImpl
import com.microsoft.playwright.options.AriaRole
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.asTypeName
import com.squareup.kotlinpoet.metadata.KotlinPoetMetadataPreview
import com.squareup.kotlinpoet.metadata.specs.toTypeSpec
import java.io.File
import kotlin.reflect.KMutableProperty1

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
object PoetApp2ExtensionBased {
    val nameAndExactPropertyNames = listOf("name", "exact")
    val convertedNameProperties = listOf(
        Pair("exactName", String::class.asTypeName()), // exactName is first in this list, allows it to be the first argument in the resulting functions
        Pair("containsName", String::class.asTypeName()),
        Pair("regexName", Regex::class.asTypeName())
    )

    @OptIn(KotlinPoetMetadataPreview::class, ExperimentalStdlibApi::class)
    @JvmStatic
    fun main(vararg param: String) {
        val originalSpec = CustomLocatorImpl::class.toTypeSpec()
        val (baseExtensionsRoleBasedSpecs, baseExtensionsNonRoleBasedSpecs)  = BaseExtensions::class.toTypeSpec().funSpecs.partition { it.name.endsWith("Role") }

        val byAriaRoleFunctions = createByAriaRoleFunctions(originalSpec.funSpecs + baseExtensionsRoleBasedSpecs)

        val optionalParamsFunctions = createOptionalParamsFunctions(originalSpec.funSpecs + byAriaRoleFunctions + baseExtensionsNonRoleBasedSpecs)

        val generatedClassName = "GeneratedLocator2Impl"

//        val specBuilder = TypeSpec.classBuilder(generatedClassName)
//            .addModifiers(KModifier.OPEN)
//            .superclass(CustomLocatorImpl::class.asTypeName())
//            .primaryConstructor(
//                FunSpec.constructorBuilder().addParameter("locator", Locator::class.asTypeName()).build()
//            )
//            .addSuperclassConstructorParameter(CodeBlock.of("locator"))
//            .addFunctions(optionalParamsFunctions)
//            .addFunctions(byAriaRoleFunctions)
//            .build()

        FileSpec.builder("com.lazyengineer.playwright.test.generated", generatedClassName)
            .also { builder ->
                optionalParamsFunctions.forEach { funSpec ->
                    builder.addFunction(funSpec)
                }
            }
            .addImport(BaseExtensions::class, (baseExtensionsRoleBasedSpecs + baseExtensionsNonRoleBasedSpecs).map { it.name })
            .build()
            .writeTo(File("./src/main/kotlin/").also { println("path = ${it.canonicalPath}/$generatedClassName.kt") })
    }

    private fun createByAriaRoleFunctions(funSpecs: List<FunSpec>): List<FunSpec> {
        val byRoleFunctionNamePostfix = "ByRole"
        return funSpecs.filter { it.name.endsWith(byRoleFunctionNamePostfix) && it.parameters.size == 2 }
            .flatMap {
                val functionPrefix = it.name.replace(byRoleFunctionNamePostfix, "")
                AriaRole.entries.map { ariaRole ->
                    val extensionFunction =
                        FunSpec.builder("${functionPrefix}Aria${ariaRole.name.lowercase().capitalize()}")
                            .receiver(Locator::class)
                            .addStatement("""return this.${functionPrefix}${byRoleFunctionNamePostfix}(AriaRole.${ariaRole.name}, options)""")
                            .addParameters(it.parameters.takeLast(it.parameters.size - 1))
                            .returns(it.returnType)
                            .build()
                    println("extensionBuilder = ${extensionFunction}")

//                    it.toBuilder("${functionPrefix}Aria${ariaRole.name.lowercase().capitalize()}")
//                        .apply {
//                            parameters.removeAt(0)
//                        }
//                        .clearBody()
//                        .addStatement("""return super.${functionPrefix}${byRoleFunctionNamePostfix}(AriaRole.${ariaRole.name}, options)""")
//                        .build()
                    extensionFunction
                }
            }
    }

    private fun createOptionalParamsFunctions(funSpecs: List<FunSpec>): List<FunSpec> {
        funSpecs.mapNotNull {
            it.parameters.filter { it.type is ClassName && (it.type as ClassName).simpleName.contains("Options") }
                .firstOrNull()
        }

        val hasOptions: (ParameterSpec) -> Boolean = { parameterSpec ->
            parameterSpec.type is ClassName
                    && (parameterSpec.type as ClassName).simpleName.contains("Options")
        }

        val optionalParamsFunctions = funSpecs.mapNotNull { funSpec ->
            if (funSpec.parameters.any(hasOptions)) {
                funSpec
            } else null
        }.filter {
            !it.name.endsWith("Orig")
        }.map {
            Pair(it, it.parameters.indexOfFirst(hasOptions))
        }.map { createFunctionWithOptionsToOptionalParamsFunction(it.first, it.second) }
        return optionalParamsFunctions
    }

    private fun createFunctionWithOptionsToOptionalParamsFunction(funSpec: FunSpec, optionsParamIndex: Int): FunSpec {
        val optionsClassName = funSpec.parameters[optionsParamIndex].type as ClassName
        val optionsClass = Class.forName(optionsClassName.reflectionName())
        val optionClassSimpleName = optionsClassName.canonicalName.replace(optionsClassName.packageName + ".", "")
        val origOptionsMemberNameAndReturnTypes =
            (optionsClass.kotlin.members as List).filter { it is KMutableProperty1<*, *> }
                .map { Pair(it.name, it.returnType.asTypeName()) }

        val (optionsMemberNameAndReturnTypes, optionsContainsNameAndExact) = applyAnyNameAndExactPropertyConversion(
            origOptionsMemberNameAndReturnTypes
        )


        val funBuilder = funSpec.toBuilder(funSpec.name)
        funBuilder.parameters.removeAt(optionsParamIndex)
        funBuilder.modifiers.clear()
        funBuilder.clearBody()
        val optionsLines = (optionsMemberNameAndReturnTypes)
            .map { (name, returnType) ->
                funBuilder.addParameter(
                    ParameterSpec.builder(name, returnType.copy(nullable = true))
                        .defaultValue("%L", null)
                        .build()
                )
                getOptionsSetterCode(name, optionsContainsNameAndExact)
            }
        funBuilder.addStatement(getOptionsStatement(optionClassSimpleName, optionsLines, funSpec))

        funBuilder.receiver(Locator::class)

        return funBuilder.build()
    }

    /**
     * Convert options that have both "name" and "exact" to instead more precise "containsName", "exactName", and "regexName"
     */
    private fun applyAnyNameAndExactPropertyConversion(origOptionsMemberNameAndReturnTypes: List<Pair<String, TypeName>>): Pair<List<Pair<String, TypeName>>, Boolean> {
        val optionsContainsNameAndExact =
            origOptionsMemberNameAndReturnTypes.map { it.first }.containsAll(nameAndExactPropertyNames)

        val optionsMemberNameAndReturnTypes = if (optionsContainsNameAndExact) {
            origOptionsMemberNameAndReturnTypes.filter { (name, _) -> !nameAndExactPropertyNames.contains(name) }
        } else {
            origOptionsMemberNameAndReturnTypes
        }
        val nameMemberNameAndReturnTypes = if (optionsContainsNameAndExact) {
            convertedNameProperties
        } else emptyList()
        //TODO: also handle getBy*Text(text:String, options) methods->getBy*Text(containsText, exactText, regexText)
        return Pair(nameMemberNameAndReturnTypes + optionsMemberNameAndReturnTypes, optionsContainsNameAndExact)
    }

    private fun getOptionsSetterCode(name: String, optionsContainsNameAndExact: Boolean): String {
        return if (!optionsContainsNameAndExact || convertedNameProperties.none { it.first == name }) {
            "this.${name} = ${name}"
        } else if (name == "exactName") { // all 3 "name" members are rendered at the same time
            """
            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null){
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }
            """.trimIndent()
        } else ""
    }

    private fun getOptionsStatement(
        optionClassSimpleName: String,
        optionsLines: List<String>,
        funSpec: FunSpec
    ): String {
        val existingBodySuperCall = if (funSpec.body.toString().contains("this")) funSpec.body.toString() else null
        val superLine = if (existingBodySuperCall != null) {
            existingBodySuperCall
        } else {
            val returnSnippet = if (funSpec.returnType.toString() != "kotlin.Unit") {
                "return "
            } else {
                ""
            }
            """${returnSnippet}this.${funSpec.name}(${funSpec.parameters.joinToString() { it.name }})"""
        }


        return """val options = $optionClassSimpleName().apply {
                ${optionsLines.joinToString("\n    ")}
            }
            $superLine
                                 """.trimIndent()
    }

}

