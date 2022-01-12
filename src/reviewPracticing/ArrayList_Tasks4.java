package reviewPracticing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Tasks4 {

    public static void main(String[] args) {

        /*


 1. create an ArrayList of string called country names
 2. write a program that can remove all the country names
  that have length of 10 or greater


 */

        ArrayList<String> countryNames = new ArrayList<>(Arrays.asList("Kyrgyzstan","Italy","Netherlands",
                "United States Of America", "Canada","South Korea","Russian Federation"));

        System.out.println("countryNames = " + countryNames);

        countryNames.removeIf(p -> p.length() >= 10);

        System.out.println("countryNames = " + countryNames);

              /*
  1. write a program that can return the duplicated objects from a anArray List of Integers
   Ex:
      list: {1,1,2,3,4,5,5}
      sout(list); ==> {2,3,4};
Note: 1. DO NOT use any extra arrayList
     2. DO NOT use any loops
     3. do not use any sort method
     4. use predicate only and collections methods only
Hint:   Collections.frequency() // will return the frequency
      removeIf( frequency == 1)  can keep the unique objects in arrayList
   */

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,5));

        System.out.println("numbers = " + numbers);

        numbers.removeIf(p -> Collections.frequency(numbers, p) == 1);

        System.out.println("numbers = " + numbers);

        /*
     write a program that can return the unique objects from a anArray List of Integers
        Ex:
            list: {1,1,2,3,4,5,5}
            sout(list); ==> {2,3,4};
    Note: 1. DO NOT use any extra arrayList
          2. DO NOT use any loops
          3. do not use any sort method
          4. use predicate only and collections methods only
    Hint:   Collections.frequency() // will return the frequency
            removeIf( frequency == 1)  can keep the unique objects in arrayList
     */

        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,5));

        System.out.println("numbers = " + numbers2);

        numbers2.removeIf(p -> Collections.frequency(numbers2, p) > 1);

        System.out.println("numbers = " + numbers2);

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

        char ch []  = str.toCharArray();

        System.out.println(Arrays.toString(ch));

       ArrayList<Integer> digits = new ArrayList<>();
       ArrayList<String> letters = new ArrayList<>();
       ArrayList<Character> chars = new ArrayList<>();

       for (int i = 0; i < ch.length; i++){

           if (Character.isDigit(ch[i])){

               digits.add(Integer.parseInt(""+ch[i]));
           }

           if (Character.isLetter(ch[i])){

               letters.add(String.valueOf(ch[i]));
           }

           if (!Character.isLetter(ch[i]) && !Character.isDigit(ch[i])){

               chars.add(ch[i]);
           }
       }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("chars = " + chars);

        // above task using lambda

        Character [] ch2 = new Character[ch.length];

        for (int i = 0; i < ch.length; i++){

            ch2[i] = ch[i];
        }

        System.out.println(Arrays.toString(ch2));

        ArrayList<Character> digits1 = new ArrayList<>(Arrays.asList(ch2));
        ArrayList<Character> letters1 = new ArrayList<>(Arrays.asList(ch2));
        ArrayList<Character> chars1 = new ArrayList<>(Arrays.asList(ch2));

        chars1.removeIf(p -> Character.isDigit(p) || Character.isLetter(p));

        System.out.println("chars1 = " + chars1);

        letters1.removeIf(p -> Character.isDigit(p) || !Character.isLetter(p));

        System.out.println("letters1 = " + letters1);

        digits1.removeIf(p -> Character.isLetter(p) || !Character.isDigit(p));

        System.out.println("digits1 = " + digits1);


    }

}
