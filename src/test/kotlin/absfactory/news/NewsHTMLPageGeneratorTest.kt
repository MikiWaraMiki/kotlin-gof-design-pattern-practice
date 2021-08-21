package absfactory.news

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.nio.file.Files
import java.nio.file.Paths

class NewsHTMLPageGeneratorTest {
    @Test
    @DisplayName("List形式のHTMLが生成できること")
    fun testListCommandExecutionSuccess() {
        val command = GeneratorCommandEnum.LIST_LINK

        NewsHTMLPageGenerator.execute(command)

        Assertions.assertEquals(
            Files.exists(Paths.get("Example Page.html")),
            true
        )
    }

    @Test
    @DisplayName("Table形式のHTMLが生成できること")
    fun testTableCommandExecutionSuccess() {
        val command = GeneratorCommandEnum.TABLE

        NewsHTMLPageGenerator.execute(command)

        Assertions.assertEquals(
            Files.exists(Paths.get("Example Page.html")),
            true
        )
    }
}