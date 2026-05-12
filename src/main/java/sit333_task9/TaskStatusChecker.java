package sit333_task9;

public class TaskStatusChecker {

    public String checkTaskStatus(boolean submitted, boolean marked, boolean needsResubmission) {

        if (!submitted) {
            return "Not Submitted";
        }

        if (needsResubmission) {
            return "Needs Resubmission";
        }

        if (marked) {
            return "Marked";
        }

        return "Submitted";
    }
}