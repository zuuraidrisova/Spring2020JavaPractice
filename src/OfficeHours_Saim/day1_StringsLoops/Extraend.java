package OfficeHours_Saim.day1_StringsLoops;

import java.util.Scanner;

public class Extraend {
    public static void main(String[] args) {

        /*

Given a string, return a new string made of 3 copies of the last 2 chars
of the original string. The string length will be at least 2.

extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"

                */

        Scanner scan =  new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = scan.next();

        String extraEnd = extraEnd(word);

        System.out.println(extraEnd);

    }

    public static String extraEnd(String str){

        String end = str.substring(str.length()-2);

        String extra = end + end + end;

        return extra;
    }
}
