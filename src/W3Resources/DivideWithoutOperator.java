package W3Resources;

import java.util.Scanner;

public class DivideWithoutOperator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();

        divides(num1, num2);

    }

    public static void divides(int num1, int num2){

        if(num2 == 0){

            System.out.println("Invalid number");
        }

        int count = 0;

        while(num1 >= num2){

            num1 -= num2;

            count++;
        }

        System.out.println(count+" and remainder is "+num1);
    }
}
