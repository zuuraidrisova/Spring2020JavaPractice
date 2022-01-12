package day32_Predicate_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class secondMinMax {

    public static void main(String[] args) {

            /*

        write a program that can return the second max number from ArrayList

        ex: {1,2,3,4,5,6,7,8,8}; output 7

        write a program that can return the second min number from ArrayList

        ex: {1,1,2,3,4,5,6,7,8,8}; output 2

         */

        ArrayList<Integer>list =  new ArrayList<>();

        list.addAll(Arrays.asList(8,9,9,1,3,7,5,4,1,2,6));

        System.out.println(list);

        Collections.sort(list);;

        System.out.println(list);

        int secondMax = 0;

        int secondMin = 0 ;

        int max = Collections.max(list);

        System.out.println(max);

        list.removeAll(Arrays.asList(max));

        secondMax = Collections.max(list);

        System.out.println(secondMax);

        System.out.println("+======================+");

        int min = Collections.min(list);

        System.out.println(min);

        list.removeAll(Arrays.asList(min));

        secondMin = Collections.min(list);

        System.out.println(secondMin);

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(12,12,90,465,3874,2938,34,50));

        int min2 = Collections.min(list2);

        System.out.println(min2);

        list2.removeAll(Arrays.asList(min2));

        int min3 = Collections.min(list2);

        System.out.println(min3);

    }
}
