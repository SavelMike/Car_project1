package Practice;

/**
 * Created by Михаил on 26.11.2016.
 */
public class Student {
    private String Name;
    private int TotalScore;
    private int numOfQuizzes;


    public Student(String nm) {
        Name = nm;
        TotalScore = 0;
        numOfQuizzes = 0;
    }

    public String getName() {
        return Name;
    }

    public void addQuiz(int score) {
        TotalScore += score;
        numOfQuizzes++;
    }

    public int getTotalScore() {
        return TotalScore;
    }

    public double getAverageScore() {
        return TotalScore / numOfQuizzes;
    }
}
