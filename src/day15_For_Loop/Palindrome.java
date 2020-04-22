package day15_For_Loop;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        /*
        write a program to identify if a string is palindrome or not.
         if yes==> true,.otherwise ==> false
                level ==> level ==> palindrome
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word  = scan.next();
        int lastIndex = word.length()-1;
        String palindrome ="";

        for (int i = lastIndex; i >= 0; i--){
            palindrome=palindrome + word.charAt(i);
        }
        System.out.println(palindrome);

        if(palindrome.equals(word)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}