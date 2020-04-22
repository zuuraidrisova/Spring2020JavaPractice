package day24_MethodsContinue;

import java.util.Scanner;

public class ReturnMaxNumWithScannerMethod {
    public static void main(String[] args) {
        /*
        write a methods that can return the maximum number between two numbers
			Ex: Max(10, 20) ==> 20
         */

        maxNumber();
    }
    public static void maxNumber(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int num1 = scan.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = scan.nextInt();

        if(num1 >= num2){
            System.out.println("Maximum number is "+num1);
        }else{
            System.out.println("Maximum number is "+num2);
        }
    }



}
