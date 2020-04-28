package day27_DateTime;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerArrayDescending {
    /*
    Take 5 integer inputs from user and store them in an array.
     Now, copy all the elements
    in an another array but in reverse order.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] arr = new int [5];

        for(int i = 0; i < 5; i++ ){

            System.out.println("Enter a number: "+(i+1));

            arr[i] = scan.nextInt();

        }
        System.out.println(Arrays.toString(arr));

        int reverseArray [] = new int[arr.length];

        int j = 0;

        for(int i = arr.length-1; i >= 0; i--){

            reverseArray[j] = arr[i];
            j++;

        }

        System.out.println(Arrays.toString(reverseArray));

    }
}
