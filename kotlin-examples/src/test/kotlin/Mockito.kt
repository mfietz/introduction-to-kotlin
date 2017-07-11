import com.nhaarman.mockito_kotlin.doReturn
import com.nhaarman.mockito_kotlin.mock
import org.junit.Test
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.CoreMatchers.equalTo

class Mockito {

    @Test
    fun `mockito can mock things`() {
        val mock = mock<MyClass> {
            on { text() } doReturn "mocked"
        }
        assertThat(mock.text(), equalTo("mocked"))
    }

    open class MyClass(val text: String) {
        open fun text() = text
    }
}