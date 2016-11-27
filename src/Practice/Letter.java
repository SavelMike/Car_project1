package Practice;

/**
 * Created by Михаил on 27.11.2016.
 */
public class Letter {

    private String sender;
    private String recipient;
    private String text;

    public Letter(String from, String to) {
        sender = from;
        recipient = to;
        text = "";
    }

    public void addLine(String line) {
        text += line;
        text += "\n";
    }

    public String getText() {
        return "Dear " + recipient + ":\n\n" + text + "\n" + text + "\n" + text + "\nSincerely,\n\n" + sender;
    }

    public void main() {
        System.out.println(getText());
    }
}
