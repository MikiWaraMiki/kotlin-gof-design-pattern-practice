package singleton

object TicketMaker {
    private var ticket = 100

    fun getNextNumber(): Int {
        return ticket++
    }
}