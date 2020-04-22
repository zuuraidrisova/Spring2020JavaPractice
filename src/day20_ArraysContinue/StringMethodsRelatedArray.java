package day20_ArraysContinue;

import java.util.Arrays;

public class StringMethodsRelatedArray {
    public static void main(String[] args) {

        String name = "Zuura Idrisova";

        char [] characters = name.toCharArray();//will return ech char of my name

        System.out.println(Arrays.toString(characters));


        String str = "Cybertek School".toLowerCase();//we can ignore case sensitivity like that
        String str2 = "School Cybertek".toUpperCase();


        char [] ch = str.toCharArray();//converts string to char and store them in char array
        char [] ch1 = str.toCharArray();//converts string to char and store them in char array

        Arrays.sort(ch);//sort characters in ascending order
        Arrays.sort(ch1);//sort characters in ascending order

        boolean b = Arrays.equals(ch,ch1);//now compares two arrays

        System.out.println(b);//returns true bcs they have same length and index  values












    }
}
