package day14_StringClassContinue;
import java.util.Scanner;
public class StartEndWords_practice {
    public static void main(String[] args) {
        /*
        Write a program StartEndWords:
	    you have 2 words that must be 5 characters, and check if last letter of first word
	    and first letter of second work are same.
		if either one not 5 chars length:    print "need to be exactly 5 chars length"
		if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
		if they do not match:  print "Buzz - did not match"

		precondition: both words must have exactly 5 characters
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String first = scan.next();
        System.out.println("Enter second word: ");
        String second =scan.next();

        int length1 = first.length();
        int length2 = second.length();

        if(length1==5 && length1==5){
            if(first.charAt(length1-1) == second.charAt(0)){
                System.out.println("Fizz");
            }else{
                System.out.println("Buzz");
            }

        }else{
            System.out.println("Both needs to be exactly 5 characters length ");
        }


    }
}
