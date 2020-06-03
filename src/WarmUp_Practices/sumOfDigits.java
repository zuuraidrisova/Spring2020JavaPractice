package WarmUp_Practices;

import java.util.Scanner;

public class sumOfDigits {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scan.nextInt(); //1234
        int sum = 0;
        int digits = 0;


        while(num > 0){

            digits = num % 10;//extracting the last digit in number

            sum = sum + digits; // 0 + 4

            num = num /10;//removes the last digit, so result is 123

        }

        System.out.println("Sum of digits of number is: "+sum);



    }
}
