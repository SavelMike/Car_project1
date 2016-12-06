import java.util.ArrayList;

/**
 * Created by Михаил on 06.12.2016.
 */
public class Message {

    private String sender;
    private String recipient;
    private ArrayList<String> body;

    public Message(String sen, String rec) {
        sender = sen;
        recipient = rec;
        body = new ArrayList<String>();
    }

    public void append(String text) {
        body.add(text);
    }

    public String toString() {
        String rc;
        rc = "From: " + sender + "\nTo: " + recipient + "\n ";
        for (int i = 0; i < body.size(); i++) {
            rc += body.get(i) + "\n";
        }
        return rc;
    }
}
