package OfficeHours.Practice_04_22_2020;

import java.util.Arrays;

public class ArrayMethods {

    //write a return method that can return second max number from an array
    public static void main(String[] args) {

        int [] arr = {100,40,500,50,30, 10,-5,-100};

        int secondMax = secondMax(arr);

        System.out.println(secondMax);

        int secondMin = secondMin(arr);

        System.out.println(secondMin);
    }

    public static int secondMax(int [] arr){

        Arrays.sort(arr);//sorting array in ascending order
        int lastIndex = arr.length-1;//finding out the last index
        int secondLastIndex = lastIndex-1;//finding the second max number

        return arr[secondLastIndex];
    }

    public static int secondMin(int [] arr){

        Arrays.sort(arr);


        return arr[1];
    }
}
