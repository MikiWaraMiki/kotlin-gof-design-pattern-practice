package composite

class File(
    private val name: String,
    private val size: Int
): Entry() {

    override fun getName(): String {
        return name
    }

    override fun getSize(): Int {
        return size
    }

    override fun printList(prefix: String): String {
        return "${prefix}/${name}"
    }
}