package day19_Arrays;

import java.util.Scanner;

public class Arrays_Scanner_Month {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String [] month = new String [12];

        for(int i = 0; i < 12 ;i++) {
            System.out.println("Enter a month: ");
            month[i] = scan.next();
        }


        for(int i = 1; i <= 12 ; i++){
            System.out.println("Month is: "+month[i-1]);
        }


    }
}
