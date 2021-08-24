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
        val prefix = "${prefix}/${name}"
        var result = prefix + "\n"

        directory.forEach { entry ->
            result += entry.printList(prefix)
            if (result.last() != '\n')
                result += "\n"
        }

        return result
    }


}