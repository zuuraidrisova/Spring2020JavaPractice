package day17_WhileLoops;
import java.util.Scanner;
public class WhileLoopPractice {
    public static void main(String[] args) {
        /*
        ask the user to enter yes or no
        if the user enters other than yes or no
        repeat the question
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter yes or no? ");
        String answer = scan.next();

        boolean valid = answer.equalsIgnoreCase("Yes")
                || answer.equalsIgnoreCase("No");

        while(!valid ){//while the input is not yes or no, repeats the question
            System.out.println("Please re-enter");
            answer = scan.next();
            if(answer.equalsIgnoreCase("Yes")
                    || answer.equalsIgnoreCase("No")){
                break;
            }
        }
        if(answer.equalsIgnoreCase("Yes")){
                System.out.println(answer+" entered");
            }
        if(answer.equalsIgnoreCase("No")){
                System.out.println(answer+" entered");
            }







    }
}
