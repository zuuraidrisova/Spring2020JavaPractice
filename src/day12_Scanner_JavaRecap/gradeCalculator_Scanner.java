package day12_Scanner_JavaRecap;
import java.util.Scanner;
public class gradeCalculator_Scanner {

    public static void main(String[] args) {
        /*
        Write a Java Program that can calculate the grade of a student based on the score,
        implement the following logic:
                If marks < 60, then print "Fail"
                If marks >= 60, but less than 90, then print "Pass"
                If marks >= 90, then print "Passed with Distinction"
                MUST use scanner
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your score: ");

        int score = scan.nextInt();

        if(score<60){
            System.out.println("Fail");

        }else if(score>=60 && score <90){
            System.out.println("Pass");

        }else{
            System.out.println("Passed with Distinction");

        }



    }
}
