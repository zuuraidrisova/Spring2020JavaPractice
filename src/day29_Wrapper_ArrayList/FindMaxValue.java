package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class FindMaxValue {

    public static void main(String[] args) {

      /*
        String[] arr = {"1","2.5", "3", "3.5", "4.5"}
        find the maximum and minimum numbers
        NOTE: Do not use sort method

       */

      String[] arr = {"1","2.5", "3", "3.5", "4.5"};

      double max = Double.MIN_VALUE;

      for(String each : arr){

          double num = Double.parseDouble(each);

         if(num > max){

             max =num;
         }

      }

        System.out.println(max);

        System.out.println("=====================");

        /*
         String[] arr = {"1","2.5", "3", "3.5", "4.5"}
         find the maximum and minimum numbers
         use sort method
         */

        String[] arr2 = {"1","2.5", "3", "3.5", "4.5"};

        double [] arr3 = new double[arr2.length];

        for(int i = 0; i < arr2.length; i++){

            arr3[i] = Double.parseDouble(arr2[i]);
        }

        System.out.println(Arrays.toString(arr3));

        Arrays.sort(arr3);

        System.out.println(arr3[arr3.length-1]);


        System.out.println("======================");

        double [] arr1 = {1.2, 2.4, 6.7, 3.3, 9.0};

        double maxNum = Double.MIN_VALUE;

       for(double each : arr1){

           if(each > maxNum){

               maxNum = each;
           }
       }

        System.out.println(maxNum);

    }
}
