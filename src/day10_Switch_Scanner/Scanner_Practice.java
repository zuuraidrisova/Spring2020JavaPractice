package day10_Switch_Scanner;
import java.util.Scanner;
public class Scanner_Practice {
    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        System.out.println("Enter first number: ");
            int num1 = sum.nextInt();
        System.out.println("Enter next number: ");
            int num2 = sum.nextInt();
            int total = (num1+num2);
        System.out.println("Sum of the numbers above is: " + total);

        Scanner rate = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int num3 = rate.nextInt();
        System.out.println("Enter hours you work weekly: ");
        int num4 = rate.nextInt();
        int output = (num3/num4);
        System.out.println("Your hourly rate is: "+output);

    }
}
