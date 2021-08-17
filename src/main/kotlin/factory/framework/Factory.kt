package factory.framework

/**
 * Factory抽象クラス
 */
abstract class Factory {
    fun create(aOwner: String): Product {
        val aProduct = createProduct(aOwner)
        registerProduct(aProduct)

        return aProduct
    }

    protected abstract fun createProduct(aOwner: String): Product
    protected abstract fun registerProduct(aProduct: Product)
}