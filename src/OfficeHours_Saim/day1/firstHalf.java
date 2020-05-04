package OfficeHours_Saim.day1;

import java.util.Scanner;

public class firstHalf {
    public static void main(String[] args) {

        /*

        Given a string of even length, return the first half.
         So the string "WooHoo" yields "Woo".


firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word: ");

        String word = scan.next();

        String half = firstHalf(word);

        System.out.println(half);

    }

    public static String firstHalf(String str){

        int mid = str.length()/2;

       String half = str.substring(0,mid);

       return half;

    }
}
