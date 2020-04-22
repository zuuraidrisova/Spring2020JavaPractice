package Replit_Practices;

import java.util.Scanner;

public class FactorialForLoopReplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        In mathematics, the factorial of a positive integer n,
         denoted by n!, is the product of all positive integers less
          than or equal to n.  Calculate factorial and output result to the console.
Example:
input: 5
output: 120
         */

        System.out.println("Please enter a number: ");
        int num = scan.nextInt();

        int sum = 1;

        for(int i = 1; i <= num; i++){

            sum =sum * i;

        }

        System.out.println(sum);



    }
}
