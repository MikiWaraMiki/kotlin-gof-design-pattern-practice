package bridge

class BridgeExecute {
    companion object {
        fun execute() {
            val d1 = Display(StringDisplayImpl("Hello, Japan"))
            val d2: Display = CountDisplay(StringDisplayImpl("Hello, World"))
            val d3 = CountDisplay(StringDisplayImpl("Hello, Universe"))

            println(d1.display())
            println(d2.display())
            println(d3.display())
            println(d3.multiDisplay(5))
        }
    }
}