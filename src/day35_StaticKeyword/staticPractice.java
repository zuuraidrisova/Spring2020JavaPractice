package day35_StaticKeyword;

import java.util.Scanner;

public class staticPractice {

    // when we use static variable instead of instance variable

    static  Scanner scan = new Scanner(System.in);
    // now can be used in main method and instance method

    public  static void main(String [] args){

      //  Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();

        System.out.println("the sum is : "+ (num1 + num2));



    }

    public void method1(){

     //   Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();

        System.out.println("multiplication is : "+(num1 * num2));
    }

}
