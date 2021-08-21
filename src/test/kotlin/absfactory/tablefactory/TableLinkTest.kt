package absfactory.tablefactory

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class TableLinkTest {

    @Test
    @DisplayName("生成されるHTMLが正しいこと")
    fun testMakeHTML() {
        val tableLink = TableLink("Google", "https://google.com")
        val expected = """
            <td><a href="https://google.com">Google</a></td>
        """.trimIndent()

        Assertions.assertEquals(expected, tableLink.makeHTML())
    }
}