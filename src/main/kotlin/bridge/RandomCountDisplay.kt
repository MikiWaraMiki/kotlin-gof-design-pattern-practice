package bridge

import kotlin.random.Random

class RandomCountDisplay(impl: DisplayImpl): CountDisplay(impl) {

    fun randomDisplay(max: Int) : String {
        val time = Random.nextInt(max)
        return multiDisplay(time)
    }
}