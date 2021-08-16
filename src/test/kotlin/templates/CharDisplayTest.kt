package templates

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CharDisplayTest {
    private val chDisplay: AbstractDisplay = CharDisplay('a')

    @Test
    fun displayTest() {
        val result = chDisplay.display()

        Assertions.assertEquals("<<aaaaa>>", result)
    }
}