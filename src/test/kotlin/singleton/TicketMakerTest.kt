package singleton

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TicketMakerTest {

    @Test
    fun getNextNumberTest() {
        Assertions.assertEquals(TicketMaker.getNextNumber(), 100)
        Assertions.assertEquals(TicketMaker.getNextNumber(), 101)
        Assertions.assertEquals(TicketMaker.getNextNumber(), 102)
    }
}