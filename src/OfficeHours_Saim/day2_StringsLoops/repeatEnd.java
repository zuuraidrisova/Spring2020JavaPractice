package OfficeHours_Saim.day2_StringsLoops;

public class repeatEnd {
    /*

Given a string and an int n, return a string made of n repetitions
of the last n characters of the string. You may assume that n is between
0 and the length of the string, inclusive.


repeatEnd("Hello", 3) → "llollollo"
repeatEnd("Hello", 2) → "lolo"
repeatEnd("Hello", 1) → "o"
     */

    public static void main(String[] args) {

        String str = "Hello";
        int n = 0;

       repeatEnd(str,n);

    }

    public static void repeatEnd(String str, int n) {

       String repeatedEnd = "";

       repeatedEnd += str.substring(str.length()-n);


     for (int i = 0; i < n; i++){

         System.out.println(repeatedEnd);
     }

    }
}
