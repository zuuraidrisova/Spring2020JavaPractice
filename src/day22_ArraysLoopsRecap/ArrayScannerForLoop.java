package day22_ArraysLoopsRecap;

import java.util.Scanner;

public class ArrayScannerForLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String [] arr = new String [5];

        for(int i = 0; i < 5; i++){

            System.out.println("Please enter a word: ");
            arr [i] = scan.next();

        }

        for(String each : arr){

            System.out.println(each.substring(0,3));
        }




    }
}
