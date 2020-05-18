package Replit_Practices;

import java.util.Scanner;

public class FindCubeMethod {
    public static void main(String[] args) {
        /*
        Given method called cube. Write all required code inside this method
         in order  to ask the user for a number and then prints the cubed
         value of that number:

Example:

input: 5
output: 125

hint: cube of a number n = n*n*n
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        int number  = scan.nextInt();

        cube(number);

    }

    public static void cube(int num) {

        System.out.println(num * num * num);

    }


}
