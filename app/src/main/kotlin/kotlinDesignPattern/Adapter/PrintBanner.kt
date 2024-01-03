package kotlinDesignPattern.Adapter

class PrintBanner(private val banner: Banner) : Print() {
    constructor(string: String) : this( Banner(string) )
    override fun printWeak() {
        banner.showWithParen()
    }
    override fun printStrong() {
        banner.showWithAster()
    }
}