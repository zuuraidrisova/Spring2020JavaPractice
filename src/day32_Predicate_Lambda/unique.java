package day32_Predicate_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class unique {

    public static void main(String[] args) {

        //return unique values from ArrayList

        ArrayList<String> names =  new ArrayList<>();

        names.addAll(Arrays.asList("Zuura","Irina","Irina","Anna","Anna"));

        ArrayList<String> uniques = new ArrayList<>();

        for(int i = 0; i < names.size(); i++){

            int count =  Collections.frequency(names,names.get(i));

            if(count == 1){

               uniques.add(names.get(i));
            }

        }

        System.out.println(uniques);

        ArrayList<Character> list = new ArrayList<>();

        list.addAll(Arrays.asList('a','a','b','b','c','d'));

        ArrayList<Character> uniqueChars = new ArrayList<>();

        for(Character each : list) {

            int count2 = Collections.frequency(list, each);

            if (count2 == 1) {

                uniqueChars.add(each);
            }
        }

        System.out.println(uniqueChars);

    }
}
