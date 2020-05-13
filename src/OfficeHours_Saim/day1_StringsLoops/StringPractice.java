package OfficeHours_Saim.day1_StringsLoops;

import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {

        /*
        Given an "out" string length 4, such as "<<>>", and a word,
        return a new string where the word is in the middle of the out string,
         e.g. "<<word>>". Note: use str.substring(i, j) to extract the String
         starting at index i and going up to but not including index j.


makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter out: ");
        String out = scan.next();
        System.out.println("Please enter a word: ");
        String word = scan.next();


       String str =  makeOutWord(out,word);

        System.out.println(str);
    }

    public static String makeOutWord(String out, String word){

        String front = out.substring(0,2);
        String back = out.substring(2);

        String str = front + word + back;

        return str;

    }
}
