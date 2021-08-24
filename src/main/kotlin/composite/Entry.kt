package composite

import kotlin.jvm.Throws

abstract class Entry {
    abstract fun getName(): String
    abstract fun getSize(): Int
    abstract fun printList(prefix: String): String

    @Throws(FileTreatmentException::class)
    fun addEntry(entry: Entry) {
        throw FileTreatmentException("")
    }

    override fun toString(): String {
        return "${getName()}(${getSize()})"
    }
}