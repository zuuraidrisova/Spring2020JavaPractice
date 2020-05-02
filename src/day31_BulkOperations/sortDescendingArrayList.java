package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Collections;

public class sortDescendingArrayList {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<Integer>();

       list.add(10);
       list.add(100);
       list.add(1000);
       list.add(20);
       list.add(200);

        System.out.println("the original list ==> "+list);//before sorting

        System.out.println("=======================");

        Collections.sort(list);

        System.out.println("list after sorting ==> "+ list);//after sorting

        System.out.println("=======================");

        ArrayList<Integer> sortDesc = new ArrayList<Integer>();

        for(int i = list.size()-1; i >= 0; i --){

            sortDesc.add(list.get(i));//we should add sortDesc list getting it from index i

        }

        System.out.println("list after soring it descending order ==> "+sortDesc);

        System.out.println("=======================");

        list = sortDesc;//assigning descending order to list back

        System.out.println("assigning descending order back to list  ==> " + list);




    }
}
