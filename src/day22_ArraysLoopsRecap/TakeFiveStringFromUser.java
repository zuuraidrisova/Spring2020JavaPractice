package day22_ArraysLoopsRecap;

import java.util.Arrays;
import java.util.Scanner;

public class TakeFiveStringFromUser {

    public static void main(String[] args) {

        /*
         1.Write a program that will take five Strings and save them into an array
          called arr.
        2. use for each loop to print out the first three letter of each element
         of arr, one per line. You can assume that every element of arr is at least
         3 letters long.
            Example:
                arr -> ["apple", "banana"]
                prints: app
                        ban

                        Arrays ==> Scanner ==> For loop ==> for each ==> substring

         */
        Scanner scan = new Scanner(System.in);

        String [] arr = new String [5];

        for(int i = 0; i < arr.length; i++){

            System.out.println("Please enter a word: ");
            arr [i] = scan.next();
        }

        System.out.println(Arrays.toString(arr));

        for(String each : arr){

            System.out.println(each.substring(0,3));
        }

    }
}
