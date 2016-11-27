package Practice;

/**
 * Created by Михаил on 27.11.2016.
 */
public class LetterTest {
    public static void main(String[] args) {
        Letter l = new Letter("Misha", "Petya");
        l.addLine("Kak dela?");
        l.addLine("How are you?");
        l.addLine("Where are you?");
        l.main();
    }
}
