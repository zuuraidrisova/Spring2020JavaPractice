package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class UniqueArrayList {

    public static void main(String[] args) {

       /*
       write a program that can find the unique elements from an ArrayList of integers
       and stores into another list called uniques

    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}
        */

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1); list.add(1); list.add(2); list.add(3); list.add(3);list.add(4); list.add(5);

        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<Integer>();

        for(int i = 0; i < list.size(); i++){

            int count = 0;

            for(int j = 0; j < list.size(); j++){

                if(list.get(i) == list.get(j)){

                    count++;
                }
            }
            if(count == 1) {

                list2.add(list.get(i));
            }

        }

        System.out.println(list2);

    }
}
