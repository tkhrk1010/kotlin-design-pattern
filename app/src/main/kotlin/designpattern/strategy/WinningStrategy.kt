package designpattern.strategy

class WinningStrategy : Strategy {
    private var won: Boolean = false
    private lateinit var prevHand: Hand

    override fun nextHand(): Hand {
        if (!won) {
            prevHand = Hand.getHand((Math.random() * 3).toInt())
        }
        return prevHand
    }

    override fun study(win: Boolean) {
        won = win
    }
}