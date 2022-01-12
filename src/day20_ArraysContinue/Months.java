package day20_ArraysContinue;

import java.util.Scanner;

public class Months {

    public static void main(String[] args) {

        String [] month = {"January","February", "March", "April","May","June",
                          "July","August","September","October","November","December"};

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number: ");

        int num = scan.nextInt();

        int attempts = 1;

        while(num > 12 || num <= 0){

            System.out.println("Invalid entry");

            System.out.println("Please re-enter number: ");

            num = scan.nextInt();

            attempts++;

            if(attempts == 3 && (num > 12 || num <= 0) ){

                System.out.println("Invalid entry!");

                System.exit(0);
            }

        }

        String result =  month[num - 1];//index number starts always from 0

        System.out.println(result);












       /* another way declaring array
       String [] month2 = new String [12];
                    month2[0] = "January";
                    month [1] = "February";

        */
    }
}
