package designpattern.strategy

class Hand(private val handvalue: Int) {
    companion object {
        private const val HANDVALUE_GUU = 0
        private const val HANDVALUE_CHO = 1
        private const val HANDVALUE_PAA = 2
        private val hand = arrayOf(
            Hand(HANDVALUE_GUU),
            Hand(HANDVALUE_CHO),
            Hand(HANDVALUE_PAA)
        )
        val name = arrayOf(
            "グー", "チョキ", "パー"
        )

        fun getHand(handvalue: Int): Hand {
            return hand[handvalue]
        }
    }

    fun isStrongerThan(h: Hand): Boolean {
        return fight(h) == 1
    }

    fun isWeakerThan(h: Hand): Boolean {
        return fight(h) == -1
    }

    private fun fight(h: Hand): Int {
        return if (this == h) {
            0
        } else if ((this.handvalue + 1) % 3 == h.handvalue) {
            1
        } else {
            -1
        }
    }

    override fun toString(): String {
        return name[handvalue]
    }
}