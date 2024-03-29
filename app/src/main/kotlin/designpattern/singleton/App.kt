package designpattern.singleton

fun main() {
    val obj1 = Singleton.getInstance()
    val obj2 = Singleton.getInstance()
    if (obj1 == obj2) {
        println("obj1とobj2は同じインスタンスです。")
    } else {
        println("obj1とobj2は同じインスタンスではありません。")
    }
}