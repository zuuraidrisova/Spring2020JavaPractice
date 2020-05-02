package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_retainAll {

    public static void main(String[] args) {

        //retainAll(Collection Type);  ==> removes all unmatching types
        //                                  retains/keeps all matching ones

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4));

        System.out.println(list);

        list.retainAll(Arrays.asList(1,2,3,4));// ==> retain all these inside matching

        System.out.println(list);





    }



}
