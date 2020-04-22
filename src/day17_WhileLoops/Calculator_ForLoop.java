package day17_WhileLoops;
import java.util.Scanner;
public class Calculator_ForLoop {
    public static void main(String[] args) {
        /*
        write a program that can calculate the two numbers based on the user provided operators, the program will ask:
						1. enter first number
						2. enter the second number
						3. enter the math operators
								(assume that only the +, -, *, /, and % will be entered)
						then the system will give the result based on the operator
						at the end it will ask if the user wants to calculate another numbers, if user
						entered "NO" or "no", the program will stop execution, otherwise it repeats all the previous steps
								(you will need a loop that has true condition without the iterator)
         */

     Scanner  scan = new Scanner(System.in);

     for(int i=0; i==0;) {
         System.out.println("Enter first number: ");
         int num1 = scan.nextInt();
         System.out.println("Enter second number: ");
         int num2 = scan.nextInt();
         System.out.println("Math operator: ");
         String operator = scan.next();// *, /, +, -, %

         if (operator.equals("+")) {
             System.out.println("Addition is: " + (num1 + num2));
         } else if (operator.equals("-")) {
             System.out.println("Subtraction is: " + (num1 - num2));
         } else if (operator.equals("/")) {
             System.out.println("Division is: " + (num1 / num2));
         } else if (operator.equals("*")) {
             System.out.println("Multiplication is: " + (num1 * num2));
         } else if (operator.equals("%")) {
             System.out.println("Remainder is: " + (num1 % num2));
         } else {
             System.out.println("Invalid");
         }//closing curly braces of multi branch if statement


         System.out.println("Do you want to continue? ");
         String answer = scan.next();
         if (answer.equalsIgnoreCase("No")) {//only exits the loop if the answer is no
             System.out.println("Thank you for using calculator!");
             break;
         }//closing curly braces of last if statement


     }//closing curly braces of for loop






    }//closing curly braces of main method
}//closing curly braces of class
