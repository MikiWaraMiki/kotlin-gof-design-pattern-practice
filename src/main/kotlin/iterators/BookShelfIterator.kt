package iterators

class BookShelfIterator(private val bookShelf: BookShelf): Iterator {
    private var index = 0

    override fun hasNext(): Boolean {
        if (index < bookShelf.length()) return true

        return false
    }

    override fun next(): Any {
        val book = bookShelf.getBookAt(index)
        index++

        return book as Any
    }
}