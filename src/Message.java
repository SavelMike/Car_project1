import java.util.ArrayList;

/**
 * Created by Михаил on 06.12.2016.
 */
public class Message {

    private String sender;
    private String recipient;
    private ArrayList<String> body = new ArrayList<String>();

    public Message(String sen, String rec) {
        sender = sen;
        recipient = rec;
    }

    public void append(String text) {
        body.add(text);
    }

    public String toString() {

    }
}
