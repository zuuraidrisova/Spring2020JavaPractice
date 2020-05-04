package WarmUp_Practices;

import java.util.ArrayList;

public class AlphabeticNumericSpecialChars {
    public static void main(String[] args) {
         /*
        write a program that can extract the sepecial characters, digits
        and letters from a string and stores them into seperate ArrayLists
         of Character:
			ex:
				str = "ABCD123$%#@&456EFG!";

				output:
					list1: {$, %, #, @, &, !}
					list2: {A, B, C, D, E, F, G}
					list3: {1, 2, 3, 4, 5, 6}
         */

         String str = "ABCD123$%#@&456EFG!";

         char [] ch = str.toCharArray();

        ArrayList<String> alphabets = new ArrayList<>();

         for(int i = 0; i < ch.length; i++){

             if(ch[i] >= 65 && ch[i] <= 90){

                 alphabets.add(""+ch[i]);
             }

         }

        System.out.println(alphabets);

         ArrayList<Character> alphabetsChar = new ArrayList<>();

         for(int j = 0; j < ch.length; j++){

             if(ch[j] >= 65 && ch[j] <= 90){

                 alphabetsChar.add(ch[j]);
             }
         }

        System.out.println(alphabetsChar);


         ArrayList<Integer> digits = new ArrayList<>();

         for(int k = 0; k < ch.length; k++){

             if(ch[k] >= 48 && ch[k] <= 57){

                 digits.add(Integer.parseInt(""+ch[k]));
             }
         }

        System.out.println(digits);

         ArrayList<Character> special = new ArrayList<>();

         for(int a = 0 ; a < ch.length; a++){

             if(ch[a] >= 33 && ch[a] <= 47 || ch[a] >= 58 && ch[a] <= 64){

                 special.add(ch[a]);
             }
         }

        System.out.println(special);



    }
}
