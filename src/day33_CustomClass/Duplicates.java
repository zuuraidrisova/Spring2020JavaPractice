package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Duplicates {

    public static void main(String[] args) {

        ArrayList<String> list =  new ArrayList<>();

        list.addAll(Arrays.asList("A","A","B","C","D","D"));

        ArrayList<String> duplicates = new ArrayList<>();


        for(int i = 0; i < list.size(); i++ ){

            int count = Collections.frequency(list,list.get(i));

            if(count > 1){

                if(!duplicates.contains(list.get(i))) {

                    duplicates.add(list.get(i));
                }
            }
        }

        System.out.println(duplicates);

        System.out.println("============================");

        ArrayList<String > duplicates2 = new ArrayList<>();

        for(String each: list){

            int count =0;

            for(String each2 : list){

                if(each == each2){

                    count++;
                }
            }

            if(count > 1){

                if(! duplicates2.contains(each)) {

                    duplicates2.add(each);
                }
            }
        }

        System.out.println(duplicates2);

        System.out.println("============================");

        Predicate<String > duplicate = p -> Collections.frequency(list,p) == 1;


        list.removeIf(duplicate);

        System.out.println(list);

        System.out.println("============================");

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(90,89,726,129,10,-1));

        int max = Collections.max(list2);

        System.out.println(max);

        int min = Collections.min(list2);

        System.out.println(min);




    }
}
