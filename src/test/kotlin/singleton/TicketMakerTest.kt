package singleton

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TicketMakerTest {

    @Test
    fun getNextNumberTest() {
        Assertions.assertEquals(100, TicketMaker.getNextNumber())
        Assertions.assertEquals(101, TicketMaker.getNextNumber())
        Assertions.assertEquals(102, TicketMaker.getNextNumber())
    }
}