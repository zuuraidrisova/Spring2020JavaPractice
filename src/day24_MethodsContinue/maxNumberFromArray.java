package day24_MethodsContinue;

import java.util.Arrays;

public class maxNumberFromArray {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7,8,9,10};

        maxNumber(array);
        minNumber(array);
    }
    //create a function that prints maximum number from an array

    public static void maxNumber(int arr []){

        //simply by sorting the array and printing last index
        Arrays.sort(arr);

        System.out.println(arr [arr.length-1]);

        // another way finding max number from an array using for loop
        int max = arr[0];

        for(int i = 0; i < arr.length; i++){

            if(max < arr[i]){

               max = arr[i];
            }

        }
        System.out.println(max);
    }

    public static void minNumber(int [] arr){

        Arrays.sort(arr);

        System.out.println(arr[0]);

        //min number from array using for loop

        int min = arr[0];

        for(int i = 0; i < arr.length; i++){

            if(min > arr[i]){

                min = arr[i];
            }
        }

        System.out.println(min);
    }
}
