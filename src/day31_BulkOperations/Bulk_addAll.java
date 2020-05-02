package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_addAll {

    public static void main(String[] args) {

      //addAll(Collection Type) :

        ArrayList<Integer> list = new ArrayList<Integer>();

        //add 30,20,40,45,35,600

        /*

        we can add one by one, but it is tiring



        list.add(30);
        list.add(20);
        list.add(40);
        list.add(45);
        list.add(35);
        list.add(600);

        System.out.println(list);

         */

        //we use asList() method from Arrays to add all elements into list

       // int [] arr1 = {20,30,40}; ArrayList does not support primitives

        Integer [] arr2 = {20,30,40};


        list.addAll(Arrays.asList(30,20,40,45,35,600));

        list.addAll(Arrays.asList(arr2));

        System.out.println(list);

        System.out.println("==========================");

        String [] names = {"Murtaza","Muhtar","Muhesong","Sada","Rustem"};
                        //     0        1          2        3       4

       // names[5] = "Osman"; arrays size is fixed, it will not be added, outOfBound

        System.out.println(Arrays.toString(names));

        System.out.println("==========================");

        ArrayList<String> nameList = new ArrayList<String>();

        nameList.addAll(Arrays.asList(names));
                //      list ==> collectionType

        System.out.println(nameList);

        System.out.println("==========================");

        nameList.add("Osman");//it will accept, bcs arrayList's size is dynamic

        System.out.println(nameList);

        System.out.println("==========================");

        nameList.remove("Muhtar");//removes one element

        System.out.println(nameList);

        System.out.println("==========================");


        Integer[] numbers = {1,2,3,4,5,6,7,8,9};

        ArrayList<Integer> numbersList = new ArrayList<Integer>(Arrays.asList(numbers));
        //                                                  we can add like above too

        System.out.println(numbersList);






















    }
}
