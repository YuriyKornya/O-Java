package Lab11.task3;

public class HighPriorityTask extends Task {
    private int priorityLevel;

    public HighPriorityTask(int id, String title, int priorityLevel) {
        super(id, title);
        this.priorityLevel = priorityLevel;
    }

    @Override
    public void markAsDone() {
        super.markAsDone();
        System.out.println("\uD83D\uDE80 High-Priority Task Completed! Notification Sent.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Priority Level: " + priorityLevel;
    }
}
