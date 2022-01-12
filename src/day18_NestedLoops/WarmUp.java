package day18_NestedLoops;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {
        /*
        . write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication, or module operators
         */
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter first number: ");

        int num1 = scan.nextInt();
        System.out.println("Enter second number:");

        int num2 = scan.nextInt();
        System.out.println("Enter a math operator: ");

        String operator = scan.next();

        int count = 0;

        while (num1 >= num2){

            num1 -= num2;

            count++;
        }

        System.out.println("count is: "+count);
        System.out.println("remainder is: "+num1);




    }
}
