package day14_StringClassContinue;
import java.util.Scanner;
public class FirstLetterMissing {
    /*
     Ask user to enter two words. Print first word without its first character then print the second word without its first character.
			Input:
				apple
				banana
			Output:
				ppleanana
     */
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word: ");
        String firstWord = scan.next();
        System.out.println("Enter second word: ");
        String secondWord = scan.next();

            firstWord = firstWord.substring(1);
            secondWord = secondWord.substring(1);
            //if we want to give the last index, it is length()-1,
        // because length is always one unit less than index


        String result = firstWord.concat(secondWord);
        System.out.println(result);


    }
}
