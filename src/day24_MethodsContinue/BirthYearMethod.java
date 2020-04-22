package day24_MethodsContinue;

import java.util.Scanner;

public class BirthYearMethod {
    public static void main(String[] args) {
        /*
        write a method that accepts birth year and displays the age in the console

        ex: calculate(1990) ==> 30
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your birth year: ");
        int birthYear = scan.nextInt();

        calculateAge(birthYear);

        printHelloCybertek();

    }

    public static void calculateAge(int year){

        int currentYear = 2020;
        int age  = currentYear - year;

        if(age > 0 && year > 1900){

            System.out.println(age);

        }else{
            System.out.println("Invalid.You are not born yet!");
        }

    }

    public static void printHello(){

        System.out.print("Hello");
    }
    public static void printCybertek(){

        System.out.println(" Cybertek");
    }

    public  static void printHelloCybertek(){

        printHello();
        printCybertek();
    }
}
