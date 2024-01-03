package designpattern.adapter

class App {
    fun main() {
        println("adapter")
        val printBanner: Print = PrintBanner("Hello")
        printBanner.printWeak()
        printBanner.printStrong()
    }
}