package absfactory.listfactory

import absfactory.factory.Link

class ListLink(caption: String, url: String): Link(caption, url) {
    override fun makeHTML(): String {
        return "<li><a href=\"${url}\">${caption}</a></ul>\n"
    }
}