package decorator

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class StringDisplayTest {

    @Test
    @DisplayName("rowが0の場合は、文字列を返すこと")
    fun returnStringWhenRowIsZero() {
        val display = StringDisplay("ホゲホゲ")

        Assertions.assertEquals("ホゲホゲ", display.getRowText(0))
    }

    @Test
    @DisplayName("rowが0以外の場合は、例外が発生すること")
    fun raiseErrorThenRowIsNotZero() {
        val display = StringDisplay("ホゲホゲ")

        val error = assertThrows<IllegalArgumentException> {
            display.getRowText(1)
        }

        Assertions.assertEquals("rowは0の必要があります", error.message)
    }
}