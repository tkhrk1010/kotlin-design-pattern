package designpattern.factorymethod.idcard

import designpattern.factorymethod.framework.*
class IDCard : Product {
    constructor(owner: String) {
        println("${owner}のカードを作ります。")
        this.owner = owner
    }
    override fun use() {
        println("${owner}のカードを使います。")
    }
    private var owner: String = ""
    fun getOwner(): String = owner
}