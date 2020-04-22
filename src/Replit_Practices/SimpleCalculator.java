package Replit_Practices;

import java.util.Scanner;

public class SimpleCalculator {
    /*
    create a static method called "plus", its return is void and it gets no
    arguments.

It asks the user to input two numbers, then it will add them and print the result.
Create a scanner within plus method.

Example:

enter first number:
1
enter second number:
2
result: 3
     */
    public static void main(String[] args) {

        plus();
    }
    public static void plus(){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number:");
        int first = scan.nextInt();
        System.out.println("enter second number:");
        int second = scan.nextInt();
        System.out.println("Result: "+ (first+second));

    }
}
