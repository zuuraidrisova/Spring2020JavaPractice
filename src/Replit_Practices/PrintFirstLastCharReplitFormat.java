package Replit_Practices;

import java.util.Arrays;
import java.util.Scanner;

public class PrintFirstLastCharReplitFormat {
    public static void main(String[] args) {
        /*
        Given a String array words, iterate through each word and print
        first and last letter of each element in the format below.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne]
         */
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),
                input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below

        String [] result = new String [5];

        for(int i = 0; i <= words.length-1; i++){
            result [i] = ""+words[i].charAt(0)+words[i].charAt(words[i].length()-1);
        }
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(result));


    }
}
