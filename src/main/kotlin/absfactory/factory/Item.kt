package absfactory.factory

/**
 * LinkとTrayの抽象クラス
 */
abstract class Item(protected val caption: String) {

    abstract fun makeHTML(): String
}