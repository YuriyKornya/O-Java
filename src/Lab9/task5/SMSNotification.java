package Lab9.task5;

public class SMSNotification extends Notification{
    @Override
    protected String formatMessage(String message) {
        return "[SMS] " + message;
    }
}
