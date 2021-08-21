package absfactory.tablefactory

import absfactory.factory.Page

class TablePage(title: String, author: String): Page(title, author) {

    override fun makeHtml(): String {
        val contentHtml = content.fold("") { result, aContent ->
            val html = aContent.makeHTML()
            result + html
        }
        return """
            |<html>
            |<head>
            |<title>$title</title>
            |</head>
            |<body>
            |<h1>$title</h1>
            |<table width="80%" border="3">
            |$contentHtml
            |</table>
            |<hr><address>$author</address></hr>
            |</body>
            |</html>
        """.trimMargin("|")
    }
}