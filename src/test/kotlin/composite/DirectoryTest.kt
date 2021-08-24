package composite

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class DirectoryTest {
    @Test
    @DisplayName("子階層にファイルが存在する場合のPrintListの結果が正しいこと")
    fun testPrintListWhenExistChildFileEntry() {
        val directory = Directory("hoge")

        directory.addEntry(File("test1.txt", 1000))
        directory.addEntry(File("test2.txt", 1000))

        val expected = """
            fuga/hoge/test1.txt
            fuga/hoge/test2.txt
            
        """.trimIndent()

        Assertions.assertEquals(expected, directory.printList("fuga"))
    }

    @Test
    @DisplayName("子階層にディレクトリが存在する場合のPrintListの結果が正しいこと")
    fun testPrintListWhenExistChildDirectoryEntry() {
        val parentDirectory = Directory("parent")
        val childDirectory = Directory("child")

        parentDirectory.addEntry(File("parent_file.txt", 10))
        parentDirectory.addEntry(childDirectory)

        childDirectory.addEntry(File("child1.txt", 10))
        childDirectory.addEntry(File("child2.txt", 10))


        val expected = """
            /parent/parent_file.txt
            /parent/child/child1.txt
            /parent/child/child2.txt
          
        """.trimIndent()

        Assertions.assertEquals(expected, parentDirectory.printList(""))
    }
}