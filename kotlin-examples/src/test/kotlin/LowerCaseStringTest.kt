import org.junit.Test
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat

class LowerCaseStringTest {

    @Test
    fun alwaysLowerCase() {
        assertThat(LowerCaseString("Kotlin").toString(), equalTo("kotlin"))
    }

    @Test
    fun lengthIsDelegated() {
        assertThat(LowerCaseString("kotlin").length, equalTo(6))
    }

}