package factory.idcard

import factory.framework.Product

/**
 * IDCardクラス
 */
class IDCard(aOwner: String): Product() {
    var owner = aOwner
        private set

    override fun use() : String {
        return "${owner}のカードを使います"
    }
}