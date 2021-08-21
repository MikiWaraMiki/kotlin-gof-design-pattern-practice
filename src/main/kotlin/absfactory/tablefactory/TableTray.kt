package absfactory.tablefactory

import absfactory.factory.Tray

class TableTray(caption: String): Tray(caption) {
    override fun makeHTML(): String {
        val itemHTML = tray.fold("") { resultHtml, item ->
            val html = item.makeHTML()
            resultHtml + html
        }
        return """
            <td>
            <table width="100%" border="1">
            <tr>
            <td bgcolor="#cccccc" align="center" colspan="${tray.size}">
            <b>$caption</b>
            </td>
            <tr>
            $itemHTML
            </tr>
            </table>
            </td>
        """.trimIndent()
    }
}