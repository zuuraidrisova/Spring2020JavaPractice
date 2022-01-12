package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraylistMethod {

    public static void main(String[] args) {

        /*

contains(object):  checks whether Arraylist contains certain object or not, returns boolean

equals(object): checks whether list 1 is equal to list 2 , returns boolean

sort(list): Collections.sort(list) --> sorts list in ascending order

isEmpty(list) : checks if ArrayList is empty or not, if size is 0 returns true, else false

         */

        ArrayList<String> list = new ArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        boolean r = list.contains("A");//returns true because list has the object

        System.out.println(r);

        System.out.println("=======================");

        boolean r2 = list.contains("E");//returns false because list does not contain it

        System.out.println(r2);

        System.out.println("=======================");

        ArrayList<String> list2 = new ArrayList<String>();

        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");

        Collections.sort(list);
        Collections.sort(list2);

        boolean r3 = list.equals(list2);//returns true

        System.out.println(r3);

        System.out.println("=======================");

        int [] arr1 = {1,2,3,4,5};

        int [] arr2 = {5,4,3,2,1};

        boolean r4 = Arrays.equals(arr1,arr2);//returns false, bcs index matters, order is important

        System.out.println(r4);

        System.out.println("=======================");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r5 = Arrays.equals(arr1,arr2);//now they are same order, returns true

        System.out.println(r5);

        System.out.println("=======================");

        boolean b = list2.isEmpty();//false, because it has objects

        System.out.println(b);


    }
}
