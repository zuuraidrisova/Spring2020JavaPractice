package OfficeHours.Practice_04_15_2020;
import java.util.Arrays;
public class ArraysUtility {
    public static void main(String[] args) {
       /*

       we need to import  Arrays class from java.util

       Arrays.sort() : sort arrays in ascending order
       Arrays.equals(array1, array2) : compares two arrays , checks if they are equal
       Arrays.toString() :  converts single dimensional array to string adn returns as a string


       Arrays.deepToString(): converts multi-dimensional array to string and prints as a string
        */

        int [] arr = {9,1,10, 56,6,3};
        Arrays.sort(arr);//sorts array in ascending order
        System.out.println(Arrays.toString(arr));//prints array as a string


        System.out.println("=====================");

        int [] salaries = {1000000, 1200000, 900000,870000,35000};

        int length = salaries.length;//5

        int lastIndex = length-1;//4

        Arrays.sort(salaries);

        System.out.println(Arrays.toString(salaries));//in ascending order

        System.out.println("maximum salary is: "+ salaries[lastIndex]);
        System.out.println("minimum salary is: "+salaries[0]);

        int sum = 0;
        int average = 0;
        int count = 0;


        for(int i = 0; i <= lastIndex; i++){

            sum += salaries[i];

            count++;
        }

        average = sum/count;

        System.out.println(sum);
        System.out.println("Median salary is: "+average);


        System.out.println("================================");


        int [] arr1 = {1,2,3};
        int [] arr2 = {1,2,3};

        System.out.println( Arrays.equals(arr1,arr2) );//true, checks values at each index

        int [] arr3 = {3,2,1};

        System.out.println(Arrays.equals(arr2,arr3));//false

        Arrays.sort(arr3);

        System.out.println(Arrays.equals(arr2,arr3));//true bcs we sorted arr3




    }
}
