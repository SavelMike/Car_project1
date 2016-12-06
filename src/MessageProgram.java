import java.util.Scanner;

/**
 * Created by Михаил on 06.12.2016.
 */
public class MessageProgram {
    public static void main(String[] args) {
        Message newMessage = new Message("Vasya", "Petya");
        while(true) {
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            if (input.equals("end.")) {
                System.out.println(newMessage.toString());
                break;
            }
            newMessage.append(input);
        }
    }
}
