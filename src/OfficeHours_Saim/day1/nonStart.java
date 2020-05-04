package OfficeHours_Saim.day1;

import java.util.Scanner;

public class nonStart {
    public static void main(String[] args) {

        /*

Given 2 strings, return their concatenation, except omit the first char of each.
The strings will be at least length 1.


nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String first =  scan.next();
        System.out.println("Enter second word: ");
        String second = scan.next();

        String str = nonStart(first,second);

        System.out.println(str);


    }
    public static String nonStart(String str, String str2){

      String first = str.substring(1);
      String second = str2.substring(1);

        return first.concat(second);
    }
}
