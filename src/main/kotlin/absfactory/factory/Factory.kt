package absfactory.factory

abstract class Factory {
    companion object {
        fun getFactory(className: String): Factory {
            val factory = try {
               Class.forName(className).kotlin as Factory
            } catch (e: Exception) {
                throw e
            }
            return factory
        }
    }

    abstract fun createLink(caption: String, url: String): Link
    abstract fun createTray(caption: String): Tray
    abstract fun createPage(title: String, author: String): Page
}