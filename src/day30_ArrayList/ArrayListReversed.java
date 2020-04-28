package day30_ArrayList;

import java.util.ArrayList;

public class ArrayListReversed {

    public static void main(String[] args) {


        /*
        write a program that can print the list of integers in reversed order
		ex:
			list=> {1,2,3,4,5}
			output: 5 4 3 2 1
         */

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < 5; i ++){

         //   list.add(i);// just i will return this [0, 1, 2, 3, 4], but we need 1 2 3 4 5
          list.add(i+1);
        }

        System.out.println(list);

        ArrayList<Integer> reversed = new ArrayList<Integer>();


        for(int i = list.size()-1; i >= 0; i--){

           int num =  list.get(i);

            System.out.print(num+" ");

            reversed.add(list.get(i));

        }

        System.out.println();

        System.out.println(reversed);



    }
}
