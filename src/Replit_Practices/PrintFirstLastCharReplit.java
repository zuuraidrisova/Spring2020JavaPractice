package Replit_Practices;
import java.util.Scanner;
public class PrintFirstLastCharReplit {
    public static void main(String[] args) {
        /*
        Given a String array words, iterate through each word and print first
         and last letter of each element in separate lines.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print:
       ho
       wy
       by
       ae
       ne
         */
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),
                input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below

        for(int i = 0; i <= words.length-1; i++){
            System.out.println(words[i].charAt(0)+""+words[i].charAt(words[i].length()-1));
        }

    }
}
