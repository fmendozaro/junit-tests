import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class CircleTest {

    private Student studentWithoutGrades;
    private Student studentWithGrades;

    @Before
    public void setUp(){
        studentWithoutGrades = new Student("Fer");
        studentWithGrades = new Student("Jane");
        studentWithGrades.addGrade(100);
        studentWithGrades.addGrade(80);
    }

    @Test
    public void testGetName(){
        assertSame(studentWithoutGrades.getName(), "Fer");
    }

    @Test
    public void testAddGrade(){
        assertTrue(studentWithGrades.getGrades().get(0) == 100);
    }

    @Test
    public void testGetGrades(){
        assertFalse(studentWithGrades.getGrades().size() == 0);
        assertNotNull(studentWithGrades.getGrades().get(0));
    }

    @Test
    public void testGetAverage(){
        assertEquals(studentWithGrades.getGradeAverage(), 90.0);
    }

}
