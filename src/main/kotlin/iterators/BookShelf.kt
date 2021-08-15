package iterators

/**
 * 本棚クラス
 */
class BookShelf() : Aggregate {
    private val books: MutableList<Book> = mutableListOf()
    private var last = 0

    fun length(): Int {
        return last
    }

    fun getBookAt(index: Int): Book {
        return books[index]
    }

    fun appendBook(book: Book) {
        books.add(last, book)
        last++
    }

    override fun iterator(): Iterator {
        return BookShelfIterator(this)
    }
}