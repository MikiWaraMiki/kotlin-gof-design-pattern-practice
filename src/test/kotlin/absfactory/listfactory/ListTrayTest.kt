package absfactory.listfactory

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ListTrayTest {
    @Test
    @DisplayName("返却されるHTMLが正しいこと")
    fun testMakeHtml() {
        val listTray = ListTray("テスト")
        listTray.add(ListLink("Google", "https://google.com"))

        val expected = """
            <li>
            テスト
            <ul>
            <li><a href="https://google.com">Google</a></li>
            </ul>
            </li>
            
        """.trimIndent()

        Assertions.assertEquals(expected, listTray.makeHTML())
    }
}