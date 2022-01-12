package day32_Predicate_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionMethods {

    public static void main(String[] args) {

        /*
       COLLECTION METHODS :

        sort(Collection type) : sorts any given collections type in ascending order

        min(Collection type): returns min object from collection type

        max(Collection type): returns max object from collection type

        frequency(Collection type): returns frequency of object from collection types

        swap(Collection type, index1, index2):  switches elements index1 with index2

        replaceAll(Collection type, oldValue, newValue): replaces old with new value

         */

        ArrayList<String> list = new ArrayList<>();

        list.addAll(Arrays.asList("Zuura","Asan","Alina","Sary"));

        System.out.println(list);

        Collections.swap(list, 0,3);

        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(10,20,30,40,50));

        System.out.println(list2);

        Collections.swap(list2, 0,4);

        System.out.println(list2);

        System.out.println("=====================================");

        ArrayList<Integer> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList(2,3,4,5,1,1,1));

        Collections.replaceAll(list3,1,10);

        System.out.println(list3);

        System.out.println("=====================================");

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Omer","Anna","Zuura","Sha","Omer","Omer"));

        Collections.replaceAll(names,"Omer","Irina");

        System.out.println(names);

    }
}
