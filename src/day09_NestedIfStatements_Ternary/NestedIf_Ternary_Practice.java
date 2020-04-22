package day09_NestedIfStatements_Ternary;


public class NestedIf_Ternary_Practice {
    public static void main(String[] args) {
        int score = 87;
        String grade = " ";
        if (score >= 0 && score <= 100) {//if condition can be evaluated to multiple scenarios
            //inner if statements==nested if
            if (score >= 90) {//false, so it is not gonna run
                grade = "A";
            } else if (score >= 80) {//it is true , this will get executed
                grade = "B";
            } else if (score >= 70) {//compiler does not check it because conditions are met
                grade = "C";
            } else if (score >= 60) {//compiler skips it becase compiler already found its answer
                grade = "D";
            } else {//compiler does not read it
                grade = "F";
            }

        } else {
            grade = "Invalid score";
        }

        System.out.println(grade);

        int score2 = 75;
        String grade2 = " ";
        if (score2 >= 0 && score2 <= 100) {
            grade2 = (score2 >= 90) ? "A" : (score2 >= 80) ? "B"
                    : (score2 >= 70) ? "C" : (score2 >= 60) ? "D" : "F";
        } else {
            grade2 = "Invalid";
        }

        System.out.println(grade2);


    }
}