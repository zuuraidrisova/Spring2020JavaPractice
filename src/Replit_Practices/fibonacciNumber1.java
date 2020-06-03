package Replit_Practices;

public class fibonacciNumber1 {

      /*
Complete a method fib() that will compute Fibonacci numbers
In Fibonacci series, next number is the sum of previous two numbers
 for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……...
 The first two numbers of Fibonacci series are 0 and 1.
Given a number num, print n-th Fibonacci Number.

Input  : 2
Output : 1

Input  : 9
Output : 34

     */

    public static void main(String[] args) {

        int a = fib(3);

        System.out.println(a);

        int num = factorial(5);

        System.out.println(num);
    }
      public static int fib(int num){

          int result = 0;
          int a = 0;
          int b = 1;

          for(int i = 1; i < num; i++){

              result = a + b;

              a = b;

              b = result;
          }

         return result;
      }
      public static int factorial(int num){

        int result = 1;

        for(int i = 1; i <= num; i++){

            result = result * i;
        }

        return result;
      }
}
