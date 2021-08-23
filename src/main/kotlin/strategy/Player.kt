package strategy

class Player(
    private val name: String,
    private val strategy: Strategy
) {
    private var winCount = 0
    private var loseCount = 0
    private var gameCount = 0

    fun nextHand(): Hand {
        return strategy.nextHand()
    }

    fun win() {
        strategy.study(true)
        winCount.inc()
        gameCount.inc()
    }

    fun lose() {
        strategy.study(false)
        loseCount.inc()
        gameCount.inc()
    }

    fun even() {
        gameCount.inc()
    }

    override fun toString(): String {
        return "[$name: $gameCount games, $winCount win, $loseCount lose]"
    }
}