import org.junit.Test
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat

class SimpleBiMapTest {

    @Test(expected = IllegalArgumentException::class)
    fun keyssAreUnique() {
        val bimap = SimpleBiMap<Int, String>()
        bimap.put(1, "String")
        bimap.put(1, "Another String")
    }

    @Test(expected = IllegalArgumentException::class)
    fun valuesAreUnique() {
        val bimap = SimpleBiMap<Int, String>()
        bimap.put(1, "String")
        bimap.put(2, "String")
    }

    @Test
    fun canBeInversed() {
        val bimap = SimpleBiMap<Int, String>()
        bimap.put(1, "String")
        assertThat(bimap.inverse(), equalTo(mapOf("String" to 1)))
    }
}