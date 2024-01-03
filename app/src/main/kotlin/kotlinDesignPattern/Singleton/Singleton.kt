package kotlinDesignPattern.Singleton

class Singleton {
    companion object {
        private val singleton = Singleton()
        fun getInstance(): Singleton = singleton
    }
}