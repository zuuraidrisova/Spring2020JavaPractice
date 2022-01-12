package reviewPracticing;

import java.util.Scanner;

public class Arrays_Tasks {

    public static void main(String[] args) {

        /*
        Warmup tasks:
1. write a program that can find the maximum number from any given
int array
NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE
CLASS
2. write a program that can find the minimum number from any given
int array
NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE
CLASS
         */


       int maxNumber = Integer.MIN_VALUE;

       int arr[] = {23,5,1,4,2,555,8887};

       for (int i = 0; i < arr.length; i++){

           if (maxNumber < arr[i]){

               maxNumber = arr[i];

           }
       }

        System.out.println("maxNumber = " + maxNumber);


       int arr2 [] = {23,5,1,4,2,555,8887};

       int minNumber = Integer.MAX_VALUE;

       for (int j = 0;  j <  arr2.length; j++){

           if (minNumber > arr2[j]){

               minNumber = arr2[j];

           }
       }

        System.out.println("minNumber = " + minNumber);

        //array of student with length of 5, using Scanner

        Scanner scan = new Scanner(System.in);

        String names [] = new String[5];

        for (int i = 0; i < 5; i ++){

            System.out.println("Enter your friend's name: ");

            names [i] = scan.next();

        }

        for (int i = 1; i <= names.length-1; i++){

            System.out.println(names[i-1]);
        }
    }


}
