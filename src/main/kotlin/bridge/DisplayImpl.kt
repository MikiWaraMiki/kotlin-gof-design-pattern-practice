package bridge

interface DisplayImpl {
    fun rawOpen(): String
    fun rawPrint(): String
    fun rawClose(): String
}