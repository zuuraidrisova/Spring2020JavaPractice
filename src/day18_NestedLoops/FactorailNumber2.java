package day18_NestedLoops;

import java.util.Scanner;

public class FactorailNumber2 {

    public static void main(String[] args) {

        /*
        write a program that can return the factorial number of any given number
			Ex:
				input: 5
				output: 120
			because:
				5! = 5 * 4 * 3 * 2* 1 = 120
         */

        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a number: ");

        int num1 = scan.nextInt();

        int result = 1;

        while(num1 >= 1){

            result = result * num1;

            num1--;
        }

        System.out.println(result);



    }
}
