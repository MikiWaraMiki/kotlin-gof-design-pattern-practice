package prototype.framework

import org.junit.jupiter.api.*
import prototype.MessageBox
import prototype.UnderlinePen

class ManagerTest {
    val manager = Manager()

    @BeforeEach
    fun setup() {
        val upen = UnderlinePen('~')
        val mbox = MessageBox('*')
        val sbox = MessageBox('/')
        manager.register("strong message", upen)
        manager.register("warning box", mbox)
        manager.register("slash box", sbox)
    }

    @Test
    @DisplayName("strong messageの出力内容が正しいこと")
    fun testStrongBox() {
        val expected = """
            "Hello, World"
             ~~~~~~~~~~~~ 
        """.trimIndent()
        val aProduct = manager.create("strong message")
        val result = aProduct.use("Hello, World")

        Assertions.assertEquals(expected, result)
    }

    @Test
    @DisplayName("warning boxの出力内容が正しいこと")
    fun testWarningBox() {
        val expected = """
            ****************
            * Hello, World *
            ****************
        """.trimIndent()

        val aProduct = manager.create("warning box")
        val result = aProduct.use("Hello, World")

        Assertions.assertEquals(expected, result)
    }

    @Test
    @DisplayName("slash boxの出力内容が正しいこと")
    fun testSlackBox() {
        val expected = """
            ////////////////
            / Hello, World /
            ////////////////
        """.trimIndent()

        val aProduct = manager.create("slash box")
        val result = aProduct.use("Hello, World")

        Assertions.assertEquals(expected, result)
    }

    @Test
    @DisplayName("存在しないプロダクト名を指定した場合は例外が発生すること")
    fun testExceptionIllegalArgumentExceptionWhenProductNotFound() {
        val error = assertThrows<IllegalArgumentException> {
            manager.create("hogehoge")
        }

        Assertions.assertEquals("指定したインスタンスは存在しません", error.message)
    }
}