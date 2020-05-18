package Replit_Practices;

import java.util.Arrays;

public class add2array3 {
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

            int [] arr = {1,5,88,3};

            int r = 9;

            int [] added = add_to_r(arr,r);

            System.out.println(Arrays.toString(added));
        }

        public static int [] add_to_r(int [] arr, int a){

            int newArray [] = new int[arr.length + 1];

            for(int i = 0; i < arr.length; i++){

                newArray[i] = arr[i];
            }

            newArray[newArray.length-1] = a;

            return newArray;
        }
}
