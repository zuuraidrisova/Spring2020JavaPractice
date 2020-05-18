package Replit_Practices;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram3 {
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

            String str = "java";
            String str2 = "cava";

            boolean b = isAnagram(str,str2);

            System.out.println(b);
        }


        public static boolean isAnagram(String str, String str2){

            str = str.toLowerCase();
            str2 = str2.toLowerCase();

           char ch [] =  str.toCharArray();
           char ch2 [] = str2.toCharArray();

            Arrays.sort(ch);
            Arrays.sort(ch2);

            String a = Arrays.toString(ch);
            String b = Arrays.toString(ch2);

            if(a.equalsIgnoreCase(b)){

                return true;

            }else{

                return false;
            }
        }
}
