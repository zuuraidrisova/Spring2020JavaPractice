package day17_WhileLoops;
import java.util.Scanner;
public class WhileCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

       while(true) {

           System.out.println("Please enter first number: ");
           int num1 = scan.nextInt();

           System.out.println("Please enter second number: ");
           int num2 = scan.nextInt();

           System.out.println("Please enter a math operator: ");
           String operator = scan.next();

           if (operator.equals("+")) {
               System.out.println("Addition is: " + (num1 + num2));

           } else if (operator.equals("-")) {
               System.out.println("Subtraction is: " + (num1 - num2));

           } else if (operator.equals("*")) {
               System.out.println("Multiplication is: " + (num1 * num2));

           } else if (operator.equals("/")) {
               System.out.println("Division is: " + (num1 / num2));

           } else if (operator.equals("%")) {
               System.out.println("Remainder is: " + (num1 % num2));
           }

           System.out.println("Do you want to continue? ");
           String reply = scan.next();

           if (reply.equalsIgnoreCase("No")) {
               System.out.println("Thank you for using calculator!");
               break;
           }
       }

    }
}
