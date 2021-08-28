package decorator

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class SideBoarderTest {

    @Test
    @DisplayName("飾り枠がついた文字列を返すこと")
    fun returnStringWithBorderChar() {
        val sideBorder = SideBoarder(
            StringDisplay("ホゲホゲ"),
            '|'
        )

        val expected = "|ホゲホゲ|"

        Assertions.assertEquals(expected, sideBorder.getRowText(0))
    }
}