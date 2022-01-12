package day23_CustomMethods;

import java.util.Scanner;

public class MethodWithParameter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");

        int age = scan.nextInt();

        eligibleToBuyAlcohol(age);

    }

    public static void eligibleToBuyAlcohol(int age){

        if(age >= 21){

            System.out.println("Eligible to Buy alcohol");

        }else{

            System.out.println("Eligible to buy milk");
        }

    }



}



