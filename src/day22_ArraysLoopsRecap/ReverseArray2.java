package day22_ArraysLoopsRecap;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {

//reverse an array

        int [] arr = {7,1,4,3,2,5,8,6,9};


        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));


        int [] revArr = new int [arr.length];

      /*     k               i
        int [0] revArr = arr[4];
        int [1] revArr = arr[3];
        int [2] revArr = arr[2];
        int [3] revArr = arr[1];
        int [4] revArr = arr[0];

       */

        int k = 0;

        for(int i = arr.length-1; i >= 0; i-- ){

            revArr[k] = arr[i];
            k++;
        }

        System.out.println(Arrays.toString(revArr));
    }
}
