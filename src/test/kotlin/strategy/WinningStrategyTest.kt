package strategy

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class WinningStrategyTest {
    @Test
    @DisplayName("前回処理している場合は前回と同じ手を出すこと")
    fun testWhenPrevWin() {
        val strategy = WinningStrategy(314)
        val prevHand = strategy.nextHand()

        strategy.study(true)

        Assertions.assertEquals(prevHand, strategy.nextHand())
    }
}