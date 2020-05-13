package Replit_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram2 {
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

          String word1 = "silent";
          String word2 = "listen";

         boolean a =  isAnagram(word1,word2);

          System.out.println(a);
      }

      public static boolean isAnagram(String word1 , String word2){

         word1 =  word1.toLowerCase();
         word2 = word2.toLowerCase();

         char [] ch =  word1.toCharArray();
         char [] ch1 = word2.toCharArray();


          Arrays.sort(ch);
          Arrays.sort(ch1);

          String str = Arrays.toString(ch);
          String str2 = Arrays.toString(ch1);

          if (str.equals(str2)) {

              return  true;
          }else{

              return false;
          }

      }

}
