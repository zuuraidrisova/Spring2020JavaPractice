package Replit_Practices;

import java.util.Arrays;

public class ReverseArrays {
    /*
    Write the definition of a method reverse, whose parameter is an
    array of Strings. The method reverses the elements of the array.
     The method returns an array of strings in the reversed order.

Example:
input: ["apple", "pear"]
output: ["pear", "apple"]
     */

    public static void main(String[] args) {


        String[] arr = {"apple", "pear"};

        String [] arr1 = new String [arr.length];

        int j = 0;

        for(int i = arr.length-1; i >= 0 ; i-- ){

            arr1[j] = arr[i];

            j++;
        }

        String [] arr2 = reverse(arr);

        System.out.println(Arrays.toString(arr2));
         System.out.println(Arrays.toString(arr1));

    }


    public static String[] reverse(String[] arr) {

        String [] arr1 = new String [arr.length];

        int j = 0;

        for(int i = arr.length-1; i >= 0; i--){

            arr1[j] = arr[i];

            j++;
        }

        return arr1;
    }
}