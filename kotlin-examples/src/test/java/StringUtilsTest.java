import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;


public class StringUtilsTest {

    @Test
    public void recongizesAPalindrom() {
        assertThat("should be recognized as a palindrom", StringUtils.isPalindrom("anna"));
    }

}