package absfactory.news

import absfactory.factory.Factory
import absfactory.listfactory.ListFactory

class NewsHTMLPageGenerator {
    companion object {
        fun execute(command: GeneratorCommandEnum) {
            val factory = try {
                Factory.getFactory(command.className)
            } catch(e: Exception) {
                e.printStackTrace()
                throw e
            }

            val link1 = factory.createLink("Example1", "https://1.example.com")
            val link2 = factory.createLink("Example2", "https://2.example.com")
            val link3 = factory.createLink("Example3", "https://3.example.com")

            val trayNews1 = factory.createTray("Example News")
            trayNews1.add(link1)
            trayNews1.add(link2)

            val trayNews2 = factory.createTray("Example News 2")
            trayNews2.add(link3)

            val page = factory.createPage("Example Page", "Author")

            page.add(trayNews1)
            page.add(trayNews2)

            page.output()
        }
    }
}