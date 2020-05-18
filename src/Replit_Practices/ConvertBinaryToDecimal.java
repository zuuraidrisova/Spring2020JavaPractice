package Replit_Practices;

import java.util.Scanner;

public class ConvertBinaryToDecimal {

    public static void main(String[] args) {

        /*
        Binary number is a number expressed in the base-2 numeral system
         or binary numeral system, which uses only two symbols: typically 0
         (zero) and 1 (one). Each digit is referred to as a bit.





Given an array binary with 8 integers (0s or 1s), write java program
to calculate decimal value and print out to console. Feel free to use
 additional arrays or formulas.

Example:
binary -> [0, 0, 0, 0, 0, 0, 1, 1]
print 3

binary -> [0, 0, 1, 0, 0, 0, 1, 1]
print 35

binary -> [1, 1, 1, 1, 1, 1, 1, 1]
print 255
         */

        Scanner input = new Scanner(System.in);

        int[] binary = new int[8];

        for(int i =0; i < binary.length; i++) {

            binary[i] = input.nextInt();
        }

        int [] binary2 = {128, 64,32,16,8,4,2,1};

        int sum = 0;

        for(int i = 0; i < binary.length; i++){

            if(binary[i] == 1){

                sum += binary2[i];

            }else{

                sum += binary[i];
            }
        }


        System.out.println(sum);

    }
}
