package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class removeDuplicatesFromArrayList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.addAll(Arrays.asList("Hello","Thanks","Sorry","Nice","Please","Please","Nice"));

        System.out.println(list);

        ArrayList<String> noDuplicates = new ArrayList<>();

        for(String each : list){

            if(! noDuplicates.contains(each)){

               noDuplicates.add(each);

            }else{

                continue;
            }


        }

        System.out.println(noDuplicates);

        ArrayList<String> noDuplicates2 = new ArrayList<>();

        for(int j = 0; j < list.size(); j++){

            if(! noDuplicates2.contains(list.get(j))){

                noDuplicates2.add(list.get(j));
            }
        }

        System.out.println(noDuplicates2);


    }
}
