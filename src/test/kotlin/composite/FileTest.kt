package composite

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class FileTest {
    @Test
    @DisplayName("prefixを指定した場合のprintListが正しいこと")
    fun testPrintListWhenPrefixIsNotEmpty() {
        val file = File("test.txt", 1000)

        val expected = "hoge/test.txt"

        val result = file.printList("hoge")

        Assertions.assertEquals(expected, result)
    }

    @Test
    @DisplayName("prefixが指定されていない場合のprintListが正しいこと")
    fun testPrintListWhenPrefixIsEmpty() {
        val file = File("test.txt", 1000)

        val expected = "/test.txt"

        val result = file.printList("")

        Assertions.assertEquals(expected, result)
    }
}