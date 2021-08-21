package absfactory.listfactory

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ListPageTest {
    @Test
    @DisplayName("生成されるHTMLが正しいこと")
    fun testMakeHtml() {
        val listPage = ListPage("テスト", "テスト")
        listPage.add(
            ListLink("Google", "https://google.com")
        )

        val expected = """
            <html><head><title>テスト</title></head>
            <body>
            <h1>テスト</h1>
            <ul>
            <li><a href="https://google.com">Google</a></li>
            </ul>
            <hr><address>テスト</address>
            </body></html>
            
        """.trimIndent()

        Assertions.assertEquals(expected, listPage.makeHtml())
    }
}