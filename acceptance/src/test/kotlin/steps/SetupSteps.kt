package steps

import fixtures.TestContext
import io.cucumber.java.After
import io.cucumber.java.Before

val context: ThreadLocal<TestContext> = ThreadLocal.withInitial { TestContext() }

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