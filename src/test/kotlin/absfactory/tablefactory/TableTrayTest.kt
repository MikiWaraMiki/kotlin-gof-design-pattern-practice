package absfactory.tablefactory

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class TableTrayTest {
    @Test
    @DisplayName("生成されるHTMLが正しいこと")
    fun makeHTMLTest() {
        val tableTray = TableTray("テスト")
        tableTray.add(TableLink("Example", "https://example.com"))

        val expected = """
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
        """.trimIndent()

        Assertions.assertEquals(expected, tableTray.makeHTML())
    }
}