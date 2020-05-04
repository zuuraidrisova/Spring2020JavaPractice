package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();

        list.addAll(Arrays.asList(10,20,30,40,50,60,70));

        System.out.println(list);

        int max = Collections.max(list);

        System.out.println(max);

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < list.size(); i++){

            if(min > list.get(i)){

                min = list.get(i);
            }
        }

        System.out.println(min);

        ArrayList<Character> chars = new ArrayList<>();

        for(int i = 64; i < 90; i++){

            chars.add((char) (i+1));

        }

        System.out.println(chars);

        ArrayList<Integer> first = new ArrayList<>();

        for(int i = 0; i < 5; i++){

            first.add(i+1);
        }

        System.out.println(first);

        ArrayList<Integer> second = new ArrayList<>();

        for(int j = 0; j < 6; j++){

            second.add(j+1);
        }

        System.out.println(second);

        ArrayList<Integer>combined = new ArrayList<>();

        for(int i = 0; i < first.size(); i++){

            combined.add(first.get(i));
        }

        for(int j = 0; j < second.size(); j++){

            combined.add(second.get(j));
        }

        System.out.println(combined);

      int count1 =   Collections.frequency(combined,combined.get(0));

        System.out.println(count1);

        ArrayList<Integer> uniques = new ArrayList<>();

        for(int i = 0; i < combined.size(); i++){

            int count = 0;

            for(int j = 0; j < combined.size(); j++){

               if( combined.get(i) == combined.get(j)){

                   count++;
               }
            }
            if(count == 1){

                uniques.add(combined.get(i));
            }
        }

        System.out.println(uniques);

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Zuura","Zarina","Aya","Aya"));

        ArrayList<String> noDup = new ArrayList<>();

        for(int i = 0; i < names.size(); i++){


            if(!noDup.contains(names.get(i))){

                noDup.add(names.get(i));
            }
        }

        System.out.println(noDup);

        




    }
}
