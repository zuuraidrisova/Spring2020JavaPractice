package day23_CustomMethods;

import java.util.Scanner;

public class ReverseMethod {

    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = scan.next();

        reverseString(word);

    }
// create a function that can reverse any string

    public static void reverseString(String reverse){

        String result = "";

        for(int i = reverse.length()-1; i >= 0; i-- ){

            result += reverse.charAt(i);

        }
        System.out.println(result);
    }
}
