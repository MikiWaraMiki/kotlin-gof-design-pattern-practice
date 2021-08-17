package factory.idcard

import factory.framework.Factory
import factory.framework.Product

class IDCardFactory: Factory() {
    private val ownerList = mutableListOf<String>()

    override fun createProduct(aOwner: String): Product {
        return IDCard(aOwner)
    }

    override fun registerProduct(aProduct: Product) {
        val idCard = aProduct as IDCard
        ownerList.add(idCard.owner)
    }

    fun getOwners(): MutableList<String> {
        return ownerList
    }
}