package day32_Predicate_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class minMaxMethods {

    public static void main(String[] args) {

        /*
        min(Collection type); ==> returns min object from collection type

        max(Collection type); ==> returns max object from collection type

         */

        ArrayList<Integer> list =  new ArrayList<>();

        list.addAll(Arrays.asList(8,9,9,1,3,7,5,4,1,2,6));

        int a =  Collections.max(list);//we can assign it to an int

        System.out.println(a);

        Integer b  = Collections.min(list);//we can assign it to an Integer

        System.out.println(b);





    }
}
