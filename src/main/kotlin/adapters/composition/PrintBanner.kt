package adapters.composition

class PrintBanner(text: String): Print() {
    private val banner = Banner(text)

    override fun printWeak(): String {
        return banner.showWithParen()
    }

    override fun printStrong(): String {
        return banner.showWithAster()
    }
}