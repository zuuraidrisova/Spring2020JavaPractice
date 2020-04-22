package day24_MethodsContinue;

import java.util.Scanner;

public class calculateMethod2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       calculate(20,2,'%');

       while(true){

           System.out.println("Enter first number: ");
           int num1 = scan.nextInt();
           System.out.println("Enter second number: ");
           int num2 = scan.nextInt();
           System.out.println("Enter valid math operator: ");
           char operator = scan.next().charAt(0);

           calculate(num1, num2, operator);

           System.out.println("Do you want to continue? ");
           String answer = scan.next();

           while(! (answer.equalsIgnoreCase("No") || answer.equalsIgnoreCase("Yes"))){

               System.out.println("Please re-enter yes or no!");
               System.out.println("Do you want to continue? ");
               answer = scan.next();
           }

           if(answer.equalsIgnoreCase("No")){

               System.out.println("Thank you for using calculator!");
               break;

           }


       }
    }
   /*
           write a method called Calculation, that passes 3 parameters:
        2 numbers and one operator, and prints out the calculation
    	if operator is not between [-, +, *, /, %] output should be Invalid Operator
    	Ex: calculate(10, 2, '*') ==> 20;
    		calculate(10, 2, '&') ==> Invalid operator
    		NOTE: The method MUST take three arguments when it's called
         */

   public static void calculate(int num1, int num2, char operator){

       int sum = 0;

       switch (operator){
           case '+':
               sum = num1 + num2;
               break;
           case '*':
               sum = num1 * num2;
               break;
           case '-':
               sum = num1 - num2;
               break;
           case '/':
               sum = num1 / num2;
               break;
           case '%':
               sum = num1 % num2;
               break;
           default:
               System.out.println("Invalid operator");

       }
       System.out.println(sum);

   }
}
