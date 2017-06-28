public class StringUtils {

    public static boolean isPalindrom(String s) {
        return s.length() > 0 && s.equals(new StringBuilder(s).reverse().toString());
    }

}
