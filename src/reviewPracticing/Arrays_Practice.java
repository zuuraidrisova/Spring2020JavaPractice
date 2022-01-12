package reviewPracticing;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Practice {

    public static void main(String[] args) {

        String [] month = {"January","February", "March", "April","May","June",
                "July","August","September","October","November","December"};


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = scan.nextInt();

        String result = month[num-1];

        System.out.println("result = " + result);

        scan.close();

        //array in ascending order

        int [] arr = {3,100,-2,98,5,76};

        System.out.println(Arrays.toString(arr));

        //array in descending order

        for (int i = arr.length-1; i >= 0; i--){

            System.out.print(arr[i]+" ");
        }

        System.out.println();

        /*
            write a program that can combine two arrays of any lengths, and
    return the third array
    arr1 ==> [1,2,3]
    arr2 ==> [4,5,6,7];
    arr3 ==> [1,2,3,4,5,6,7]
         */

        int [] arr1 = {1,2,3};

        int [] arr2 = {4,5,6,7};

        int [] arr3 = new int[arr1.length  + arr2.length];


        for (int i = 0; i <= arr1.length-1; i++){

            arr3[i] = arr1[i];

        }

        System.out.println(Arrays.toString(arr3));

        for (int j = 0;  j <= arr2.length-1; j++){

            arr3[arr1.length + j] = arr2[j];
        }


        System.out.println(Arrays.toString(arr3));


    }
}
