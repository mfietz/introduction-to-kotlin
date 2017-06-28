import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.CoreMatchers.not
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

private data class Person(
        val name: String,
        var age: Int? = null
)

class DataClassesTest {

    private val me = Person("Martin", 31)
    private val alsoMe = Person("Martin", 31)

    @Test
    fun toStringIsGenerated() {
        assertThat(me.toString(), equalTo("Person(name=Martin, age=31)"))
    }

    @Test
    fun equalToIsGenerated() {
        assertThat(me, equalTo(alsoMe))
    }

    @Test
    fun hashCodeIsGenerated() {
        assertThat(me.hashCode(), equalTo(alsoMe.hashCode()))
    }

    @Test
    fun copyIsGenerated() {
        assertThat(me, equalTo(me.copy()))
        assertThat(me.copy(name = "Horst"), not(equalTo(me)))  // copy with altered properties
    }

    @Test
    fun componentFunctionsAreGenerated() {
        assertThat(me.component1(), equalTo("Martin"))
        assertThat(me.component2(), equalTo(31))

        val (name, alter) = me // destructuring declaration
        assertThat(name, equalTo("Martin"))
        assertThat(alter, equalTo(31))
    }

}
