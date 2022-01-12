package day11_Scanner_Continue;

import java.util.Scanner;
public class ScannerClass {
    public static void main(String []args){

        Scanner input = new Scanner(System.in);
        //long l = 999999999999l;
        System.out.println("Enter a long number: ");
        long l = input.nextLong();//it will return user input as a long number
        System.out.println("You have entered a long number: "+l);

        System.out.println("Enter a decimal number: ");
        long b = (int)input.nextFloat();//it will return whole number, because we casted it
        System.out.println("You have entered: "+b);

        System.out.println("Enter a decimal number: ");
        double d = input.nextDouble();//returns input as double
        System.out.println("You have entered: "+d);

        System.out.println("Enter true or false: ");
        boolean answer = input.nextBoolean();//return input as boolean
        System.out.println("You have entered: "+answer);

        System.out.println("Enter your sentence: ");
        String s = input.next();
        System.out.println("You have entered: "+s);






    }
}
