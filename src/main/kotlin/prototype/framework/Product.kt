package prototype.framework

interface Product: Cloneable {
    fun use(s: String): String
    fun createClone(): Product
}