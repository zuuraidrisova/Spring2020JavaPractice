package day30_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerArrays {

    public static void main(String[] args) {


        //thru Scanner assign int values to array of int and sort Descending order


        Scanner scan = new Scanner(System.in);

        int [] arr = new int [7];

        for(int i = 0; i <arr.length; i++) {

            System.out.println("Please enter numbers " +(i+1));
            arr[i] = scan.nextInt();

        }

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        int [] sortDescending = new int [arr.length];

        int k = 0;

        for(int i = arr.length-1; i >= 0; i--){

            sortDescending[k] = arr[i];

            k++;
        }


        System.out.println(Arrays.toString(sortDescending));


        for(int i = 0; i < sortDescending.length; i++){

            if(sortDescending[i] % 2 != 0){

                continue;
            }

            System.out.print(sortDescending[i]+" ");

        }

        System.out.println();

    }
}
