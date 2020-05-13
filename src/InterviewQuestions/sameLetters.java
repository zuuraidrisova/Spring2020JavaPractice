package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class sameLetters {

    /*
    Write a return method that check if a string is build out of the
     same letters as another string.

Ex:  same("abc",  "cab"); -> true

same("abc",  "abb"); -> false:

     */

    public static void main(String[] args) {

        String str = "abc";
        String str1 = "cab";

        boolean b = sameLetters(str,str1);

        System.out.println(b);
    }

    public static boolean sameLetters(String str, String str2){

       str =  str.toLowerCase();
       str2 = str2.toLowerCase();

       char [] ch = str.toCharArray();
       char [] ch1 = str2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        String a = Arrays.toString(ch);
        String b = Arrays.toString(ch1);

        if(a.equals(b)){

            return true;

        }else{

            return false;
        }

    }
}
