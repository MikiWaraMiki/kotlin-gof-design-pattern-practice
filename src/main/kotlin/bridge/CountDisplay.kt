package bridge

/**
 * 指定した回数表示するクラス
 * 機能のクラス階層
 */
open class CountDisplay(impl: DisplayImpl): Display(impl) {

    fun multiDisplay(time: Int): String {
        var result = ""
        result += open() + "\n"
        for (i in 1..time) {
            result += print() + "\n"
        }
        result += close()

        return result
    }
}