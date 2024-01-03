package kotlinDesignPattern.singleton

class Singleton {
    companion object {
        private val singleton = Singleton()
        fun getInstance(): Singleton = singleton
    }
}