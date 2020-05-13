package Replit_Practices;

import java.util.Arrays;


public class switchElements {
    /*
    Switch the last element in an array with the first and return the array.

example:

do_switch([1,2,3,4])
returns:[[4,2,3,1]

do_switch([7,2,3,5])
returns:[5,2,3,7]

     */
    public static void main(String[] args) {

        int [] arr = {1,2,3,4};

        int [] arr2 = do_switch(arr);

        System.out.println(Arrays.toString(arr2));
    }

    public static int[] do_switch(int[] i){

        int a = i[0];
       i[0] = i.length;
       i[i.length-1] = a;

       return i;

    }
}
