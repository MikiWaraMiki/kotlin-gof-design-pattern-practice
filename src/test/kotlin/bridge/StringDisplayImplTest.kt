package bridge

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class StringDisplayImplTest {
    private val disp = StringDisplayImpl("test")

    @Test
    @DisplayName("rawOpenから返却される文字列が正しいこと")
    fun testRawOpen() {
        val expected = "+----+"

        Assertions.assertEquals(expected, disp.rawOpen())
    }

    @Test
    @DisplayName("rawPrintから返却される文字列が正しいこと")
    fun testRawPrint() {
        val expected = "|test|"

        Assertions.assertEquals(expected, disp.rawPrint())
    }

    @Test
    @DisplayName("rawCloseから返却される文字列が正しいこと")
    fun testRawClose() {
        val expected = "+----+"

        Assertions.assertEquals(expected, disp.rawClose())
    }
}