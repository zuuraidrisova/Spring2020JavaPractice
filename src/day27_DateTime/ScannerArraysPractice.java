package day27_DateTime;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerArraysPractice {

    /*
    Take 10 integer inputs from user and store them in an array.
     Now, copy all the elements
    in an another array but in reverse order.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] arr = new int [10];

       for(int i = 0; i < arr.length; i++){

           System.out.println("Enter a number: "+(i+1));

           arr[i] = scan.nextInt();
       }

        System.out.println(Arrays.toString(arr));

       int [] arr1 = new int[arr.length];

       int j = 0;

       for(int i = arr.length-1; i >= 0; i--){

           arr1[j] = arr[i];

           j++;
       }

        System.out.println(Arrays.toString(arr1));

    }
}
