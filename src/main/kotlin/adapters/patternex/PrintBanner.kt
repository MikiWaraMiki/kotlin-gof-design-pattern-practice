package adapters.patternex

/**
 * PrintBanner
 * Adapterに該当する
 */
class PrintBanner(text: String): Banner(text), Print {
    override fun printWeak(): String {
        return showWithParen()
    }

    override fun printStrong(): String {
        return showWithAster()
    }
}