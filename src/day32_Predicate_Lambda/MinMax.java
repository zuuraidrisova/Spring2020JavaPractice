package day32_Predicate_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinMax {

    public static void main(String[] args) {

        /*

        write a program that can return the second max number from ArrayList

        ex: {1,2,3,4,5,6,7,8,8}; output 7

        write a program that can return the second min number from ArrayList

        ex: {1,1,2,3,4,5,6,7,8,8}; output 2

         */


        ArrayList<Integer> list =  new ArrayList<>();

        list.addAll(Arrays.asList(8,9,9,1,3,7,5,4,1,2,6));

        Collections.sort(list);

        System.out.println(list);


        int max = Collections.max(list);

        System.out.println(max);

        list.removeAll(Arrays.asList(max));

        int secondMax = Collections.max(list);

        System.out.println(secondMax);

        int min = Collections.min(list);

        System.out.println(min);

        list.removeAll(Arrays.asList(min));

        int secondMin = Collections.min(list);

        System.out.println(secondMin);






    }
}
