import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class CircleTest {

    private Student student;

    @Before
    public void setUp(){
        student = new Student("Fer");
    }

    @Test
    public void testGetName(){
        assertSame(student.getName(), "Fer");
    }

    @Test
    public void testAddGrade(){
        student.addGrade(100);
        assertTrue(student.getGrades().get(0) == 100);
    }

    @Test
    public void testGetGrades(){
        student.addGrade(90);
        assertFalse(student.getGrades().size() == 0);
        assertNotNull(student.getGrades().get(0));
    }

    @Test
    public void testGetAverage(){
        student.addGrade(100);
        student.addGrade(80);
        assertEquals(student.getGradeAverage(), 90.0);
    }

}
