package sit333_task9;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TaskStatusCheckerTest {

    @Test
    public void testNotSubmittedStatus() {
        TaskStatusChecker checker = new TaskStatusChecker();

        String result = checker.checkTaskStatus(false, false, false);

        assertEquals("Not Submitted", result);
    }

    @Test
    public void testSubmittedStatus() {
        TaskStatusChecker checker = new TaskStatusChecker();

        String result = checker.checkTaskStatus(true, false, false);

        assertEquals("Submitted", result);
    }

    @Test
    public void testMarkedStatus() {
        TaskStatusChecker checker = new TaskStatusChecker();

        String result = checker.checkTaskStatus(true, true, false);

        assertEquals("Marked", result);
    }

    @Test
    public void testNeedsResubmissionStatus() {
        TaskStatusChecker checker = new TaskStatusChecker();

        String result = checker.checkTaskStatus(true, true, true);

        assertEquals("Needs Resubmission", result);
    }
}