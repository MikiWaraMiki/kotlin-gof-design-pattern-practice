package prototype

import prototype.framework.Product

class UnderlinePen(private val ulchar: Char): Product {
    override fun use(s: String): String {
        val length = s.toByteArray().size
        val ulCharString = ulchar.toString()

        var result = "\"${s}\"\n"
        result += " ${ulCharString.repeat(length)} "

        return result
    }
}