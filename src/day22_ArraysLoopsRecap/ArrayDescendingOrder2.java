package day22_ArraysLoopsRecap;

import java.util.Arrays;

public class ArrayDescendingOrder2 {
    public static void main(String[] args) {

         //array in descending order

        int [] arr = {1,2,3,4,5,6,7,8,9};

        Arrays.sort(arr);

        int [] arr2 = new int [arr.length];
        int j = 0;

        for(int i = arr.length-1; i >= 0; i--){

            arr2 [j] = arr[i];

            j++;

        }

        System.out.println(Arrays.toString(arr2));
    }
}
