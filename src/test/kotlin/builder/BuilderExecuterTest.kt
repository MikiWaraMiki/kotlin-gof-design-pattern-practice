package builder

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths

class BuilderExecuterTest {

    @Test
    @DisplayName("text形式の文面が正しく取得できること")
    fun testTextBuilderCommand() {
        val expected = """
            ==============================
            「Greeting」
            
            ■朝から昼にかけて
            
            　・おはようございます。
            　・こんにちは。
            
            ■夜に
            
            　・こんばんは。
            　・おやすみなさい。
            　・さようなら。
            
            ==============================
            
        """.trimIndent()

        val result = BuilderExecuter.execute("text")

        Assertions.assertEquals(expected, result)
    }

    @Test
    @DisplayName("html形式の場合ファイルが生成されること")
    fun textHtmlBuilderCommand() {
        val result = BuilderExecuter.execute("html")

        Assertions.assertEquals(
            Files.exists(Paths.get(result)),
            true
        )
    }
}