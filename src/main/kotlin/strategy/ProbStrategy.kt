package strategy

import kotlin.random.Random

class ProbStrategy(seed: Int): Strategy {
    private val random = Random(seed)
    private var prevHandValue = 0
    private var currentHandValue = 0
    private val history = Array(3) { arrayOfNulls<Int>(3) }

    init {
        history[0][0] = 1
        history[0][1] = 1
        history[0][2] = 1
        history[1][0] = 1
        history[1][1] = 1
        history[1][2] = 1
        history[2][0] = 1
        history[2][1] = 1
        history[2][2] = 1
    }

    override fun nextHand(): Hand {
        val bet = random.nextInt(getSum(currentHandValue))

        val currentHandValueHistoryFirst = history[currentHandValue][0] ?: 0
        val currentHandValueHistorySecond = history[currentHandValue][1] ?: 0

        val handValue = if (bet < currentHandValueHistoryFirst) {
            0
        } else if (bet < (currentHandValueHistoryFirst + currentHandValueHistorySecond)) {
            1
        } else {
            2
        }

        prevHandValue = currentHandValue
        currentHandValue = handValue

        return Hand.getHand(handValue)
    }

    override fun study(win: Boolean) {
        if (win) {
            history[prevHandValue][currentHandValue]?.inc()
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]?.inc()
            history[prevHandValue][(currentHandValue + 2) % 3]?.inc()
        }
    }

    private fun getSum(hv: Int): Int {
        var sum = 0
        for (i in 1..3) {
            val hist = history[hv][i] ?: continue
            sum += hist
        }
        return sum
    }
}