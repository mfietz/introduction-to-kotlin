import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import java.io.IOException

class OtherDifferences {

    @Test
    fun thereAreNoCheckedExceptions() {
        throwException()
    }

    @Test
    fun structuralAndReferentialEquality() {
        val person = Person("Name")
        val samePerson = Person("Name")
        assertTrue(person == samePerson)
        assertFalse(person === samePerson)
    }

    @Test
    fun equalsIsNullSafe() {
        assertFalse(null == "String")
        assertFalse("String" == null)
    }

    @Test
    fun ifElseIsAnExpression() {
        val trueCondition = if (42 > 17) true else false
        assertTrue(trueCondition)
    }

    @Test
    fun tryCatchIsAnExpression() {
        val exceptionWasCaught = try {
            throwException()
            false
        } catch (e: IOException) {
            true
        }
        assertTrue(exceptionWasCaught)
    }

    @Test
    fun classesAreFinalByDefault() {
        // compilation error:
        // val student = object : Person("") {}
    }

    private fun throwException() {
        throw IOException("This is a checked exception in Java")
    }

    private data class Person(val name: String)

}