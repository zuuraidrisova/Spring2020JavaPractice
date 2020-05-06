package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class extractAlphabetsDigitsSpecial {

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

        System.out.println(Arrays.toString(ch));

        ArrayList<String> letters = new ArrayList<>();
        ArrayList<Integer> digits = new ArrayList<>();
        ArrayList<Character> special = new ArrayList<>();


        for(int i = 0; i < ch.length; i++){

            if(ch[i] >= 65 && ch[i] <=90){
                // Character.isLetter(ch[i]); ==> can help to identify letters

                letters.add(""+ch[i]);

            }
        }

        System.out.println(letters);

        for(int i = 0; i < ch.length; i++){

            if(ch[i] >= 48 && ch[i] <= 57){
                //Character.isDigit(); ==> can also identify whether digits or not

                digits.add(Integer.parseInt(""+ch[i]));
                //Integer.parseInt(txt); transforms text into numbers, accepts text so ""+ch[i]
            }
        }

        System.out.println(digits);

        for(int i = 0; i < ch.length; i++){


            if((!Character.isDigit(ch[i])) && (!Character.isLetter(ch[i]))){

                special.add(ch[i]);
            }
        }

        System.out.println(special);


        System.out.println("================================");

        //another ways of extracting letters, digits, special chars:
        //using one loop but multiple conditions


        String str2 = "ABCD123$%#@&456EFG!";

        char [] ch2 = str2.toCharArray();

        System.out.println(Arrays.toString(ch2));

        ArrayList<Character> letter = new ArrayList<>();
        ArrayList<Integer> digit = new ArrayList<>();
        ArrayList<Character> specialChars = new ArrayList<>();


        for(int i = 0; i < ch2.length; i++){


            if(Character.isLetter(ch[i])){

                letter.add(ch[i]);

            }else if(Character.isDigit(ch[i])){


                digit.add(Integer.parseInt(""+ch[i]));

            }else{

                specialChars.add(ch[i]);
            }
        }

        System.out.println(letter);
        System.out.println(digit);
        System.out.println(specialChars);




    }
}
