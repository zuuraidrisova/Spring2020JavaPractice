package reviewPracticing;

import java.util.ArrayList;
import java.util.Arrays;

public class Lambda_Tasks {

    public static void main(String[] args) {

          /*
    1. write a program that can remove all the special characters from a list of Character
         */

        ArrayList<Character> ch = new ArrayList<>();

        ch.addAll(Arrays.asList('A','B','C','D','E','3','4','@','$'));

        System.out.println(ch);

        ch.removeIf(p -> p == '@' || p == '$' || p == '%' || p == '#' || p == '&');

        System.out.println(ch);

      //  2. write a program that can remove all the numbers that can be divisble by 3 or 5 in arrayList

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 50; i++){

            list.add(i + 1);
        }

        System.out.println("list = " + list);

        list.removeIf(p -> p %  3 == 0 || p % 5 ==0 );

        System.out.println("list = " + list);

    }
}
