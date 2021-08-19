package prototype.framework

interface Product: Cloneable {
    fun use(s: String): String
    fun createClone(): Product {
        try {
            return clone() as Product
        } catch (e: CloneNotSupportedException) {
            throw CloneNotSupportedException("複製に失敗しました")
        }
    }
}