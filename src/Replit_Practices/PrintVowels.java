package Replit_Practices;
import java.util.Scanner;
public class PrintVowels {

    /*
    Inputs:
String word;

Write a for loop that will loop through every letter of the input and print
 out just the vowels. Sample input/outputs
HINT:  vowel is a letter representing a vowel sound, such as a, e, i, o, u.

In: howdyho
oo

In: huehuehuehue
ueueueue


In: poopoo what idk what im doing
ooooaiaioi
     */

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        String noVowel = "";

        for(int i = 0;  i < word.length(); i++){

          char letters = word.charAt(i);

          if(letters == 'a' || letters == 'e' || letters == 'i' || letters == 'o'

          || letters == 'u' ){

              noVowel += word.charAt(i);
          }
        }

        System.out.println(noVowel);


    }
}
