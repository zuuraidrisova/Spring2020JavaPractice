package day16_ForLoopContinueBreak;
import java.util.Scanner;
public class PalindromeTest {
    public static void main(String []args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your words: ");
        String word = scan.nextLine();

        String reversedWord = "";

        for(int a = word.length()-1; a >= 0; a-- ){

            reversedWord += word.charAt(a);
        }


        boolean palindrome = word.equalsIgnoreCase(reversedWord);

        if(palindrome){
            System.out.println("it is palindrome");

        }else{
            System.out.println("it is not palindrome");
        }


    }

}
