package fixtures

import MessagePresenter
import MoveUnit
import UnitPositionPresenter

class TestContext : MessagePresenter, UnitPositionPresenter {

    private val messages = mutableListOf<String>()

    override fun tooFar() {
        messages.add("TOO FAR")
    }

    fun hasMessage(message: String): Boolean = messages.contains(message)

    var theUnit: UnitFixture? = null

    override fun displayUnitAt(position: Pair<Double, Double>) {
        theUnit = UnitFixture(position)
    }

    var theMap: List<List<Unit>>? = null

    val List<List<Unit>>.center: Pair<Double, Double>
        get() = size.toDouble() / 2 to (firstOrNull()?.size?.toDouble()?.div(2) ?: 0.0)

    val moveUnit = MoveUnit(this)

}