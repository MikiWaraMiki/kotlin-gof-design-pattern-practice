package composite

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class EntryTest {
    @Test
    @DisplayName("printListの表示結果が正しいこと")
    fun testPrintList() {
        val rootDir = Directory("root")
        val binDir = Directory("bin")
        val tmpDir = Directory("tmp")
        val usrDir = Directory("usr")

        rootDir.addEntry(binDir)
        rootDir.addEntry(tmpDir)
        rootDir.addEntry(usrDir)

        binDir.addEntry(File("vi", 1000))
        binDir.addEntry(File("latex", 100000))

        val expected = """
            /root
            /root/bin
            /root/bin/vi
            /root/bin/latex
            /root/tmp
            /root/usr
            
        """.trimIndent()

        Assertions.assertEquals(expected, rootDir.printList(""))
    }
}