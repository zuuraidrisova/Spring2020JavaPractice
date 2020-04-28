package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class ReverseArrayList {

    public static void main(String[] args) {

        /*

        write a program that can print the list of integers in reversed order
		ex:
			list=> {1,2,3,4,5}
			output: 5 4 3 2 1

         */

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < 5; i++){

            list.add(i+1);
        }

        System.out.println(list);


        ArrayList<Integer> reversed = new ArrayList<Integer>();

        for(int i = list.size(); i >= 1; i--){

            reversed.add(i);
        }

        System.out.println(reversed);



    }
}
