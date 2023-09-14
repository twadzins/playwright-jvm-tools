package sandbox

import com.microsoft.playwright.Locator
import com.microsoft.playwright.Page

@Suppress("FunctionName")
inline fun <reified T> Foo() = Foo(T::class.java)

open class Foo<T>(private val type: Class<T>) {
    val name: String get() = type.name
    fun newInstance(): T = type.newInstance()
}

class StringFoo : Foo<String>(String::class.java)

fun main() {
//    println(Foo<Int>().name)   // java.lang.Integer
//    println(StringFoo().name)  // java.lang.String

    println(Foo1<String>(String::class.java).name)   // java.lang.Integer

}

@Suppress("FunctionName")
inline fun <reified T> Foo1() = Foo1(T::class.java)

@JvmInline
value class Foo1<T>(private val type: Class<T>) {
    val name: String get() = type.name
    fun newInstance(): T = type.newInstance()
}

inline fun <reified T : Locator> Page.openPage1(url: String): T {
    navigate(url)
    val declaredConstructor = T::class.java.getDeclaredConstructor(Locator::class.java)
    declaredConstructor.trySetAccessible()
    val newInstance = declaredConstructor.newInstance(this.locator("body"))
    return newInstance
}
