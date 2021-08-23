package strategy

class Hand(private val handValue: Int) {
    companion object {
        val HAND_VALUE_GUU = 0
        val HAND_VALUE_CHO = 1
        val HAND_VALUE_PAA = 2

        val hand = listOf<Hand>(
            Hand(HAND_VALUE_GUU),
            Hand(HAND_VALUE_CHO),
            Hand(HAND_VALUE_PAA)
        )

        private val name = listOf<String>(
            "グー",
            "チョキ",
            "パー"
        )

        fun getHand(handValue: Int): Hand {
            return hand[handValue]
        }
    }

    fun isStrongerThan(h: Hand): Boolean {
        return fight(h) == 1
    }

    fun isWeakerThan(h: Hand): Boolean {
        return fight(h) == -1
    }

    override fun toString(): String {
        return name[handValue]
    }

    private fun fight(h: Hand): Int {
        return if (this == h) {
            0
        } else if ((handValue + 1) % 3 == h.handValue) {
            1
        } else {
            -1
        }
    }
}