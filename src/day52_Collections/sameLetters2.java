package day52_Collections;

import java.util.Arrays;
import java.util.TreeSet;

public class sameLetters2 {

    //write a program that can identify if two strings are built out of same letters

    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "olleh";

        boolean b = sameLetters(str1,str2);

        System.out.println(b);
    }

    public static boolean sameLetters(String str1, String str2){

        TreeSet<String> letters = new TreeSet<>(Arrays.asList(str1.split("")));
        TreeSet<String> letters2 = new TreeSet<>(Arrays.asList(str2.split("")));

        str1 = letters.toString();
        str2 = letters2.toString();

        return str1.equals(str2);

    }
}
