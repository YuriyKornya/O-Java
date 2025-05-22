package Lab9.task5;
import java.util.List;

public class NotificationReader extends Consumer {
    private int lastReadIndex = 0;

    @Override
    public void read() {
        List<String> allMessages = Notification.getMessages();
        while (lastReadIndex < allMessages.size()) {
            System.out.println("Reading: " + allMessages.get(lastReadIndex));
            lastReadIndex++;
        }

    }
}
