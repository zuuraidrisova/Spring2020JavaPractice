package Replit_Practices;

public class FibonacciNumbers {
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
    public static void fib(int num){
        //WRITE YOUR CODE HERE

        int result = 0;
        int n = 0;
        int m = 1;

        for(int i = 1; i < num; i++){

            result = n + m;

            n = m;

            m = result;

        }

        System.out.println(result);
        
    }
}
