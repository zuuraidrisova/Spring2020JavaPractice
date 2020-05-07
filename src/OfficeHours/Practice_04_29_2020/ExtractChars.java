package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;

public class ExtractChars {

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

        char [] ch = str.toCharArray();

        ArrayList<Integer> digits = new ArrayList<>();
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> special = new ArrayList<>();


        for(char each :  ch){

            if(Character.isDigit(each)){

            Integer num = Integer.parseInt(""+each);

            digits.add(num);

            }else if(Character.isLetter(each)){

                letters.add(each);
            }else{

                special.add(each);
            }

        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(special);




    }
}
