package prototype

import prototype.framework.Product

class MessageBox(private val decorator: Char): Product {

    override fun use(s: String): String {
        val length = s.toByteArray().size
        val decoratorString = decorator.toString()

        var result = "${decoratorString.repeat(length + 4)}\n"
        result += "$decoratorString $s $decoratorString\n"
        result += decoratorString.repeat(length + 4)

        return result
    }

    override fun createClone(): Product {
        try {
            return clone() as Product
        } catch(e: CloneNotSupportedException) {
            throw CloneNotSupportedException("複製に失敗しました")
        }
    }
}