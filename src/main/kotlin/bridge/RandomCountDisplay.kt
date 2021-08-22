package bridge

import kotlin.random.Random

class RandomCountDisplay(impl: DisplayImpl): Display(impl) {

    fun multiDisplay(max: Int): String {
        val time = Random.nextInt(max)
        var result = ""
        result += "${open()}\n"
        for (i in 1..time) {
            result += "${print()}\n"
        }
        result += "${close()}\n"

        return result
    }
}