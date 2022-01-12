package day24_MethodsContinue;

import java.util.Arrays;

public class DescendingArrayMethod {

    public static void main(String[] args) {
        /*
         create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]
         */

        int [] array = {10,30,20,40,50,80,90,70,100};

        printArrayDescending(array);

    }
    public static void printArrayDescending(int [] arr){

        Arrays.sort(arr);

        int [] arr2 = new int [arr.length];

        int k = 0;

        for(int i = arr.length-1; i >= 0; i--){

            arr2[k] = arr[i];

              k++;
        }
        System.out.println(Arrays.toString(arr2));
    }


}
