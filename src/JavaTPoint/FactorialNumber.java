package JavaTPoint;

public class FactorialNumber {
    public static void main(String[] args) {
       /*
       Factorial of n is the product of all positive descending integers.
        Factorial of n is denoted by n!. For example:
        4! = 4*3*2*1 = 24
        5! = 5*4*3*2*1 = 120

        */

        int factorial = 1;

       for(int i = 1; i <= 5; i++){

           factorial = factorial*i;

       }
        System.out.println(factorial);


    }
}
