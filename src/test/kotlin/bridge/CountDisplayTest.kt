package bridge

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class CountDisplayTest {
    val cntDisplay = CountDisplay(StringDisplayImpl("Hello"))

    @Test
    @DisplayName("multiDisplayから生成される文字列が正しいこと")
    fun testMultiDisplay() {
        val expected = """
            +-----+
            |Hello|
            |Hello|
            |Hello|
            +-----+
        """.trimIndent()

        Assertions.assertEquals(expected, cntDisplay.multiDisplay(3))
    }
}