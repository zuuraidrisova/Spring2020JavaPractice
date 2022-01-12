package reviewPracticing;

import java.util.Scanner;

public class Arrays_Scanner_Tasks3 {

    public static void main(String[] args) {

        /*
        Create an array that holds the days
User should be able to enter the day index and output should be:
“Today is Monday”
         */

        Scanner scan = new Scanner(System.in);

        String [] days = new String[7];

        for (int i = 0; i < 7; i++){

            System.out.println("Enter a day: ");

            days[i] = scan.next();

        }


        for (int j = 1; j <= 7; j++){

            System.out.println(days[j-1]);
        }

        scan.close();

    }
}
