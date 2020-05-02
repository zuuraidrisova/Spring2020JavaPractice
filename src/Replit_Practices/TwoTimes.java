package Replit_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoTimes {

    public static void main(String[] args) {

        /*
        Create a method that:

is called twoTimes
returns a new ArrayList of Integers
takes in a single parameter - an ArrayList of Integers

This method should create a new ArrayList of Integers that
contains every value of the ArrayList parameter repeated twice.

For example, if the parameter is
(1,5,3,7)
The method should return a new ArrayList of Integers with
(1,1,5,5,3,3,7,7)
         */

        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1,5,3,7));

        ArrayList<Integer> repeated = twoTimes(list);

        System.out.println(repeated);

    }

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> list){

       ArrayList<Integer> repeated = new ArrayList<>();


       for(int i = 0; i < list.size(); i++){

           repeated.add(list.get(i));
           repeated.add(list.get(i));
       }


       return repeated;


    }
}
