package iterators

interface Iterator {
    fun hasNext(): Boolean
    fun next(): Any
}