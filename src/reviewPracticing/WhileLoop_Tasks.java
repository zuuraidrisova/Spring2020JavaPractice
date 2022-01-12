package reviewPracticing;

import java.util.Scanner;

public class WhileLoop_Tasks {

    public static void main(String[] args) {

        /*
Write a program using while loop, that calculates the sum of the even numbers between
0 and 10
         */
        int i =0;
        int sumOfEven = 0;


        while (i <= 10){

            if(i % 2 == 0){

                System.out.print(i+" ");
                sumOfEven += i;

            }
            i++;
        }

        System.out.println();
        System.out.println("sumOfEven = " + sumOfEven);

        /*
     Write a program that asks user to enter his/her username and
     password until user enters correctly.
         */

        Scanner scan = new Scanner(System.in);

        String validUsername = "zidrisova";
        String validPassword = "java";

        System.out.println("Enter your username: ");
        String username = scan.next();

        System.out.println("Enter your password: ");
        String password = scan.next();

        int count = 1;

        while(!username.equals(validUsername) || !password.equals(validPassword)){

            System.out.println("Please re-enter your credentials: ");

            System.out.println("Please enter your username: ");
            username = scan.next();

            System.out.println("Please enter your password: ");
            password = scan.next();

            count++;

            if (count >= 3){

                System.out.println("You exceeded your count");
                break;
            }
        }

        if (username.equals(validUsername) && password.equals(validPassword)){

            System.out.println("Loggen in successfully");
        }


        scan.close();
    }
}
