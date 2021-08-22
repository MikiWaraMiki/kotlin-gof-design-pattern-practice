package bridge

/**
 * 表示するクラス
 * 機能のクラス階層
 */
open class Display(private val impl: DisplayImpl) {

    fun open(): String {
        return impl.rawOpen()
    }

    fun print(): String {
        return impl.rawPrint()
    }

    fun close(): String {
        return impl.rawClose()
    }

    fun display(): String {
        return """
            ${open()}
            ${print()}
            ${close()}
        """.trimIndent()
    }
}