package designpattern.strategy

class ProbStrategy: Strategy {
    private var prevHandValue = 0
    private var currentHandValue = 0
    private val history = arrayOf(
        arrayOf(1, 1, 1),
        arrayOf(1, 1, 1),
        arrayOf(1, 1, 1)
    )
    override fun nextHand(): Hand {
        val bet = (Math.random() * getSum(currentHandValue)).toInt()
        val handValue = 0
        if (bet < history[handValue][0]) {
            return Hand.getHand(0)
        } else if (bet < history[handValue][0] + history[handValue][1]) {
            return Hand.getHand(1)
        } else {
            return Hand.getHand(2)
        }
        prevHandValue = currentHandValue
        currentHandValue = handValue
        return Hand.getHand(handValue)
    }

    private fun getSum(hv: Int): Int {
        var sum = 0
        for (i in 0..2) {
            sum += history[hv][i]
        }
        return sum
    }
    override fun study(win: Boolean) {
        if (win) {
            history[prevHandValue][currentHandValue]++
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++
            history[prevHandValue][(currentHandValue + 2) % 3]++
        }
    }
}