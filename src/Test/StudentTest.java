package Test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.Student;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StudentTest {

    Student nickI;

    @Before
    public void createStudentObject() {
        nickI = new Student("Nick", "Impoco", "Steve");
    }

    @Test
    public void emptyTest() {
        assertEquals(10,10);
    }

    // Let's test the Student constructor, and make sure that it
    // behaves how we expect it to behave
    // i.e. new Student("Nick", "Impoco", "Steve")
    // firstName would be Nick, lastName would be Impoco etc..
    @Test
    public void testStudentConstructorAndGetters() {
        // To test the constructor, we need to use the constructor
        // We need to create a new Student object
        // Because we have the @Before annotation now that creates
        // a Student object before we run any tests, we are now just
        // utilizing that object and no longer to create a student object
        // within each class
        assertEquals("Nick", nickI.getFirstName());
        assertEquals("Impoco", nickI.getLastName());
        assertEquals("Steve", nickI.getTA());
    }

    // We want the toString of the Student class to return a nicely formatted
    // string that gives us some information about a given student object
    // i.e. given nickI.toString(), we would want that to return:
    // "Student Nick Impoco is in Steve's TA group."
    @Test
    public void testStudentToStringMethod() {
        // We expect studentObject.toString() to give us specific formatted string
        // Let's create an expected variable and an actual result variable and
        // compare the two variables using assertEquals
        String expectedOutput = "Student Nick Impoco is in Steve's TA group.";
        String actualOutput = nickI.toString();
//        assertEquals(expectedOutput, actualOutput);
        // Let's refactor this assertEquals statement to use assertTrue instead
        assertTrue(expectedOutput.equals(actualOutput));
    }
}
