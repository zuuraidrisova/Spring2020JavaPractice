package OfficeHours_Saim.day5_ArrayArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class sumNumbers {
    /*
1) Create a method that will accept an int array and return the sum of
     all the numbers in the given array
2) Overload the method to accept an ArrayList of integers and return the
    sum of all the numbers in the given ArrayList
     */

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6};

       int sum =  sumNumbers(array);

        System.out.println(sum);

        System.out.println("=====================================");

        ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        int sum2 = sumNumbers(list);

        System.out.println(sum2);

    }

    public static int sumNumbers(int [] array){

        int sum = 0;

        for(int i = 0; i < array.length; i++){

            sum += array[i];
        }

        return sum;
    }


    public static int sumNumbers(ArrayList<Integer> list){

        int sum = 0;

        for(int i = 0; i < list.size(); i++){

            sum += list.get(i);
        }

        return sum;
    }
}
