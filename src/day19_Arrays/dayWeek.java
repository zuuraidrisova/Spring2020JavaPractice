package day19_Arrays;

import java.util.Scanner;

public class dayWeek {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String [] daysWeek = new String [7];

        for(int i = 0; i < 7; i++){

            System.out.println("Enter a day of the week: ");

            daysWeek [i] = scan.next();
        }

        for(int i = 1; i <= 7 ; i++){

            System.out.println("Today is "+daysWeek[i-1]);
        }
    }
}
