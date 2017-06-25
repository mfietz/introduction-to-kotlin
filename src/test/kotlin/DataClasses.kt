import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class DataClassesTest {

    private val person = Person("Martin", 31)
    private val samePerson = Person("Martin", 31)

    @Test
    fun toStringIsGenerated() {
        assertThat(person.toString(), equalTo("Person(name=Martin, age=31)"))
    }

    @Test
    fun equalToIsGenerated() {
        assertThat(person, equalTo(samePerson))
    }

    @Test
    fun hashCodeIsGenerated() {
        assertThat(person.hashCode(), equalTo(samePerson.hashCode()))
    }

    @Test
    fun copyIsGenerated() {
        assertThat(person, equalTo(person.copy()))
    }

    @Test
    fun componentFunctionsAreGenerated() {
        assertThat(person.component1(), equalTo("Martin"))
        assertThat(person.component2(), equalTo(31))

        val (name, alter) = person // destructuring declaration
        assertThat(name, equalTo("Martin"))
        assertThat(alter, equalTo(31))
    }

}

private data class Person(
        val name: String,
        var age: Int? = null
)
