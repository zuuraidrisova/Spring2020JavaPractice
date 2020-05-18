package Replit_Practices;

import java.util.Scanner;

public class FactorialNumberReplit {
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

        int n = scan.nextInt();

        long sum = 1;

        while( n >= 1){

            sum = sum * n;

            n--;

        }

        System.out.println(sum);





    }
}
