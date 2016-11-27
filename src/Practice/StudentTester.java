package Practice;

/**
 * Created by Михаил on 26.11.2016.
 */
public class StudentTester {
    public static void main(String[] args) {
        Student Misha = new Student("Saveliev Misha");
        Misha.addGrade("A+");
        Misha.addGrade("B");
        Misha.addQuiz(6);
        Misha.addQuiz(8);
        System.out.println(Misha.getAverageScore());
        System.out.println(Misha.getName());
        System.out.println(Misha.getTotalScore());
        System.out.println(Misha.getGPA());
        System.out.println(Misha.getAverageScore());
    }
}
