package singleton

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class TripleTest {

    @Test
    @DisplayName("idで指定した要素を取得できること")
    fun canGetValueIfExist() {
        Assertions.assertEquals("one", Triple.getInstance(1))
        Assertions.assertEquals("two", Triple.getInstance(2))
        Assertions.assertEquals("three", Triple.getInstance(3))
    }

    @Test
    @DisplayName("idで指定した要素が存在しない場合はエラーが発生する")
    fun throwErrorIfNotFound() {
        val err = assertThrows<IllegalArgumentException> {
            Triple.getInstance(5)
        }

        Assertions.assertEquals(
            "指定したIDのインスタンスは存在しません",
            err.message
        )
    }
}