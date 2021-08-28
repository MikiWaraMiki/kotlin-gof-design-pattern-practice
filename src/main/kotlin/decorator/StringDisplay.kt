package decorator

/**
 * String Display
 * 1行の文字列を表示する
 */
class StringDisplay(private val string: String): Display() {

    override fun getColumns(): Int {
        return string.toByteArray().size
    }

    override fun getRows(): Int {
        return 1
    }

    override fun getRowText(row: Int): String {
        if (row != 0) throw IllegalArgumentException("rowは0の必要があります")

        return string
    }
}