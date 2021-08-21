package absfactory.listfactory

import absfactory.factory.Factory
import absfactory.factory.Link
import absfactory.factory.Page
import absfactory.factory.Tray

class ListFactory: Factory() {
    override fun createLink(caption: String, url: String): Link {
        return ListLink(caption, url)
    }

    override fun createTray(caption: String): Tray {
        return ListTray(caption)
    }

    override fun createPage(title: String, author: String): Page {
        return ListPage(title, author)
    }
}