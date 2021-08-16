package iterators

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class BookShelfTest {
    private val bookShelf =  BookShelf()

    @BeforeEach
    fun setup() {
        bookShelf.appendBook(Book("Book1"))
        bookShelf.appendBook(Book("Book2"))
        bookShelf.appendBook(Book("Book3"))
        bookShelf.appendBook(Book("Book4"))
        bookShelf.appendBook(Book("Book5"))
    }

    @Test
    fun testLength() {
        Assertions.assertEquals(5,bookShelf.length())
    }

    @Test
    fun testIterator() {
        val it = bookShelf.iterator()
        while(it.hasNext()) {
            val book = it.next() as Book
            println(book.name)
            Assertions.assertNotNull(book)
        }
    }
}