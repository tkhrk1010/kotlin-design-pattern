package kotlinDesignPattern.Adapter

class App {
    fun main() {
        println("Adapter")
        val printBanner = PrintBanner("Hello")
        printBanner.printWeak()
        printBanner.printStrong()
    }
}