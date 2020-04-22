package day17_WhileLoops;
import java.util.Scanner;
public class Calculator_Char_ForLOOP {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);

        for(int i=0; i==0;) {
            System.out.println("Enter first number: ");
            int num1 = scan.nextInt();
            System.out.println("Enter second number: ");
            int num2 = scan.nextInt();
            System.out.println("Math operator: ");
            char operator = scan.next().charAt(0);// *, /, +, -, %

            if (operator == '+'){
                System.out.println("Addition is: " + (num1 + num2));
            } else if (operator=='-') {
                System.out.println("Subtraction is: " + (num1 - num2));
            } else if (operator == '/') {
                System.out.println("Division is: " + (num1 / num2));
            } else if (operator == '*') {
                System.out.println("Multiplication is: " + (num1 * num2));
            } else if (operator == '%') {
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


    }
}
