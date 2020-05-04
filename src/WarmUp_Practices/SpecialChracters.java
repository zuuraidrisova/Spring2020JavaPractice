package WarmUp_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class SpecialChracters {

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

        String str =  "ABCD123$%#@&456EFG!";

        char [] ch = str.toCharArray();

        System.out.println(Arrays.toString(ch));

        ArrayList<Character> specialChar = new ArrayList<>();
        ArrayList<Character> alphabets = new ArrayList<>();
        ArrayList<Integer> digits =  new ArrayList<>();

        //adding digits

        for(int i = 0; i < ch.length; i++){

            if(ch[i] >= 48  && ch[i] <= 57){

               int num = Integer.parseInt(""+ch[i]);

               digits.add(num);
            }
        }

        //adding alphabets

        System.out.println(digits);

        for(int j = 0; j < ch.length; j++){

            if(ch[j] >= 65 && ch[j] <= 90){

                alphabets.add(ch[j]);
            }
        }

        System.out.println(alphabets);

        //adding special characters

        for(int i = 0; i < ch.length; i++){

            if((ch[i] >= 33 && ch[i] <= 47) || (ch[i] >= 58 && ch[i] <= 64)){

                specialChar.add(ch[i]);
            }
        }

        System.out.println(specialChar);
    }
}
