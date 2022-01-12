package day22_ArraysLoopsRecap;
import java.util.Scanner;
import java.util.Arrays;

public class NumbersArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

         /*
           1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to print out all the even numbers.
                MUst use continue statement
         */

        int [] arr = new int [100];

        for(int i =0; i < arr.length; i++ ){

            arr[i] = i + 1;
        }

        System.out.println(Arrays.toString(arr));

        for(int each : arr){

            if(each % 2 != 0){
                continue;
            }
            System.out.print(each+" ");
        }

        System.out.println();

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


        String [] arr2 = new String [5];

        for(int i = 0; i < 5; i++){

            System.out.println("Please enter a word: ");

            arr2 [i] = scan.next();


        }
        System.out.println(Arrays.toString(arr2));

        for(String each : arr2){

            System.out.println(each.substring(0,3));
        }


    }
}
