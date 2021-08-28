package decorator

/**
 * 文字列の左右に飾り枠をつける実装クラス
 */
class SideBoarder(
    display: Display,
    private val borderChar: Char
): Border(display) {

    override fun getColumns(): Int {
        return 1 + display.getColumns() + 1 // 文字数の左右に飾り文字をつけた
    }

    override fun getRows(): Int {
        return display.getRows()
    }

    override fun getRowText(row: Int): String {
        return "${borderChar}${display.getRowText(row)}${borderChar}"
    }

}