package day30_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram2 {

    public static void main(String[] args) {

        /*

    Anagram is a word, phrase, or name formed by rearranging the letters of
    another, such as cinema, formed from iceman.

isAnagram method checks if word1 and word2 are anagram to each other
then return a boolean.

each letter in word1 should appear in word2 exact number of times
ignore empty spaces
make your code case insensitive

Examples:

isAnagram("listen", "Silent") ==> true

isAnagram("earth", "heart") ==> true

isAnagram("star", "rats") ==> true

isAnagram("hi", "bye") ==> false

isAnagram("java", "cava") ==> false

     */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first word: ");

        String first = scan.next();

        System.out.println("Enter second word: ");

        String second = scan.next();


       boolean a =  Anagram(first,second);

        System.out.println(a);

    }

    public static boolean Anagram(String word1, String word2){

       word1 =  word1.toLowerCase();
       word2 =  word2.toLowerCase();

       char [] ch = word1.toCharArray();
       char [] ch2 = word2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);

        String a = Arrays.toString(ch);
        String b = Arrays.toString(ch2);


        if(a.equals(b)){

            return  true;
        }else{

            return false;
        }





    }
}
