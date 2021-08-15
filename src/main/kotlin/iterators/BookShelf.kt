package iterators

/**
 * 本棚クラス
 */
class BookShelf(maxsize: Int) : Aggregate {
    private val books: Array<Book?>
    private var last = 0

    init {
        books = arrayOfNulls<Book>(maxsize)
    }

    fun length(): Int {
        return last
    }

    fun getBookAt(index: Int): Book? {
        return books[index]
    }

    fun appendBook(book: Book) {
        books[last] = book
        last++
    }

    override fun iterator(): Iterator {
        return BookShelfIterator(this)
    }
}