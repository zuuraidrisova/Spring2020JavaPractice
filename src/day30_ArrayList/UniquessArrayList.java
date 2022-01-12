package day30_ArrayList;

import java.util.ArrayList;

public class UniquessArrayList {

    public static void main(String[] args) {

        /*

        write a program that can print out the unique elements from an ArrayList of Integers
		   HINT: store all the unique elements of array into a list of integers
		   Ex: array==> {1,1,2,3,3,4,5}
		   	   output: {2,4,5}

         */

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);

        for(int i = 0; i < list.size(); i++){

            int count = 0;

            for(int j = 0; j < list.size(); j++){

                if(list.get(i) == list.get(j)){

                    count++;

                }

            }

            if(count == 1){

                System.out.println(list.get(i));
            }


        }


    }
}
