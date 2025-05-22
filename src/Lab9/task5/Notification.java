package Lab9.task5;
import java.util.ArrayList;
import java.util.List;

public abstract class Notification implements Producer {
    protected static final List<String> messages = new ArrayList<>();

    @Override
    public void send(String message) {
        messages.add(formatMessage(message));
    }

    protected abstract String formatMessage(String message);

    public static List<String> getMessages() {
        return messages;
    }
}
