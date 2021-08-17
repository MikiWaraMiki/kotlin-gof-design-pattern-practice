package factory.idcard

import factory.framework.Product

/**
 * IDCardクラス
 */
class IDCard(aOwner: String, aNumber: Int): Product() {
    var owner = aOwner
        private set
    var number = aNumber
        private set

    override fun use() : String {
        return "${number.toString()}:${owner}のカードを使います"
    }
}