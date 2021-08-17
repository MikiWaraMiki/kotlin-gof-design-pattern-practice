package factory.idcard

import factory.framework.Factory
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class IDCardFactoryTest {
    private val factory: Factory = IDCardFactory()

    @Test
    fun createTest() {
        val card1 = factory.create("user1")
        val card2 = factory.create("user2")
        val card3 = factory.create("user3")

        Assertions.assertEquals("user1のカードを使います", card1.use())
        Assertions.assertEquals("user2のカードを使います", card2.use())
        Assertions.assertEquals("user3のカードを使います", card3.use())
    }
}