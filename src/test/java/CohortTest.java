import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CohortTest {

    private Cohort ceres;
    private Student fer;
    private Student stacy;

    @Before
    public void setup(){
        ceres = new Cohort();
        fer = new Student(1L,"fer");
        stacy = new Student(2L,"stacy");
    }

    @Test
    public void testGetStudentsList(){
        assertNotNull(ceres.getStudents());
        assertEquals(0, ceres.getStudents().size());
    }

    @Test
    public void testAddStudentToCohort(){
        assertEquals(0, ceres.getStudents().size());
        ceres.addStudent(fer);
        assertEquals(1, ceres.getStudents().size());
    }

    @Test
    public void testCohortAverage(){
        ceres.addStudent(fer);
        ceres.addStudent(stacy);
        fer.addGrade(100);
        fer.addGrade(80);

        stacy.addGrade(50);
        stacy.addGrade(50);

        assertEquals(70, ceres.getCohortAverage(), 0);
    }
}
