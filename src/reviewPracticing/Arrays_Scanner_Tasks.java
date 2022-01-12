package reviewPracticing;

import java.util.Scanner;

public class Arrays_Scanner_Tasks {

    public static void main(String[] args) {

        //Create an array that holds the days
        //User should be able to enter the day index and output should be:
        //“Today is Monday”

        Scanner scanner = new Scanner(System.in);

        String [] days = new String[7];

        for (int i = 0; i < 7; i++){

            days[i] = scanner.next();

        }

        for (int i = 1; i <= 7; i++){

            System.out.println(days[i-1]);
        }


        //Create an array that holds 12 months names
        //User should be able to enter month index and output should be:
        //“The month name is <MonthName>”


        scanner = new Scanner(System.in);

        String [] months = new String[12];

        for (int i = 0; i < 12; i++){

            System.out.println("Enter a month: ");
            months[i] = scanner.next();
        }

        for (int i = 1; i <= 12; i++){

            System.out.println(months[i-1]);
        }


        scanner.close();

    }
}


