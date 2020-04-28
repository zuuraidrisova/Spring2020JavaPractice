package Replit_Practices;

import java.util.Arrays;

public class Anagram {
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
    public static void main(String[] args) {

        boolean a = isAnagram("java","cava");

        System.out.println(a);


    }

    public static boolean isAnagram(String word1, String word2){

       word1 = word1.toLowerCase();
       word2 = word2.toLowerCase();

       char [] ch = word1.toCharArray();//silent
       char [] ch2 = word2.toCharArray();//listen

        Arrays.sort(ch);//e i l n s t
        Arrays.sort(ch2);//e i l n s t

        String a = Arrays.toString(ch);
        String b = Arrays.toString(ch2);

        if(a.equals(b)){

            return true;

        }else{

            return false;
        }



    }

}
