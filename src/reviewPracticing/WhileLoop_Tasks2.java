package reviewPracticing;

import java.util.Scanner;

public class WhileLoop_Tasks2 {

    public static void main(String[] args) {

            /*
            write a program that can calculate the two numbers based on the user
             provided operators, the program will ask:
           1. enter first number
            2. enter the second number
           3. enter the math operators
            (assume that only the +, -, *, /, and % will be entered)
      then the system will give the result based on the operator
         at the end it will ask if the user wants to calculate another numbers, if user
     entered "NO" or "no", the program will stop execution, otherwise it repeats all the previous steps
 (you will need a loop that has true condition without the iterator)
             */


        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.println("Enter first number: ");
            int num1 = scan.nextInt();

            System.out.println("Enter second number: ");
            int num2 = scan.nextInt();

            System.out.println("Enter math operator: ");
            String operator = scan.next();

            if (operator.equals("*")){

                System.out.println(num1 * num2);

            }else if(operator.equals("/")){

                System.out.println(num1 / num2);

            }else if(operator.equals("-")){

                System.out.println(num1 - num2);

            }else if(operator.equals("+")){

                System.out.println(num1 + num2);

            }else if(operator.equals("%")){

                System.out.println(num1 % num2);

            }else{

                System.out.println("Invalid math operator");
            }

            System.out.println("Would you like to calculate another numbers: ");

            String answer = scan.next();

            if(answer.equalsIgnoreCase("No")){

                System.out.println("Thank you for using our calculator");
                break;
            }

        }

        scan.close();




    }
}
