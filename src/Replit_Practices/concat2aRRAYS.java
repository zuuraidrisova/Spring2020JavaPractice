package Replit_Practices;

import java.util.Arrays;

public class concat2aRRAYS {

    /*
    Write a return method that can concate two arrays
     */

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8,9};

        int [] con = concat2Arrays(arr1,arr2);

        System.out.println(Arrays.toString(con));
    }

    public static int [] concat2Arrays(int [] arr, int [] arr1){

        int newArray [] = new int[arr.length + arr1.length];

        for(int i = 0; i < arr.length; i++){

            newArray[i] = arr[i];
        }

        for(int i = 0; i < arr1.length; i++){

            newArray[i + arr.length] = arr1[i];
        }

        return newArray;
    }
}
