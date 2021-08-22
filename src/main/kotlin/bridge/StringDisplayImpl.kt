package bridge

class StringDisplayImpl(
    private val string: String
): DisplayImpl {
    private val width = string.toByteArray().size

    override fun rawOpen(): String {
        return printLine()
    }

    override fun rawPrint(): String {
        return "|${string}|"
    }

    override fun rawClose(): String {
        return printLine()
    }

    private fun printLine(): String {
        return "+${"-".repeat(width)}+"
    }

}