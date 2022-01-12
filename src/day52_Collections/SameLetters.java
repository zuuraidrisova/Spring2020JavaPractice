package day52_Collections;

import java.util.Arrays;
import java.util.TreeSet;

public class SameLetters {

    //write a program that can identify if two strings are built out of same letters

    public static void main(String[] args) {

        String str1 = "ababababa";
        String str2 = "baba";

        boolean b = sameCharacters(str1,str2);

        System.out.println(b);

        String word = "zuuura";
        String word2 = "zuuuras";

        boolean b1 = sameLetters(word,word2);

        System.out.println(b1);

        String s = "zuura";
        String s1 = "arrruuuzz";

        boolean b2 = sameLetters2(s,s1);

        System.out.println(b2);

    }

    public static boolean sameCharacters(String str1, String str2){

        TreeSet<String> same = new TreeSet<>(Arrays.asList(str1.split("")));

        TreeSet<String> same2 = new TreeSet<>(Arrays.asList(str2.split("")));

        str1 = "";

        for(String each: same){

            str1 += each;

        }

        str2 = "";

        for(String each: same2){

            str2 += each;

        }

        return str1.equals(str2);

    }

    public static boolean sameLetters(String str1, String str2){

        String [] arr1 = str1.split("");
        String [] arr2 = str2.split("");

        TreeSet<String> t1 = new TreeSet<>(Arrays.asList(arr1));
        TreeSet<String> t2 = new TreeSet<>(Arrays.asList(arr2));

        str1 = t1.toString();
        str2 = t2.toString();

        return str1.equals(str2);

    }

    public static boolean sameLetters2(String str1, String str2){

        str1 = new TreeSet<>(Arrays.asList(str1.split(""))).toString();
        str2 = new TreeSet<>(Arrays.asList(str2.split(""))).toString();

        return str1.equals(str2);

    }

}
