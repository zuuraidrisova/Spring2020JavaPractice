package day12_Scanner_JavaRecap;
import java.util.Scanner;
public class AscendingNumbers {
    public static void main(String[] args) {
        /*
        write a program that asks to enter 5 numbers
        and prints the numbers in ascending order (smallest to largest)
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter random 3 numbers:  ");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(num1< num2 && num1<num3){
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        }else if(num2<num1 && num2<num3){
            System.out.println(num2);
            System.out.println(num1);
            System.out.println(num3);
        }else{
            System.out.println(num3);
            System.out.println(num2);
            System.out.println(num1);
        }

    }
}


