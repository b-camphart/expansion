package fixtures

import MessagePresenter
import UnitPositionPresenter

class TestContext : MessagePresenter, UnitPositionPresenter {

    private val messages = mutableListOf<String>()

    override fun presentMessage(message: String) {
        messages.add(message)
    }

    fun hasMessage(message: String): Boolean = messages.contains(message)

    var theUnit: UnitFixture? = null

    override fun displayUnitAt(position: Pair<Double, Double>) {
        theUnit = UnitFixture(position)
    }

    var theMap: List<List<Unit>>? = null

    val List<List<Unit>>.center: Pair<Double, Double>
        get() = size.toDouble() / 2 to (firstOrNull()?.size?.toDouble()?.div(2) ?: 0.0)

}