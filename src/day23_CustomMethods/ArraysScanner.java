package day23_CustomMethods;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysScanner {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        int [] arr = new int [10];

        for(int i = 0; i < 10; i++ ){

            System.out.println("Please enter a number: ");

            arr [i] = scan.nextInt();
        }


        System.out.println(Arrays.toString(arr));

    }


}
