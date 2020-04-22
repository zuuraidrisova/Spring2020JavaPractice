package Replit_Practices;
import java.util.Scanner;
public class QuizQuestion_Practice {
    public static void main(String []args){
        Scanner scan  = new Scanner(System.in);
        System.out.println("What is the farthest planet in the solar system?");
        System.out.println("a)venus");
        System.out.println("b)pluto");
        System.out.println("c)neptune");

        String answer = scan.next();
        if(answer.equals("a")){
            System.out.println("a is wrong");
        }else if(answer.equals("b")){
            System.out.println("b is correct");
        }else if(answer.equals("c")){
            System.out.println("c is wrong");
        }else{
            System.out.println("not valid answer");
        }

    }
}
