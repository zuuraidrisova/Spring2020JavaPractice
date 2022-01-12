package reviewPracticing;

import java.util.Scanner;

public class ForLoop_Tasks4 {

    public static void main(String[] args) {

        /*
       1. write a program that can ask the user "enter a number" five times
        and return the maximum number
        hint: you will nedd for loop and if statement
       2. write a program that can ask the user "enter a number" five times
        and return the minimum number
        hint: you will nedd for loop and if statement

        */

        Scanner scan = new Scanner(System.in);

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

       for (int i = 0; i < 5; i++){

           System.out.println("Enter a number: ");

           int num = scan.nextInt();

           System.out.println(num);

           if (num > maxNumber){

               maxNumber = num;

           }

           if (num < minNumber){

               minNumber = num;

           }
       }

        System.out.println(maxNumber);
        System.out.println(minNumber);

        /*
        3. write a program which prints out the numbers from 1 to 30:
        1. for numbers which are divisible by 3, print "FIN" instead
        of the number.
        2. for numbers which are divisible by 5, print "RA" instead
        of the number
        3. for numbers which are a divisible by both 3 and 5, print
        "FINRA" instead of the number
                 */

        for (int i = 1; i <= 30; i++){

            if(i % 3 == 0 && i % 5 == 0){

                System.out.println("FINRA");

            } else if(i % 3 == 0){

                System.out.println("FIN");

            }else if(i % 5 == 0){

                System.out.println("RA");

            }else{

                System.out.println(i);
            }



        }



    }
}
