package day32_Predicate_Lambda;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates {

    public static void main(String[] args) {

/*
write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]
 */

        ArrayList<String> list = new ArrayList<>();

        list.addAll(Arrays.asList("A", "B", "B", "C", "D", "D"));

        System.out.println(list);

        ArrayList<String> duplicates = new ArrayList<>();

       for(int i = 0; i < list.size(); i++){

           int count = 0;

           for(String each : list){

               if(each.equals(list.get(i))){

                   count++;
               }
           }

           if(count > 1){// if count is greater than 1

               if(! duplicates.contains(list.get(i))) {
                   // if it is not contained in duplicates yet

                   duplicates.add(list.get(i));//then add
               }

           }

       }

        System.out.println(duplicates);








    }
}
