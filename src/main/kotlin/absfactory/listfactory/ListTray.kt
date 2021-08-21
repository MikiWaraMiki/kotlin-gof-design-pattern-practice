package absfactory.listfactory

import absfactory.factory.Tray

class ListTray(caption: String): Tray(caption) {
    override fun makeHTML(): String {
        val buffer = StringBuffer()

        buffer.append("<li>\n")
        buffer.append("${caption}\n")
        buffer.append("<ul>\n")

        tray.forEach {
            buffer.append(it.makeHTML())
        }
        buffer.append("</ul>\n")
        buffer.append("</li>\n")

        return buffer.toString()
    }
}