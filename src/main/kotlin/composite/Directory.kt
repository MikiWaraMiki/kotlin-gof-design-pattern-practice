package composite

class Directory(
    private val name: String
): Entry() {
    private val directory = mutableListOf<Entry>()

    override fun getName(): String {
        return name
    }

    override fun getSize(): Int {
        return directory.fold(0) { result, entry ->
            result + entry.getSize()
        }
    }

    override fun addEntry(entry: Entry) {
        directory.add(entry)
    }


    override fun printList(prefix: String): String {
        var result = ""
        val prefix = "${prefix}/${name}"

        directory.forEach { entry ->
            result += entry.printList(prefix) + "\n"
        }

        return result
    }


}