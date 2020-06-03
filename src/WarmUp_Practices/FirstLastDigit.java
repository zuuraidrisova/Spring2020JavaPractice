package WarmUp_Practices;

import java.util.Scanner;

public class FirstLastDigit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();

        int last = number % 10;

        int first = number;

        while(first >= 10){

            first = first / 10;
        }

        int sum = first + last;

        System.out.println("The first digit is: "+first);
        System.out.println("The last digit is: "+last);
        System.out.println("Sum of first and last digit is: "+sum);


    }
}
