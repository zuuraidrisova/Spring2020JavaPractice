package reviewPracticing;

import java.util.Arrays;

public class ArrayList_Tasks2 {

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

        String str = "listen";
        String str2 = "silent";

        boolean b = isAnagram(str,str2);

        System.out.println("b = " + b);

        String a = "hi";
        String a1 = "bye";

        boolean b2 = isAnagram(a, a1);

        System.out.println("b2 = " + b2);

        boolean b3 =  isAnagram2(str,str2);

        System.out.println("b3 = " + b3);

        boolean b4 = isAnagram2(a,a1);

        System.out.println("b4 = " + b4);
    }

    public static boolean isAnagram(String str1, String str2){


        char ch1 [] = str1.toCharArray();
        char ch2 [] = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String word1 = "";
        String word2 = "";

        for (int i = 0; i < ch1.length; i++){

            word1 += ch1[i];

        }

        for (int i = 0; i < ch2.length; i++){

            word2 += ch2[i];

        }

        if (word1.equalsIgnoreCase(word2)){

            System.out.println("It is anagram");

            return true;

        }

        System.out.println("It is not anagram");
        return false;

    }

    public static boolean isAnagram2(String word, String word2){

        char ch [] = word.toCharArray();
        char ch2 [] = word2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);

        String str = Arrays.toString(ch);
        String str2 = Arrays.toString(ch2);

        if (str.equalsIgnoreCase(str2)){

            return true;
        }

        return  false;
    }
}
