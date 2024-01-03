package designpattern.factorymethod

import designpattern.factorymethod.idcard.*

fun main() {
    val factory = IDCardFactory()
    val product = factory.create("ID001")
    product.use()
}