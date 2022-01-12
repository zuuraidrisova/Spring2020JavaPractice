package reviewPracticing;

import java.util.Scanner;

public class String_Tasks {

    public static void main(String[] args) {

         /*
     Ask user to enter two words. Print first word without its first
      character then print the second word without its first character.
			Input:
				apple
				banana
			Output:
				ppleanana
     */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two words: ");

        String first = scan.next();
        String second = scan.next();

            first = first.substring(1);
            second = second.substring(1);

        String output = first.concat(second);

        System.out.println("output = " + output);

         /*
        Ask user to enter a word. Print "really?"
        if the word ends with ly, print "never mind" otherwise.
			Input:
				Seriously
			Output:
				really?
         */

         scan = new Scanner(System.in);

        System.out.println("Enter a word: ");

         String word = scan.next();

         if(word.endsWith("ly")){

             System.out.println("really?");

         }else{

             System.out.println("Never mind");
         }

         //separate  first and last name

        scan = new Scanner(System.in);

         System.out.println("Enter your full name: ");
         String fullName = scan.nextLine();

         String firstName = fullName.substring(0,fullName.indexOf(" "));
         String lastName = fullName.substring(fullName.indexOf(" ")+1);

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);


         /*
        Write a program StartEndWords:
	    you have 2 words that must be 5 characters, and check if last letter of first word
	    and first letter of second work are same.
		if either one not 5 chars length:    print "need to be exactly 5 chars length"
		if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
		if they do not match:  print "Buzz - did not match"

		precondition: both words must have exactly 5 characters
         */

         scan = new Scanner(System.in);

        System.out.println("Enter two words: ");

        String firstWord = scan.next();
        String secondWord = scan.next();

        if(firstWord.length() == 5 && secondWord.length() == 5){

            if(firstWord.substring(firstWord.length()-1)
                    .equals(secondWord.substring(0,1))){

                System.out.println("Fizz -- Match");

            }else{

                System.out.println("Buzz -- Do not match");
            }

        }else{

            System.out.println("need to be exactly 5 chars length");
        }

        /*
        3. Ask user to enter a word. Print true is the first and last characters
        of the string are same characters, print false otherwise.
        Input:
        abba
        Output:
        true
         */

        scan = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String wrds = scan.next();

        if(wrds.charAt(0) == wrds.charAt(wrds.length()-1)){

            System.out.println(true);

        }else{

            System.out.println(false);
        }

        /*
     Write a Java method to display the middle character of a string
		a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character.
				Input :
					elephant
				Output:
					The middle character in the string: ph
     */


        scan = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String string = scan.next();

        String middleCharacter = "";

        int totalChars = string.length();
        int midNumber = totalChars / 2;

        if(totalChars % 2 != 0){

           middleCharacter += string.charAt(midNumber);

        }else{

            middleCharacter = middleCharacter + string.charAt(midNumber - 1) + string.charAt(midNumber);
        }

        System.out.println("middleCharacter = " + middleCharacter);


        scan.close();
    }
}
