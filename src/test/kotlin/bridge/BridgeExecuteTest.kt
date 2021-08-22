package bridge

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class BridgeExecuteTest {

    @Test
    @DisplayName("Executeが実行される")
    fun testExecute() {
        BridgeExecute.execute()
    }
}