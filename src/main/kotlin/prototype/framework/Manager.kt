package prototype.framework

class Manager {
    private val showcase = mutableMapOf<String, Product>()

    fun register(name: String, proto: Product) {
        showcase[name] = proto
    }

    fun create(protoname: String): Product {
        val aProduct = showcase.getOrElse(protoname) {
            throw IllegalArgumentException("指定したインスタンスは存在しません")
        }

        return aProduct.createClone()
    }
}