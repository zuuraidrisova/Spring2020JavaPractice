package day16_ForLoopContinueBreak;

import java.util.Scanner;

public class SumOfAllGivenNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sum = 0;

        for(int i = 1; i <= 7; i++){

            System.out.println("Please enter a number: ");

            int num = scan.nextInt();

            sum+=num;
        }

        System.out.println(sum);


        System.out.println("Please enter a number: ");

        int num1 = scan.nextInt();

        int sum1 = 0;

        for(int i = 0; i <= num1; i++){

            sum1 += i;
        }

        System.out.println(sum1);


    }
}
