package OfficeHours_Saim.day1;

import java.util.Scanner;

public class middleThree {
    public static void main(String[] args) {

        /*

Given a string of odd length, return the string length 3 from its middle,
 so "Candy" yields "and". The string length will be at least 3.


middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a word: ");
        String str = scan.next();

        String mid = middleThree(str);

        System.out.println(mid);
    }
    public static String middleThree(String str){

        int mid = str.length()/2;

        String middle = str.substring(mid-1, mid+2);

        return middle;

    }
}
