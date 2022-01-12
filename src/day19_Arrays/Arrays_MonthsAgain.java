package day19_Arrays;

import java.util.Scanner;

public class Arrays_MonthsAgain {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        String [] month = new String [12];

        for(int i = 0; i < 12; i++){

            System.out.println("Please enter a month: ");

            month[i] = scan.next();
        }

        for(int i = 0; i < 12; i++){

            System.out.println("Month is: "+month[i]);
        }
    }
}
