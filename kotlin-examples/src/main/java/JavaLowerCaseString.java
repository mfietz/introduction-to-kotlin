import java.util.stream.IntStream;

public class JavaLowerCaseString implements CharSequence {

    private final String str;

    public JavaLowerCaseString(String str) { this.str = str; }

    public String toString() { return str.toLowerCase(); }

    public int length() { return str.length(); }

    @Override
    public char charAt(int index) {
        return str.charAt(index);
    }

            public CharSequence subSequence(int startIndex, int endIndex) {
    return str.subSequence(startIndex, endIndex);
   }
}