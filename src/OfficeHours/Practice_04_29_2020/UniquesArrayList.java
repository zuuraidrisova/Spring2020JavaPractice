package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

import java.util.Collections;

public class UniquesArrayList {

    public static void main(String[] args) {

        //finding uniques from ArrayList of Integers
        //no loop, ne new arrayList, no sort method  should be used
        //use predicate

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,1,2,3,4,5,5));

        System.out.println(list);

        Predicate<Integer> duplicates = p -> Collections.frequency(list,p) > 1;
        //                               removing duplicates condition

        list.removeIf(duplicates);

        System.out.println(list);

        System.out.println("===============================");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,5));

        System.out.println(list2);

        ArrayList<Integer> uniques = new ArrayList<>();

        for(int i = 0; i < list2.size(); i++){

            int count = 0;

            for(int j = 0; j < list2.size(); j++){

                if(list2.get(i) == list2.get(j)){

                    count++;

                }
            }

            if(count == 1){

                uniques.add(list2.get(i));
            }

        }

        System.out.println(uniques);

        System.out.println("========================================");


        ArrayList<Integer> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList(1,1,2,3,4,5,5));

        System.out.println(list3);

        for(Integer each : list3){

            if(Collections.frequency(list3, each) == 1){

                System.out.println(each);
            }
        }







    }
}
