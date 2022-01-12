package day22_ArraysLoopsRecap;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        /*
        write a program that sort the array in descending order
         */

        int [] arr = {1,9,4,2,7,5,0,10};

        Arrays.sort(arr);//sort array in ascending order

        System.out.println(Arrays.toString(arr));

        int j = 0;

        int [] arrDescending = new int [arr.length];

        for(int i = arr.length-1; i >= 0; i--){

            arrDescending [j] = arr[i];

            j++;
        }

        System.out.println(Arrays.toString(arrDescending));


    }
}
