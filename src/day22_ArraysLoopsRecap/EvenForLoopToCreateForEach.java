package day22_ArraysLoopsRecap;

import java.util.Arrays;

public class EvenForLoopToCreateForEach {

    public static void main(String[] args) {
        /*
           1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to print out all the even numbers.
                MUst use continue statement
         */

        int [] numbers = new int [200]; //index 0~999//this will store all 100 numbers

        for(int i = 0; i < numbers.length; i++){//to run numbers from 1 to 100

            numbers [i] = i+1;//assigning numbers to an array
        }
        System.out.println(Arrays.toString(numbers));//prints all numbers as a string


        for(int each : numbers){//for each element in numbers array

            if(each % 2 != 0){//if they are even

                continue;

            }
            System.out.print(each+" ");//print
        }




    }
}
