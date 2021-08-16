package templates

/**
 * Stringを表示するサブクラス
 */
class StringDisplay(private val string: String): AbstractDisplay() {
    private val width = string.length

    override fun open(): String {
        return printLine()
    }

    override fun print(): String {
        return "|${string}|\n"
    }

    override fun close(): String {
        return printLine()
    }

    private fun printLine(): String {
        var result = "+"
        result += "-".repeat(width)
        result += "+\n"

        return result
    }
}