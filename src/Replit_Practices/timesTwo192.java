package Replit_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class timesTwo192 {
    public static void main(String[] args) {

        /*
        Create a method that:
is called timesTwo
returns nothing
takes in a single parameter - an ArrayList of Integers called nums

This method should take the ArrayList parameter and multiply every value by two.
         */

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,3,45,6,1));

        timesTwo(list);




    }

    public  static void timesTwo(ArrayList<Integer> nums){

        for(int i = 0; i < nums.size(); i++){

            int total = nums.get(i) * 2;

            System.out.println(total);

        }



    }
}
