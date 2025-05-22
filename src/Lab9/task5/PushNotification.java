package Lab9.task5;

public class PushNotification extends Notification{
    @Override
    protected String formatMessage(String message) {
        return "[Push] " + message;
    }
}
