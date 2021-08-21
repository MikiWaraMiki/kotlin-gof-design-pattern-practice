package absfactory.listfactory

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ListLinkTest {
    @Test
    @DisplayName("返却される文字列が正しいこと")
    fun testMakeHtml() {
        val listLink = ListLink("Google", "https://google.com")
        val expected = """
            <li><a href="https://google.com">Google</a></ul>
            
        """.trimIndent()

        Assertions.assertEquals(expected, listLink.makeHTML())
    }
}