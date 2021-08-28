package decorator

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class FullBoarderTest {
    private val fullBorder = FullBoarder(
        StringDisplay("ホゲホゲホゲ")
    )
    @Test
    @DisplayName("0を渡した時に上端の飾り枠を返すこと")
    fun returnTopBoarder() {
        val expected = "+------------------+"
        Assertions.assertEquals(expected, fullBorder.getRowText(0))
    }

    @Test
    @DisplayName("行数+1を渡した時に下端の飾り枠を返すこと")
    fun returnBottomBorder() {
        val expected = "+------------------+"
        Assertions.assertEquals(expected, fullBorder.getRowText(2))
    }

    @Test
    @DisplayName("文字列を返すこと")
    fun returnText() {
        val expected = "|ホゲホゲホゲ|"

        Assertions.assertEquals(expected, fullBorder.getRowText(1))
    }
}