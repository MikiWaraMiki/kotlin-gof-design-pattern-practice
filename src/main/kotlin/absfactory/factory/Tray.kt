package absfactory.factory

/**
 * Link Trayを集めた抽象クラス
 */
abstract class Tray(caption: String): Item(caption) {
    protected val tray = mutableListOf<Item>()

    fun add(aItem: Item) {
        tray.add(aItem)
    }
}