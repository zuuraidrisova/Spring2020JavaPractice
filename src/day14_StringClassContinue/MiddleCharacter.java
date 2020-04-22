package day14_StringClassContinue;
import java.util.Scanner;
public class MiddleCharacter {
    /*
     Write a Java method to display the middle character of a string
		a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character.
				Input :
					elephant
				Output:
					The middle character in the string: ph
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your word: ");
        String word = scan.next();

        String middleCharacter = " ";//to store middle characters
        int totalChars = word.length();
        int middleChar = totalChars/2;

        if (totalChars % 2 != 0) {//condition for odd numbers
            middleCharacter = middleCharacter+word.charAt(middleChar);
        }else {//even number
            middleCharacter +=  word.charAt(middleChar - 1)+"" + word.charAt(middleChar);
            /// any thing we add to a string will return it as string

        }

        System.out.println("Middle character: "+ middleCharacter);

    }
}
