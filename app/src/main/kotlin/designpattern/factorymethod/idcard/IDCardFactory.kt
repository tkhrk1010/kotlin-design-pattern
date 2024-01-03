package designpattern.factorymethod.idcard

import designpattern.factorymethod.framework.*
class IDCardFactory : Factory() {
    private val owners = mutableListOf<String>()
    override fun createProduct(owner: String): Product {
        return IDCard(owner)
    }

    // 抽象に依存するため、IDCardではなくProduct型を引数に取る
    override fun registerProduct(product: Product) {
        // この方法は型安全性が低下するため、可能であればProductインターフェースに必要なメソッドを定義することで、この問題を回避する方が望ましい
        owners.add((product as IDCard).getOwner())
    }
    fun getOwners(): List<String> {
        return owners
    }
}