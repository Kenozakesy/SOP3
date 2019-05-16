package ControllerTest;

import Domain.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PersonTest {

    @Test
    public void constructorTest() {
        Person person = new Person("john", 25);
        assertEquals(person.getName(), "he");
    }
}
