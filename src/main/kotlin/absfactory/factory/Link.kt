package absfactory.factory

/**
 * ハイパーリンクの抽象クラス
 */
abstract class Link(caption: String, val url: String): Item(caption) {
}