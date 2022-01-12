package day19_Arrays;

import java.util.Scanner;

public class ArraysPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        int [] month = new int[12];

        System.out.println("Please enter a number: ");
        int num = scan.nextInt();

        if(num == 1){

            System.out.println("January is the first month of New Year");

        }else if(num == 2){

            System.out.println("February has celebrate Valentine's Day");

        }else if(num == 3){

            System.out.println("March has International Womens day");

        }else if(num == 4){

            System.out.println("April has  Foolish Day");

        }else if(num == 5){

            System.out.println("May has my  husband's Birthday");

        }else if(num == 6){

            System.out.println("June has Children's day");

        }else if(num == 7){

            System.out.println("July has Independence Day of America!");

        }else if(num == 8){

            System.out.println("August has Independence day of Kyrgyzstan");

        }else if(num == 9){

            System.out.println("September has First School Day");

        }else if(num == 10){

            System.out.println("October has Gold Autumn");

        }else if(num == 11){

            System.out.println("November has my birthday");

        }else if(num == 12){

            System.out.println("December has Christmas");

        }else{

            System.out.println("Invalid Data");
        }

        for(int i = 0; i <= num; i++){

            System.out.println("This month has: "+ month[i]);
        }


    }
}
