package decorator

/**
 * Display
 * 複数行からなる文字列を表示するための抽象クラス
 */
abstract class Display {
    abstract fun getColumns(): Int
    abstract fun getRows(): Int
    abstract fun getRowText(row: Int): String

    fun show(): String {
        var result = ""
        for (i in 1..getRows()) {
            result += "${getRowText(i)}\n"
        }
        return result
    }
}