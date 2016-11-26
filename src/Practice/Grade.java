package Practice;

/**
 * Created by Михаил on 26.11.2016.
 */
public class Grade {

    private String strGrade;


    public Grade(String gr) {
        strGrade = gr;
    }

    public double gradeToPoints() {
        if (strGrade.equals("A+")) {
            return 4.0;
        }
        if (strGrade.equals("A")) {
            return 4.0;
        }
        if (strGrade.equals("A-")) {
            return 3.7;
        }
        if (strGrade.equals("B+")) {
            return 3.3;
        }
        if (strGrade.equals("B")) {
            return 3.0;
        }
        if (strGrade.equals("B-")) {
            return 2.7;
        }
        if (strGrade.equals("C+")) {
            return 2.3;
        }
        if (strGrade.equals("C")) {
            return 2.0;
        }
        if (strGrade.equals("C-")) {
            return 1.7;
        }
        if (strGrade.equals("D+")) {
            return 1.3;
        }
        if (strGrade.equals("D")) {
            return 1.0;
        }
        if (strGrade.equals("D-")) {
            return 0.7;
        }
        if (strGrade.equals("F")) {
            return 0.0;
        }else {
            System.out.println("Wrong grade");
            System.exit(1);
            return 0;
        }
    }
}
