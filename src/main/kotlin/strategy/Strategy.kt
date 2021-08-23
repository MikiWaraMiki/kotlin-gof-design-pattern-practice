package strategy

/**
 * ジャンケンの戦略interface
 */
interface Strategy {
    fun nextHand(): Hand
    fun study(win: Boolean)
}