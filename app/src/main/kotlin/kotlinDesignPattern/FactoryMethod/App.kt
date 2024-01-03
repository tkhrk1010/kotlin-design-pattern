package kotlinDesignPattern.FactoryMethod

import kotlinDesignPattern.FactoryMethod.idcard.*
class App {
    fun main() {
        val factory = IDCardFactory()
        val product = factory.create("ID001")
        product.use()
    }
}