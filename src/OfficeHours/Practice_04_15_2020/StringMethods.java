package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
       /*

       String methods related to Array:

       split() : splits string and return string array

       toCharArray() : returns string as char array, because string
       consists of sequence of single characters


        */


       String str = "Cybertek";

       char [] ch = str.toCharArray();

        System.out.println(Arrays.toString(ch));
        System.out.println(str.length() == ch.length);//true, because string and char array are similar length

        String str1 = "ABC";
        String str2 = "BAC";

        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){//when we compare arrays we use Arrays.equals(array1, array2)
            System.out.println("true");
        }else{
            System.out.println("false");
        }


        System.out.println("=====================");

        String sentence = "I like to learn java, because it is fun";

        String []  words = sentence.split(" ");

        int length = words.length;

        System.out.println(Arrays.toString(words));
        System.out.println(length);

        String [] reversed = new String [length];
        int j = reversed.length-1;

        for(int i = 0;  i < length; i++){

            reversed[j] = words[i];
            j--;
        }

        System.out.println(Arrays.toString(reversed));
    }
}
