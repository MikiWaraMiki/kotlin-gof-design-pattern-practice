package absfactory.factory

import java.io.FileWriter
import java.io.IOException

/**
 * HTMLページ全体を抽象的に表したクラス
 */
abstract class Page(
    protected val title: String,
    protected val author: String
) {
    protected val content = mutableListOf<Item>()

    fun add(aItem: Item) {
        content.add(aItem)
    }

    fun output(): String {
        try {
            val fileName = "${title}.html"
            val writer = FileWriter(fileName)
            writer.write(makeHtml())
            writer.close()
            return fileName
        } catch(e: IOException) {
            e.printStackTrace()
            throw e
        }
    }

    abstract fun makeHtml(): String
}