package steps

import io.cucumber.java.After
import io.cucumber.java.Before

val context: ThreadLocal<Int> = ThreadLocal.withInitial { 0 }

class SetupSteps {

    @Before
    fun createThreadLocalContext() {
        context.get()
    }

    @After
    fun destroyThreadLocalContext() {
        context.remove()
    }

}