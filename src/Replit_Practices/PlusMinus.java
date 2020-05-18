package Replit_Practices;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {

        /*
        Create a method called plus_minus that gets an array of ints (int[]),
         it outputs how many negative , positive and zero numbers are in the array.

for example:

plus_minus (new int[]{1,2,55,-9,-2,0});

will output:
positives:3, negatives:2, zeros:1
         */

        Scanner inp = new Scanner(System.in);

        System.out.println("Please enter the size of your array: ");
        int size = inp.nextInt();

        System.out.println("Please enter numbers: ");
        int[] arr = new int[size];

        for(int i=0 ;i<=size-1;i++) {
            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }//end main


    public  static  void plus_minus(int [] arr){

        int countPositive = 0;
        int countNegative = 0;
        int countZeros = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] < 0){

                countNegative++;

            }else if(arr [i] > 0){

                countPositive++;

            }else if(arr [i] == 0){

                countZeros++;
            }
        }
        System.out.println("positives:"+countPositive);
        System.out.println("negatives:"+countNegative);
        System.out.println("zeros:"+countZeros);
    }
}
