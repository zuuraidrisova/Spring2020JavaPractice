package Replit_Practices;

import java.util.Scanner;

public class factorialNumber3 {
      /*
        In mathematics, the factorial of a positive integer n,
         denoted by n!, is the product of all positive integers less
          than or equal to n.  Calculate factorial and output result to the console.
Example:
input: 5
output: 120
         */
      public static void main(String[] args) {


          Scanner scan = new Scanner(System.in);

          int num = scan.nextInt();

          int result = 1;

          for(int i = 1; i <= num; i++){

              result = result * i;

          }

          System.out.println(result);
      }
}
