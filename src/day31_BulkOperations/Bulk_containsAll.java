package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_containsAll {

    public static void main(String[] args) {

      // containsAll(); --> verifies if all objects in CollectionType are contained
        // or not , returns boolean

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        //if 10,20,60 exist in Arraylist return true, else false

        boolean a = list.contains(10); // true
        boolean b = list.contains(20); //true
        boolean c = list.contains(60); //false


        boolean result =a == true && b == true && c == true;

        System.out.println(result);//returns false, because 60 is not in the list

       /*
       we use asList(elements); method from Arrays utility and pass it to
        containsAll() to check whether contains them all or not, return true or false
         ex: list.containsAll(Arrays.asList(10,20,50);

        */

       boolean d =  list.containsAll(Arrays.asList(10,20,60));//false

        System.out.println(d);

        Integer [] arr = {10,30,40};//if we don't want to pass each element,
        // we can create object array

        boolean e = list.containsAll(Arrays.asList(arr));//true

        System.out.println(e);

        boolean f = list.containsAll(Arrays.asList(20,30,40));//true

        System.out.println(f);














    }
}
