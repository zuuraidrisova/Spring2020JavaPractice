package day21_MultiDimensionalArray;

import java.text.DecimalFormat;

public class AverageNumberArray {
    public static void main(String[] args) {
        /*
         write a program that can return the average number from an array of integers
			ex:
				[1,2,3]
				average: 2
				[10, 15, 5, 6]
				average: 9
				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10
         */
        DecimalFormat dc = new DecimalFormat("0.00");


        int [] arr = {10,15,5,6};

        int sum = 0;
        int len = arr.length;//total number of elements

        for(int i = 0;  i < len; i++){

            sum += arr[i];

        }


        System.out.println(dc.format(sum/len));



        int arr1 [] = {1,2,3};

        int sum1 = 0;
        int len1 = arr1.length;

        for(int i = 0; i < len1; i++){

           sum1 += arr1[i];

        }

        double average = sum1/len1;
        System.out.println(dc.format(average));


        int arr2 [] = {4,5,6,7,8,10,20,30,0};

        int sum2 = 0;
        int len2 = arr2.length;

        for(int i = 0; i< len2; i++){

            sum2 += arr2[i];
        }

        System.out.println(sum2/len2);
    }
}
