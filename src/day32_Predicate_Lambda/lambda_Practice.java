package day32_Predicate_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class lambda_Practice {

    public static void main(String[] args) {


       /*
    1. write a program that can remove all the special characters from a list of Character
    2. write a program that can remove all the numbers that can divisble by 3 or 5 in arrayList
     */

        ArrayList<Character> ch = new ArrayList<>();

        ch.addAll(Arrays.asList('A','B','C','D','E','3','4','@','$'));

        System.out.println(ch);

        Predicate<Character> special = s -> s == '@' || s == '#' || s == '$'

                || s == '%' || s == '&';


        ch.removeIf(special);

        System.out.println(ch);

        ArrayList<Integer> list = new ArrayList<>();

        for(int  i = 0; i <= 50; i++){

            list.add(i);
        }

        System.out.println(list);

        Predicate<Integer> divisibleBy3or5 = d -> d % 3 == 0 || d % 5 == 0;

        list.removeIf(divisibleBy3or5);

        System.out.println(list);


    }
}
