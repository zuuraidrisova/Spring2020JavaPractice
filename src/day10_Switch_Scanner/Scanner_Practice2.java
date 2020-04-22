package day10_Switch_Scanner;
import java.util.Scanner;
public class Scanner_Practice2 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = numbers.nextInt();
        System.out.println("Enter second number: ");
        int num2 = numbers.nextInt();
        System.out.println("Enter third number: ");
        int num3 = numbers.nextInt();

        int max = (num1>num2 && num2>num3)? num1 : (num2>num1 && num2>num3)? num2 : num3;
        int min = (num1<num2 && num1<num2)? num1 : (num2<num1 && num2<num3)? num2:num3;
        System.out.println(max+" is maximum number");
        System.out.println(min+ " is minimum number");


    }
}
