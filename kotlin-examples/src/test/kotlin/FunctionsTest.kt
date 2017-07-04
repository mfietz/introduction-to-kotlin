import org.junit.Assert.*
import org.junit.Test
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat

class FunctionsTest {

    @Test
    fun helloName() {
        assertThat(hallo("Kotlin"), equalTo("Hallo Kotlin"))
    }

    @Test
    fun halloWorld() {
       assertThat(hallo(), equals("Hallo World"))
    }
}