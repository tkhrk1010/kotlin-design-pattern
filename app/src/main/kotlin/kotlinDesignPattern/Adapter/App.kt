package kotlinDesignPattern.Adapter

class App {
    fun main() {
        println("Adapter")
        val printBanner: Print = PrintBanner("Hello")
        printBanner.printWeak()
        printBanner.printStrong()
    }
}