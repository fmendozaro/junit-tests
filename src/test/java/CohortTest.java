import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CohortTest {

    @Test
    public void testGetStudentsList(){
        Cohort ceres = new Cohort();
        assertNotNull(ceres.getStudents());
        assertEquals(0, ceres.getStudents().size());
    }

    @Test
    public void testAddStudentToCohort(){
        Cohort ceres = new Cohort();
        assertEquals(0, ceres.getStudents().size());
        ceres.addStudent(new Student(1L,"fer"));
        assertEquals(1, ceres.getStudents().size());
    }

    @Test
    public void testCohortAverage(){
        Cohort ceres = new Cohort();
        ceres.addStudent(new Student(1L,"fer"));
        ceres.addStudent(new Student(2L,"stacy"));
        ceres.getStudents().get(0).addGrade(100);
        ceres.getStudents().get(0).addGrade(80);

        ceres.getStudents().get(1).addGrade(50);
        ceres.getStudents().get(1).addGrade(50);

        assertEquals(70, ceres.getCohortAverage(), 0);
    }
}
