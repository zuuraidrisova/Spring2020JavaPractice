package day24_MethodsContinue;

import java.util.Scanner;

public class CalculateMethodCharSwitch {

    public static void main(String[] args) {
         /*
        write a method called Calculation, that passes 3 parameters:
        2 numbers and one operator, and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
		Ex: calculate(10, 2, '*') ==> 20;
			calculate(10, 2, '&') ==> Invalid operator
			NOTE: The method MUST take three arguments when it's called
         */

        calculation(32,5,'%');

      while(true) {

          Scanner scan = new Scanner(System.in);

          System.out.println("Enter num1:");
          int num1 = scan.nextInt();

          System.out.println("Enter num2:");
          int num2 = scan.nextInt();

          System.out.println("Enter a math operator:");
          char operator = scan.next().charAt(0);

          calculation(num1, num2, operator);

          System.out.println("Do you want to continue? ");
          String answer = scan.next();

          while( !(answer.equalsIgnoreCase("Yes")
                  || answer.equalsIgnoreCase("No"))){

              System.out.println("Invalid Entry, please re-enter Yes or No?!");
              System.out.println("Do you want to continue? ");
              answer = scan.next();

          }

          if(answer.equalsIgnoreCase("No")){

              System.out.println("Thank you for using calculator!");
              System.exit(0);//exits the whole program

          }//closing braces of if condition

      }//closing braces of while loop



    }//closing braces of main method

    public static void calculation(double num1, double num2, char operator){

        double result =0;

        switch (operator){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Invalid operator");

        }

        System.out.println(result);
    }
}
