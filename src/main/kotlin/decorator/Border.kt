package decorator

/**
 * 飾り枠の抽象クラス
 */
abstract class Border(
    protected val display: Display
): Display() {
}