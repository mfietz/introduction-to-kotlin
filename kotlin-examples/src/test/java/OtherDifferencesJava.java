import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OtherDifferencesJava {

    @Test
    public void thereAreCheckedExceptions() {
        try {
            throwException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void structuralAndReferentialEquality() {
        Person person = new Person("Name");
        Person samePerson = new Person("Name");
        assertFalse(person == samePerson);
        assertTrue(person.equals(samePerson));
    }

    private void throwException() throws IOException {
        throw new IOException("This is a checked exception");
    }

    private class Person {
        final String name;

        Person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Person person = (Person) o;

            return name != null ? name.equals(person.name) : person.name == null;
        }

        @Override
        public int hashCode() {
            return name != null ? name.hashCode() : 0;
        }
    }
}
