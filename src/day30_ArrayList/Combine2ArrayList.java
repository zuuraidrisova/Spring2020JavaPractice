package day30_ArrayList;

import java.util.ArrayList;

public class Combine2ArrayList {

    public static void main(String[] args) {

        /*

        write a program that can combine two String arrays into one arrayList
    		ex:
    			arr1 = {"A", "B", "C"};
    			arr2 = {"D", "E", "F", "G"};
    			list ==> {"A", "B", "C", "D", "E", "F", "G"}

    			//FOR LOOP

         */

        String [] arr1 =  {"A", "B", "C"};

        String [] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<String>();

        for(int i = 0; i < arr1.length; i++){

            String eachElement = arr1[i];

            list.add(eachElement);

        }

        for(int i = 0; i < arr2.length; i++){

            list.add(arr2[i]);

        }

        System.out.println(list);

       /*

        write a program that can combine two String arrays into one arrayList
    		ex:
    			arr1 = {"A", "B", "C"};
    			arr2 = {"D", "E", "F", "G"};
    			list ==> {"A", "B", "C", "D", "E", "F", "G"}

    			// FOR EACH LOOP

         */

        String [] arr3 =  {"A", "B", "C"};

        String [] arr4 = {"D", "E", "F", "G"};

        ArrayList<String> list2 = new ArrayList<String>();

        for(String each : arr3){

            list2.add(each);

        }

        for(String each : arr4){

            list2.add(each);
        }

        System.out.println(list2);

    }
}
