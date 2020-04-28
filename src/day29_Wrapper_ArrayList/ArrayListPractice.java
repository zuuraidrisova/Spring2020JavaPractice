package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        /*

        create a list of Integers
        add 5 Integers to it
        return max number from the list
        ** don't use sort method

         */

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(13);
        list.add(89);
        list.add(333);
        list.add(91);
        list.add(11);

        System.out.println(list);

        Integer max = Integer.MIN_VALUE;

        for(Integer each : list){

            if(each > max) {

                max = each;
            }
        }

        System.out.println(max);

    }
}
