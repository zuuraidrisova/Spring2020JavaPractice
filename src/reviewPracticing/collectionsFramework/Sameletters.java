package reviewPracticing.collectionsFramework;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Sameletters {

    /*
     2. write a program that can identify if two strings are build out of the
        same letters
        ex:
        str1 = "abababa"
        str2 ="ab";
        output: true
     */

    public static void main(String[] args) {

        String str1 = "abababa";
        String str2 = "ab";

        boolean ok = sameLetters(str1,str2);

        System.out.println("ok = " + ok);


    }

    public static  boolean sameLetters(String str1, String str2){

        Set<String> set1 = new TreeSet<>(Arrays.asList(str1.split("")));

        Set<String> set2 = new TreeSet<>(Arrays.asList(str2.split("")));

        String result1 = "";
        String result2 = "";

        for (String each : set1){

            result1 += each;
        }

        for (String each : set2){

            result2 += each;
        }

        if (result1.equalsIgnoreCase(result2)){

            return true;
        }

        return  false;

    }
}
