package day20_ArraysContinue;

import java.util.Scanner;

public class Weeks {
    public static void main(String[] args) {
        String [] daysWeek = {"Monday", "Tuesday", "Wednesday","Thursday","Friday",
                          "Saturday","Sunday"};

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scan.nextInt();

        int attempts = 1;

        while(num > 7 || num < 1){

            System.out.println("Invalid entry!");
            System.out.println("Please re-enter a number: ");
            num = scan.nextInt();

            attempts++;//each time attempts number will increase

            if(attempts == 3 && (num > 7 || num < 0)){//and when attempt reaches 3
                System.out.println("Invalid entry!");
                System.exit(0);
            }

        }
        String result = daysWeek[num-1];

        System.out.println(result);




    }
}
