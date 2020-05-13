package InterviewQuestions;

import java.util.Arrays;

public class concatTwoArrays {
    /*
    Write a return method that can concate two arrays
     */
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8,9};

        int [] con = concateArrays(arr1,arr2);
        int [] concated = concate2Arrays(arr1,arr2);

        System.out.println(Arrays.toString(con));
        System.out.println(Arrays.toString(concated));
    }

    public static int [] concateArrays(int [] arr1, int [] arr2){

        int [] newArray = new int[arr1.length + arr2.length];

        for(int i = 0; i < arr1.length; i++){

            newArray[i] = arr1[i];
        }

        for(int j = 0; j < arr2.length; j++){

            newArray[arr1.length + j] = arr2[j];
        }

        return newArray;


    }

     /*
    Write a return method that can concate two arrays second time solution

     */

     public static int []  concate2Arrays(int [] arr1, int [] arr2){

         int [] newArray = new int[arr1.length+arr2.length];

         for(int i = 0;i < arr1.length; i++){

             newArray[i] = arr1[i];

         }

         for(int j = 0; j < arr2.length; j++){

             newArray[arr1.length + j] = arr2[j];
         }

         return newArray;
     }



}
