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

    override fun createClone(): Product {
        try {
            return clone() as Product
        } catch (e: CloneNotSupportedException) {
            throw CloneNotSupportedException("複製に失敗しました")
        }
    }
}