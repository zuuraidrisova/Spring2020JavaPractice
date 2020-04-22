package day24_MethodsContinue;

import java.util.Arrays;

public class MaxMinNumberFromArray {
    public static void main(String[] args) {
        /*
         create a function that can print the maximum number from any given array
         */
        int [] array = {276,287,192,19,2,26,87};

        MaxNumArray(array);
        MinNumberFromArray(array);
    }
    public static void MaxNumArray(int [] arr){

        Arrays.sort(arr);

        System.out.println(arr[arr.length-1]);

    }
    public static void MinNumberFromArray(int [] arr1){

        Arrays.sort(arr1);

        System.out.println(arr1[0]);

    }
}
