package Replit_Practices;
import java.util.Scanner;
public class Calculator {
    public static void main(String []args){
        Scanner scan =new Scanner(System.in);

        while(true) {
            System.out.println("Enter first number: ");
            int num1 = scan.nextInt();
            System.out.println("Enter math operator: ");
            String operator = scan.next();
            System.out.println("Enter second number: ");
            int num2 = scan.nextInt();

            if (operator.equalsIgnoreCase("+")) {
                System.out.println("Addition of two numbers: " + (num1 + num2));
            }else if(operator.equalsIgnoreCase("*")){
                System.out.println("Multiplication of two numbers: "+ (num1*num2));
            }else if(operator.equalsIgnoreCase("/")){
                System.out.println("Division of two numbers: "+(num1/num2));
            }else if(operator.equalsIgnoreCase("-")){
                System.out.println("Subtraction of two numbers: "+(num1-num2));
            }else{
                System.out.println("Invalid operator");
            }

            System.out.println("Would you like to continue? ");
            String reply = scan.next();
            while(!(reply.equalsIgnoreCase("Yes")
                    || reply.equalsIgnoreCase("No"))){
                System.out.println("Invalid entry!Please re-enter yes or no!");
                reply=scan.next();
            }
            if(reply.equalsIgnoreCase("No")){
                System.out.println("Thank you for using calculator!");
                break;
            }


        }
    }
}
