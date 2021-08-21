package absfactory.tablefactory

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class TablePageTest {

    @Test
    @DisplayName("生成されるHTMLが正しい形式であること")
    fun testMakeHtml() {
        val tablePage = TablePage("Test", "Author")
        val tableTray = TableTray("テスト")
        tableTray.add(TableLink("Example", "https://example.com"))
        tablePage.add(tableTray)

        val expected = """
            <html>
            <head>
            <title>Test</title>
            </head>
            <body>
            <h1>Test</h1>
            <table width="80%" border="3">
            <td>
            <table width="100%" border="1">
            <tr>
            <td bgcolor="#cccccc" align="center" colspan="1">
            <b>テスト</b>
            </td>
            <tr>
            <td><a href="https://example.com">Example</a></td>
            </tr>
            </table>
            </td>
            </table>
            <hr><address>Author</address></hr>
            </body>
            </html>
        """.trimIndent()

        println(tablePage.makeHtml())

        Assertions.assertEquals(expected, tablePage.makeHtml())
    }
}