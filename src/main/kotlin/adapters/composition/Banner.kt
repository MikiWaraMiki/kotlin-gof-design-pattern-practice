package adapters.composition

/**
 * Bannerクラス
 * Adapterパターンの提供されているものに該当
 */
open class Banner(private val text: String) {

    fun showWithParen(): String {
        return "(${text})"
    }

    fun showWithAster(): String {
        return "*${text}*"
    }
}