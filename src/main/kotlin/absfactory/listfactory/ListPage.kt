package absfactory.listfactory

import absfactory.factory.Page

class ListPage(title: String, author: String): Page(title, author) {
    override fun makeHtml(): String {
        val buffer = StringBuffer()

        buffer.append("<html><head><title>${title}</title></head>\n")
        buffer.append("<body>\n")
        buffer.append("<h1>${title}</h1>\n")
        buffer.append("<ul>\n")
        content.forEach {
            buffer.append(it.makeHTML())
        }
        buffer.append("</ul>\n")
        buffer.append("<hr><address>${author}</address>\n")
        buffer.append("</body></html>\n")
        return buffer.toString()
    }
}