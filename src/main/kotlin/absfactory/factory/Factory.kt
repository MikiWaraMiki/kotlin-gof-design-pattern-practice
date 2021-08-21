package absfactory.factory

import absfactory.listfactory.ListFactory
import kotlin.ClassCastException
import kotlin.reflect.cast

abstract class Factory {
    companion object {
        fun getFactory(className: String): Factory {
            val factory = try {
                val cls = Class.forName(className).kotlin
                cls.objectInstance ?: cls.java.getDeclaredConstructor().newInstance()
            } catch (e: Exception) {
                throw e
            }
            return factory as Factory
        }
    }

    abstract fun createLink(caption: String, url: String): Link
    abstract fun createTray(caption: String): Tray
    abstract fun createPage(title: String, author: String): Page
}