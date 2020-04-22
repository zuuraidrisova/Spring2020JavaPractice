package Replit_Practices;
import java.util.Arrays;
import java.util.Scanner;

public class FindingMaxLengthStringArray {
    public static void main(String[] args) {
        /*
        Given the array words, it will print the word with the largest length.
         Assume that there are no 2 words with longest length
Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
         */

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];

        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        int maxLengthString = words[0].length();

        String longestWord = "";

        for(int i = 0; i < words.length; i++ ){

            if(maxLengthString <  words[i].length()){
                maxLengthString = words[i].length();

                longestWord = words[i];
            }

        }

        System.out.println(longestWord);


    }
}
