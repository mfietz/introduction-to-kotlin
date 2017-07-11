import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class InteroperabilityTest {

    @Test
    public void extensionFunction() {
        assertThat("should be true", ExtensionFunctionsKt.isPalindrom("otto"));
    }
}
