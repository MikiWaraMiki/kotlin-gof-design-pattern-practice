package singleton

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SingletonTest {

    @Test
    fun singleTonIsOtherInstance() {
        val aInstance = Singleton.singleton
        val anotherInstance = Singleton.singleton

        Assertions.assertEquals(aInstance.toString(), anotherInstance.toString())
    }
}