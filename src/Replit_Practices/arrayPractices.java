package Replit_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayPractices {

    public static void main(String[] args) {


        int[] a = {1,2,3,4,5};

       mystery(a);

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(4,-6,3,-8,0,4,3));

        ArrayList<Integer> returned = appendPosSum(list);

        System.out.println(returned);

       int [] [] array =  {
            {1,1,2}, //sum = 4
            {3,1,2}, //sum = 6
            {3,5,3}, //sum = 11
            {0,1,2}  //sum = 3
        };


       int [] k = rowSums(array);

        System.out.println(Arrays.toString(k));

        int [] d = {1,2,3,4};

        int [] w = do_switch(d);

        System.out.println(Arrays.toString(w));



    }

     /*
    Complete the mystery method so that it takes in an integer array as
     a parameter, and then modifies each element based on whether it's even
      or odd.  If the number is even, divide it by 2.  If it's odd, multiply it by 10.
     */


    public static void mystery(int[] array){

       for(int i = 0; i <  array.length; i++){

           if(array[i] % 2 == 0){

               array[i]  = array[i] / 2;

           }else{

               array[i] *= 10;

           }
       }

        System.out.println(Arrays.toString(array));

    }
/*
    For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3),
    the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum
    of (4,3,4,3).  The original ArrayList should remain unchanged.

 */

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){

        ArrayList<Integer> returned = new ArrayList<>();

        int sum =0;

        for(int i = 0; i < list.size(); i++){

            if(list.get(i) >= 1){

                returned.add(list.get(i));

                sum += list.get(i);
            }

        }
        returned.add(sum);

        return returned;

    }

     /*
      Complete the method so that it takes in a 2-D array and returns the sums
      of the rows as an integer array.

For example, the if we run rowSums for the following 2D array:
{
  {1,1,2}, //sum = 4
  {3,1,2}, //sum = 6
  {3,5,3}, //sum = 11
  {0,1,2}  //sum = 3
}


Then we should get the following array back:
{4,6,11,3}
     */
     public static int[] rowSums(int[][] nums){

         int [] arr = new int [nums.length];

         for(int i = 0; i < nums.length; i++){

             for(int j = 0; j < nums[i].length; j++){

                 arr[i] += nums[i][j];

             }
         }


         return arr;
     }

      /*
    Switch the last element in an array with the first and return the array.

example:

do_switch([1,2,3,4])
returns:[[4,2,3,1]

do_switch([7,2,3,5])
returns:[5,2,3,7]

     */

    public static int[] do_switch(int[] i){

        int b = i[i.length-1];

        i[i.length-1] = i[0];
        i[0] = b;

        return i;
    }

}
