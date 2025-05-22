package Lab9.task5;

public class EmailNotification extends Notification{
    @Override
    protected String formatMessage(String message) {
        return "[Email] " + message;
    }
}
