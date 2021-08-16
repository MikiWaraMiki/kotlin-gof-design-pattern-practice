package adapters.patternex

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PrintBannerTest {
    private val printBanner: Print = PrintBanner("text")

    @Test
    fun printWeakTest() {
        val result = printBanner.printWeak()

        Assertions.assertEquals("(text)", result)
    }

    @Test
    fun printStrongTest() {
        val result = printBanner.printStrong()

        Assertions.assertEquals("*text*", result)
    }
}