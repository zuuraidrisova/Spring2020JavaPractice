package day29_Wrapper_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class findingMaxMin {

    public static void main(String[] args) {

        /*
        create a lis of Integers, add 5 Integers, return max number from list
         */

        ArrayList<Integer> list =  new ArrayList<>();

        for(int i = 0; i < 5; i++){

            list.add(i+1);
        }

        System.out.println(list);


        int max = Integer.MIN_VALUE;

        for(int i = 0; i < list.size(); i++){


            if(list.get(i) > max){

                max = list.get(i);
            }
        }

        System.out.println(max);


        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1000,89,-1,20,34,0,-17));

        System.out.println(list2);

        int min = Integer.MAX_VALUE;

        for(Integer each : list2){

            if(each < min){

                min = each;
            }

        }

        System.out.println(min);






    }
}
