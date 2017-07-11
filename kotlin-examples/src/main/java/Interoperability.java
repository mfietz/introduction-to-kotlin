import java.util.ArrayList;
import java.util.List;

public class Interoperability {

    public static void main(String[] args) {
        Person p = new Person("Martin");
        Person p2 = new Person("Martin", 31);
    }

    public static List<String> mutableList() {
        return new ArrayList<String>();
    }

}
