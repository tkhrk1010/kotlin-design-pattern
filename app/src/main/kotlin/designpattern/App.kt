/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package designpattern


class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
    designpattern.iterator.App().main()
    designpattern.adapter.App().main()
    designpattern.factorymethod.main()
    designpattern.singleton.main()
    designpattern.strategy.App().main()
}
