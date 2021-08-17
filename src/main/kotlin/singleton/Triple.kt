package singleton

object Triple {
    private val instanceMap = mapOf(1 to "one", 2 to "two", 3 to "three")

    fun getInstance(id: Int): String {
        return instanceMap.getOrElse(id) {
            throw IllegalArgumentException("指定したIDのインスタンスは存在しません")
        }
    }
}