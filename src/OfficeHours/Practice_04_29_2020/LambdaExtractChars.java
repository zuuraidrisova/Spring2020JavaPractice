package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class LambdaExtractChars {

    public static void main(String[] args) {

          /*
        write a program that can extract the special characters, digits
         and alphabets from a string and stores them into seperate
          ArrayLists of Character:
        ex:
        str = "ABCD123$%#@&456EFG!";
        list1: {$, %, #, @, &, !}
        list2: {A, B, C, D, E, F, G}
        list3: {1, 2, 3, 4, 5, 6}

          */

          String str =  "ABCD123$%#@&456EFG!";

          char [] ch = str.toCharArray();
          Character [] chars = new Character[ch.length];

          for(int i = 0; i < ch.length; i++){

              chars[i] = ch[i];
          }

        System.out.println(Arrays.toString(chars));

        System.out.println("==================================");

        ArrayList<Character> digits = new ArrayList<>();
        digits.addAll(Arrays.asList(chars));
        System.out.println(digits);

        digits.removeIf(p -> ! Character.isDigit(p));

        System.out.println(digits);


        System.out.println("==================================");

        ArrayList<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList(chars));

        System.out.println(letters);

        letters.removeIf(p ->!Character.isLetter(p));

        System.out.println(letters);

        System.out.println("==================================");

        ArrayList<Character> special = new ArrayList<>();
        special.addAll(Arrays.asList(chars));

        System.out.println(special);

        special.removeIf(p -> Character.isDigit(p) || Character.isLetter(p));

        System.out.println(special);

        System.out.println("==================================");





    }
}
