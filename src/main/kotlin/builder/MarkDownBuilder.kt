package builder

class MarkDownBuilder: Builder {
    private val buffer = StringBuffer()

    override fun makeTitle(title: String) {
        buffer.append("# ${title}\n")
        buffer.append("\n")
    }

    override fun makeString(str: String) {
        buffer.append("## ${str}\n")
    }

    override fun makeItems(items: List<String>) {
        items.forEach {
            buffer.append("- ${it}\n")
        }
        buffer.append("\n")
    }

    override fun close() {
        buffer.append("---")
    }

    fun getResult(): String {
        return buffer.toString()
    }
}