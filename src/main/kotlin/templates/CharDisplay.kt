package templates

/**
 * Charを表示するサブクラス
 * <<HHHHH>>といった内容を表示
 */
class CharDisplay(private val ch: Char): AbstractDisplay() {
    override fun open(): String {
        return "<<"
    }

    override fun print(): String {
        return ch.toString()
    }

    override fun close(): String {
        return ">>"
    }
}