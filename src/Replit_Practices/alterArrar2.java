package Replit_Practices;

import java.util.Arrays;

public class alterArrar2 {
     /*
    Complete the mystery method so that it takes in an integer array as
     a parameter, and then modifies each element based on whether it's even
      or odd.  If the number is even, divide it by 2.  If it's odd, multiply it by 10.
     */
     public static void main(String[] args) {

         int [] arr = {1,3,6,9,12};

        int [] k =  mystery(arr);

         System.out.println(Arrays.toString(k));
     }

     public static int [] mystery(int [] arr){

         int [] arr2 = new int[arr.length];

         for(int i = 0; i < arr.length; i++){

             if(arr[i] % 2 == 0){

                 arr2[i] = arr[i] / 2;
             }else{

                 arr2[i] = arr[i] * 10;
             }
         }

         return arr2;
     }
}
