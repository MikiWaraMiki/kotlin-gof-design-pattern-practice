package templates

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StringDisplayTest {
    private val stDisplay: AbstractDisplay = StringDisplay("Hello, world.")

    @Test
    fun printTest() {
        val expected = """
        +-------------+
        |Hello, world.|
        |Hello, world.|
        |Hello, world.|
        |Hello, world.|
        |Hello, world.|
        +-------------+
        
        """.trimIndent()

        val result = stDisplay.display()
        Assertions.assertEquals(expected, result)
    }
}