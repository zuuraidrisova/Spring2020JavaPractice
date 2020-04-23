package Replit_Practices;

import java.util.Arrays;

public class MergeStringMethod {
    /*
    When gears merge and work together, one teeth from each one goes in order.
Write a method mergeStrings that will return the strings merged, one letter at a time,
 starting with one.   Please note one and two can be of different lengths. Please
  look at below examples:

s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"

mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

mergeStrings("java", "selenium") ==> "jsaevla
     */

    public static void main(String[] args) {

        String str1 = "12345";

        String str2 = "abcde";

        String result = mergeStrings(str1,str2);

        System.out.println(result);
    }
    public static String mergeStrings(String one, String two) {

        String result = "";

        for (int i = 0; i < one.length() || i < two.length(); i++){

            if(i < one.length()){

                result += one.charAt(i);
            }
            if(i < two.length()){

                result += two.charAt(i);
            }

        }

        return result;
    }

}
