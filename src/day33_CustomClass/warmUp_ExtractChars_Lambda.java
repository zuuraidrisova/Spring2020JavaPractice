package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class warmUp_ExtractChars_Lambda {

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

          String str = "ABCD123$%#@&456EFG!";

        char [] arr = str.toCharArray();

        //because ArrayList and lambda does not support  primitives
        //so we have to transform char to Character

        Character [] chars = new Character[arr.length];

        for(int i = 0; i < arr.length; i++){

            chars[i] = arr[i];
        }

        System.out.println(Arrays.toString(chars));


        ArrayList<Character> letters = new ArrayList<>(Arrays.asList(chars));

        Predicate<Character> onlyLetters = l -> !Character.isLetter(l);

        letters.removeIf(onlyLetters);

        System.out.println(letters);

        ArrayList<Character> digits = new ArrayList<>(Arrays.asList(chars));

        Predicate<Character> onlyDigits =  d -> ! Character.isDigit(d);

        digits.removeIf(onlyDigits);

        System.out.println(digits);

        ArrayList<Character> special = new ArrayList<>(Arrays.asList(chars));

        special.removeAll(letters);
        special.removeAll(digits);

        System.out.println(special);



        ArrayList<Character> special2 = new ArrayList<>(Arrays.asList(chars));

        Predicate<Character> specials = s -> Character.isLetter(s) || Character.isDigit(s);

        special2.removeIf(specials);

        System.out.println(special2);













    }
}
