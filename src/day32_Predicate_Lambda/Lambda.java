package day32_Predicate_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda {

    public static void main(String[] args) {

        /*
        Predicate ==> blueprint of class, helps to create our own conditions
                      based on  data type, can be applied to any collection type
        Lambda ==>

         */
        //   odd number condition: num % 2 != 0

        Predicate<Integer> oddNumber = p -> p % 2 != 0;
       //        data type  name      number -> condition



        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        Predicate<Integer> odd = number -> number % 2 != 0;

       list.removeIf(odd);

        System.out.println(list);

        System.out.println("======================");

        ArrayList<Integer>list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,3,4,5,6));

        Predicate<Integer> even = n -> n % 2 == 0;

        list2.removeIf(even);

        System.out.println(list2);

        System.out.println("=====================");


        ArrayList<Integer>list3 = new ArrayList<>();

        list3.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        Predicate<Integer> less5 = n -> n < 5;

        list3.removeIf(less5);

        System.out.println(list3);

        System.out.println("=====================");

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Zuura","Zarina","Zeynep","Alina","Irina"));

        Predicate<String> startsWithZ = z -> ! z.startsWith("Z");
            //                         opposite , make it lower case, then starts with

        names.removeIf(startsWithZ);

        System.out.println(names);

        System.out.println("===========================");

        ArrayList<String> names2 = new ArrayList<>();

       names2.addAll(Arrays.asList("Asan","Aiba","Muxtar","Dilnaz","Radu"));

        Predicate<String > startsWithA_M = each -> each.startsWith("A")

                || each.startsWith("M");

        names2.removeIf(startsWithA_M);

        System.out.println(names2);

        System.out.println("===================================");

        ArrayList<Character> ch = new ArrayList<>();

        ch.addAll(Arrays.asList('A','B','C','D','E','3','4','@','$'));

        System.out.println(ch);

        Predicate<Character> digits = nums -> nums >= 48 && nums <= 57;

        ch.removeIf(digits);

        System.out.println(ch);

        ch.add('9');

        System.out.println(ch);

        Predicate<Character> isDigit = d ->  Character.isDigit(d);

       ch.removeIf(isDigit);

       System.out.println(ch);

        System.out.println("=============================");

        ArrayList<Integer> num = new ArrayList<>();

        num.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        num.removeIf(k -> k > 5);//we can pass lambda in to method too

        System.out.println(num);












    }
}
