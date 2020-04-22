package day23_CustomMethods;

public class GradeMethod {
    public static void main(String[] args) {
        /*
        write a method called Grade, that can print out the grade based on
        the score of the student
			if score is 100 ~ 90 ==> A
			if score is 89 ~ 80 ==> B
			if score is 79 ~ 70 ==> C
			if score is 69 ~ 60 ==> D
			if score is 0 ~ 59 ==> F
			otherwise ==> Invalid Score
		Ex:
			Grade(100); ==> A
			Grade(120); ==> Invalid
         */

        grade(89);
    }
    public static void grade(int score){

        String grade = "";

        if(score >= 90 && score <=100){

            grade = "A";

        }else if(score >= 80 && score <= 89){

            grade = "B";

        }else if(score >= 70 && score <=79){

            grade = "C";

        }else if(score >= 60 && score <= 69){

            grade = "D";

        }else if(score >= 0 && score <= 59){

            grade ="F";

        }else{

            grade = "Invalid Score";
        }

        System.out.println(grade);
    }
}
