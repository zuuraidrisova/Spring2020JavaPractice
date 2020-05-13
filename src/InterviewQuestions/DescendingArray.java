package InterviewQuestions;

import java.util.Arrays;

public class DescendingArray {

    /*
    Write a return method that can sort an int array in descending order
    without using the sort method of the Arrays class

Ex:  int[] arr = {10,20,7, 8, 90};

                 arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};
     */

    public static void main(String[] args) {

        int[] arr = {10,20,7, 8, 90};

        int [] k = sortDescending(arr);

        System.out.println(Arrays.toString(k));

        int[] arr2 = {10,20,7, 8, 90};

        int [] d = sortDescending2(arr2);

        System.out.println(Arrays.toString(d));

    }
    public static int [] sortDescending(int [] arr){

        Arrays.sort(arr);

        int[] descending = new int[arr.length];

        int k = 0;

        for(int i = arr.length-1; i >= 0; i--){

            descending[k] = arr[i];

            k++;

        }

        return descending;

    }

    public static int [] sortDescending2(int [] arr){

        int [] descending = new int[arr.length];

        int k = 0;

        for(int i = arr.length-1; i >= 0; i--){

            descending[k] = arr[i];
            k++;

        }

        return descending;

    }
}
