package adapters.patternex

/**
 * Bannerクラス
 * Adapterパターンの提供されているものに該当
 */
open class Banner(val text: String) {

    fun showWithParen(): String {
        return "(${text})"
    }

    fun showWithAster(): String {
        return "*${text}*"
    }
}