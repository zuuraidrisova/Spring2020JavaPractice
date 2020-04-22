package Replit_Practices;
import java.util.Scanner;
public class SplitSentenceReplit {
    public static void main(String[] args) {
/*
Given a String variable sentence, write code to type each word in separate lines.

Example:
sentence -> "Java is fun"
Print
Java
is
fun
 */
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below

        String str [] = sentence.split(" ");

        for( String each : str){
            System.out.println(each);
        }




    }
}
