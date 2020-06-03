package Replit_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class extractPredicate {
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

    public static void main(String[] args) {

        String str =  "ABCD123$%#@&456EFG!";

        ArrayList<Integer> digits = new ArrayList<>();
        ArrayList<String> letters = new ArrayList<>();
        ArrayList<Character> characters = new ArrayList<>();

        char [] ch = str.toCharArray();

       Character [] ch2 = new Character[ch.length];

        for(int i = 0; i < ch.length; i++){

            ch2[i] = ch[i];
        }
        System.out.println(Arrays.toString(ch2));

        ArrayList<Character> list = new ArrayList<>(Arrays.asList(ch2));

        System.out.println(list);

        for(Character each : list){

            if(Character.isLetter(each)){

                letters.add(""+each);
            }
        }

        for(int j = 0; j < list.size();j++){

            if(Character.isDigit(list.get(j))){

                digits.add(Integer.parseInt(""+list.get(j)));
            }
        }

        for(int i = 0; i < list.size();i++){

            if(list.get(i) >= 33 && list.get(i) <= 47
                    || list.get(i) >= 58 && list.get(i) <= 64){

                characters.add(list.get(i));
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(characters);

        System.out.println("==========================================");

        ArrayList<Character> letters2 = new ArrayList<>(Arrays.asList(ch2));

        letters2.removeIf(p -> ! Character.isLetter(p));

        System.out.println(letters2);

        ArrayList<Character> digits2 = new ArrayList<>(Arrays.asList(ch2));

        digits2.removeIf(p -> ! Character.isDigit(p));

        System.out.println(digits2);

        ArrayList<Character> chars = new ArrayList<>(Arrays.asList(ch2));

        chars.removeIf(p -> Character.isDigit(p) || Character.isLetter(p));

        System.out.println(chars);




    }
}
