package Replit_Practices;

import java.util.Arrays;

import static java.util.Arrays.*;

public class IsSorted {
    public static void main(String[] args) {
        /*
this is a sorted collection (in this case array):

7,8,9,10

this is an unsorted collection:

5,4,9,8,7,3

sorted in this case means smallest number to biggest.
isSort gets an array and returns true if its sorted.

for example:
isSort([2,3,5,4,9]);
returns: false

isSort([1,2,3]);
returns: true

isSort([7,8,9]);
returns: true.

         */

        int [] num = {1,2,3,4};

        boolean a = isSort(num);

        System.out.println(a);
    }
    public static boolean isSort(int[] nums) {

      String a = Arrays.toString(nums);

      Arrays.sort(nums);

      String b = Arrays.toString(nums);

      if(a.equals(b)){

          return true;

      }else{

          return false;
      }


    }
}
