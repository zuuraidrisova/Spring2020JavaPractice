package day33_CustomClass;

import java.util.ArrayList;

public class WarmUp_Special {

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

        ArrayList<String> alphabets = new ArrayList<>();

        ArrayList<Integer> digits = new ArrayList<>();

        ArrayList<Character> specialChars =  new ArrayList<>();

        char [] ch =  str.toCharArray();

        for(int i = 0; i < ch.length; i++){

            if(ch[i] >= 65 && ch[i] <= 90){

                alphabets.add(""+ch[i]);// we need to transform i to string
                       // in order to add because our list is String Object

            }
        }

        System.out.println(alphabets);

        for(int i = 0; i < ch.length; i++){

            if(ch[i] >= 48 && ch[i] <= 57){

                digits.add(Integer.parseInt(""+ch[i]));
                // we need to make string of text int to add to our Integer list
            }
        }

        System.out.println(digits);

        for(char each : ch){

            if(each >= 33 && each <= 47 || each >= 58 && each <= 64){

                specialChars.add(each);
                //it is already character and list is Character
            }
        }

        System.out.println(specialChars);

        //another way

        System.out.println("=============================");

        ArrayList<Character> letters = new ArrayList<>();
        //we can store in Character ArrayList

        for(char each : ch){

            if(Character.isLetter(each)){

                letters.add(each);

            }
        }

        System.out.println(letters);

        ArrayList<Character> digits1 = new ArrayList<>();
        //we can store in Character ArrayList

        for(char each : ch){

            if(Character.isDigit(each)){

                digits1.add(each);
            }
        }

        System.out.println(digits1);

        ArrayList<Character> special = new ArrayList<>();
        //we can store in Character ArrayList

        for(char each : ch){

            if(!(Character.isLetter(each)) && !(Character.isDigit(each))){

                special.add(each);
            }

        }

        System.out.println(special);

    }
}
