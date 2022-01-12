package WarmUp_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram1 {

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
           String a = "cinema";
           String b = "iceman";

           boolean r = isAnagram(a,b);

        System.out.println(r);
    }

    public static boolean isAnagram(String word1, String word2){

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        char [] ch = word1.toCharArray();
        char [] ch2 = word2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);

       String a =  Arrays.toString(ch);
       String b = Arrays.toString(ch2);


       if(a.equals(b)){

           return true;
       }else{
           return false;
       }
    }
}
