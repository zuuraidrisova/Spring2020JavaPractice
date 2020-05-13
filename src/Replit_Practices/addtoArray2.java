package Replit_Practices;

import java.util.Arrays;

public class addtoArray2 {
      /*
    add_to_r is a method that gets an array and a number.

the method creates a new array bigger by one then (int[] r).
It populates the new array with the old ones(r) values.
and finally in the last position adds the number (int n) to it.

for example:

method input: add_to_r(new int{1,5,77,8}  ,2)

outputs (int array):
[1, 5, 77, 8, 2]
     */

    public static void main(String[] args) {

        int a [] = {1,5,77,8};
        int b = 2;

        int c []  = new int[a.length+1];

        for(int i = 0; i < a.length; i++){

            c[i] = a[i];
        }

        c[c.length-1] = b;

        System.out.println(Arrays.toString(c));
    }
}
