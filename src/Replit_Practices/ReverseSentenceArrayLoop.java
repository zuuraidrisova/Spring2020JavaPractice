package Replit_Practices;
import java.util.Scanner;
public class ReverseSentenceArrayLoop {
    public static void main(String[] args) {
        /*
        Given a String variable sentence, write code to type
         each word in separate lines in a reverse order.
Example:
sentence -> "Java is fun"
Print
fun
is
Java
         */

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();


        String [] arr = sentence.split(" ");

        String reverse = "";

        for(int i = arr.length-1; i >= 0 ; i--){

            reverse += arr[i]+"\n";

        }

        System.out.println(reverse);





    }
}
