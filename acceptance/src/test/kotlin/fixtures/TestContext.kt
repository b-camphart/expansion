package fixtures

import MessagePresenter

class TestContext : MessagePresenter {

    private val messages = mutableListOf<String>()

    override fun presentMessage(message: String) {
        messages.add(message)
    }

    fun hasMessage(message: String): Boolean = messages.contains(message)

}