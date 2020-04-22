package Replit_Practices;

import java.util.Arrays;

public class TwoStringsBuildOfSameChars {
    public static void main(String[] args) {
        /*
        write a program that can check if two Strings are build out of same
        Ex:
            if str1 = "aabbbc";  str2 ="cab";
            output: true
            if str1 ="abcd";  str2 ="abc";
            output: false
            Hint: you will need array and Arrays' methods
         */

        String str1 = "aabbbc";
        String str2 = "cab";

        char [] ch = str1.toCharArray();
        char [] ch1 = str2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        if(Arrays.equals(ch,ch1)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
}
