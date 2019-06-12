import org.junit.Test;

import static org.junit.Assert.*;


public class StudentTest {

    @Test
    public void testStudentClass(){
        Student student = new Student(1, "Fer");
        assertNotNull(student);
    }

}
