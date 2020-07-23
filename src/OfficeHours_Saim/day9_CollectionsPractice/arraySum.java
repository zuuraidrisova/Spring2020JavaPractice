package OfficeHours_Saim.day9_CollectionsPractice;

import java.util.Arrays;

public class arraySum {
    /*
    Write a Java program to sum values of an array
     */

    public static void main(String[] args) {

        int arr [] = {1,4,6,2,8,9};

        int sum = sumOfArray(arr);

        System.out.println(sum);

        int average = averageValue(arr);

        System.out.println(average);

        int [] reverse = reverseArray(arr);

        System.out.println(Arrays.toString(reverse));
    }

    public static int sumOfArray(int [] arr){

        int sum = 0;

        for(int i =0; i < arr.length; i++){

            sum += arr[i];
        }

        return sum;
    }

    /*
    Write a Java program to calculate the average value of array elements.
     */

    public static int averageValue(int arr []){

        int sum = 0;
        int count = 0;

        for(int i = 0; i < arr.length; i++){

            sum += arr[i];

            count++;

        }

        return sum / count;
    }

    /*
    Write a Java program to reverse an array of integer values
     */

    public static int [] reverseArray(int [] arr){

        int [] reversed = new int [arr.length];
        int j = 0;

        for(int i = arr.length-1; i >= 0; i--){

            reversed[j] = arr[i];

            j++;
        }
        return reversed;
    }
}
