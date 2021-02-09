package Tests;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.launchcode.techjobs_oo.Job;

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
}
