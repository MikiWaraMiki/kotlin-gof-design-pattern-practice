package templates

/**
 * Abstract Display
 * Template抽象クラス
 */
abstract class AbstractDisplay {
    abstract fun open(): String
    abstract fun print(): String
    abstract fun close(): String
    fun display(): String {
        var result = open()
        for (i in 1..5) {
            result += print()
        }
        result += close()

        return result
    }
}