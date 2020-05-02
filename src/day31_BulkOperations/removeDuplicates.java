package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class removeDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,1,2,3));

        ArrayList<Integer> noDuplicates = new ArrayList<>();

        for(int i = 0 ; i < list.size(); i++){

            if(! noDuplicates.contains(list.get(i))){


                noDuplicates.add(list.get(i));
            }

        }

        System.out.println(noDuplicates);


        ArrayList<Integer> noDuplicates2 = new ArrayList<>();

        for(Integer each: list) {

            if (!noDuplicates2.contains(each)) {
                noDuplicates2.add(each);
            }
        }

        System.out.println(noDuplicates2);



        /*
        write a program that can remove duplicates from an array of integers
        no for each loop should be used
         */

        int [] arr = {1,1,2,2,3,3,4,};

        ArrayList<Integer> removed = new ArrayList<>();


        for(int i = 0; i < arr.length; i++ ){

            if(! removed.contains(arr[i])){

                removed.add(arr[i]);
            }
        }

        System.out.println(removed);


    }



}
