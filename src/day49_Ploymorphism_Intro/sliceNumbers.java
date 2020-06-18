package day49_Ploymorphism_Intro;

import java.util.Scanner;

public class sliceNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num =27632;

        int digit5 = num % 10; //2
        num = num / 10;

        int digit4 = num % 10;//3
        num = num / 10;

        int digit3 = num % 10;//6
        num = num /10;

        int digit2 = num % 10;//7
        num = num /10;

        int digit1 = num % 10;//2

        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);


        System.out.println("============================");

        int num2 = scan.nextInt();

        while(num2 != 0){

           int result = num2 % 10;
            num2 = num2 / 10;

            System.out.println(result);
        }







    }
}
