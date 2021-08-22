package bridge

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import templates.StringDisplay

class DisplayTest {
    private val display = Display(StringDisplayImpl("Hello"))

    @Test
    @DisplayName("displayから返却される文字列が正しいこと")
    fun testDisplay() {
        val expected = """
            +-----+
            |Hello|
            +-----+
        """.trimIndent()

        Assertions.assertEquals(expected, display.display())
    }
}