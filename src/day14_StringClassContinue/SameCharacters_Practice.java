package day14_StringClassContinue;
import java.util.Scanner;
public class SameCharacters_Practice {
    public static void main(String []args){
        /*
        Ask user to enter a word.
         Print true if the first and last characters of the string are same characters,
          print false otherwise.
			Input:
				abba
			Output:
				true
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String word = scan.next();

        int length = word.length();

       if(word.charAt(0)==(word.charAt(length-1))){
           System.out.println("true");
       }else{
           System.out.println("false");
       }

    }
}
