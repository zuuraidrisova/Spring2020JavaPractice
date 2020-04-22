package JavaTPoint;

public class FibonacciNumber {
    public static void main(String[] args) {
/*
In fibonacci series, next number is the sum of previous two numbers for example
 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series
 are 0 and 1.
 */

        int num1 = 0;
        int num2 = 1;
        int num3, count = 10;

        System.out.print(num1+ " "+num2);//prints 0 and 1

        for(int i = 2; i < count; i++ ){//loop starts from 2 bcs 0 and 1 already printed

            num3 = num1 + num2;
            System.out.print(" "+num3);
            num1 = num2;
            num2 = num3;

        }



    }
}
