package day18_NestedLoops;
import java.util.Scanner;
public class DivideTwoNumbers {
    public static void main(String[] args) {
        /*
        . write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication, or module operators
         */
        /*
        assume:int num1=10;num2=3;
        10-3-3-3=1
          three times execution  with remainder of 1
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = scan.nextInt();

        if(num2==0){
            System.out.println("Denominator cannot be zero!");
            System.exit(0);
        }

        int count=0;

        while(num1>=num2) {
            num1-=num2;
            count++;
        }

        if(num1==0) {
            System.out.println("the result is: " + count);
        }else{
            System.out.println("the result is: " + count);
            System.out.println("remainder is: " + num1);
        }
    }
}

