package day17_WhileLoops;
import java.util.Scanner;
public class Max_Min_Numbers {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

      /*  System.out.println("Enter a number:");
        int num =  scan.nextInt();

        System.out.println("Enter a number:");
        int num2 =  scan.nextInt();

        System.out.println("Enter a number:");
        int num3 =  scan.nextInt();

        System.out.println("Enter a number:");
        int num4 =  scan.nextInt();

        System.out.println("Enter a number:");
        int num5 =  scan.nextInt();
        */
      //there is easier way to find max or min number thru for loop

       int  maxNumber =-2147483647;//any number user provided will be greater than this number
      //first user entered variable will be initialized to maxNumber

        int minNumber = 2147483647;

        for (int i = 1; i <= 10; i++){//1,2,3,4,5 numbers will be asked
          System.out.println("Enter a number: ");
          int num =  scan.nextInt();
          if(num > maxNumber) {//to compare each  user input to get maximum number
              maxNumber = num;//and assign the maximum number to maxNumber
          }
          if(num < minNumber){//to compare each user input and get the minimum number

              minNumber = num;//and assign it to variable
          }
      }

        System.out.println("Maximum number is: "+ maxNumber);
        System.out.println("Minimum number is: "+ minNumber);

        /*
        	1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will nedd for loop and if statement
	2. write a program that can ask the user "enter a number" five times and return the minimum number
				hint: you will nedd for loop and if statement
         */



    }
}

