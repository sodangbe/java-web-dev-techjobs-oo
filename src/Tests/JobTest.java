package Tests;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.launchcode.techjobs_oo.*;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

public class JobTest {
    Job test_job1;
    Job test_job2;
    @Before
    public void createJobObject(){
        test_job1 = new Job();
        test_job2 = new Job();
    }

    @Test
    public void testSettingJobId (){
        createJobObject();
        Integer results = (test_job2.getId() - test_job1.getId());
        assertEquals(1, results);
        assertFalse(test_job2.getId() == test_job1.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields(){
      Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
      assertTrue(test_job instanceof Job);
    }

    @Test
    public void testJobsForEquality(){
        Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(test_job3.equals(test_job4));
    }
}
