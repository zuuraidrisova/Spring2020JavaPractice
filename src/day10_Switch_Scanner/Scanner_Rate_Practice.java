package day10_Switch_Scanner;
import java.util.Scanner;
public class Scanner_Rate_Practice {
    public static void main(String[] args) {
/*
write a program for the rate calculater: rateCalculator
                        1. asks the user to enter salary (as integer)
                        2. asks the user how many hours does she/he works in a week
                        3. print the hourly rate
 */
        Scanner rate = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        int salary = rate.nextInt();

        System.out.println("Enter hours you work weekly: ");
        byte hours = rate.nextByte();

        System.out.println("Enter weeks you work annually: ");
        byte numberOfWeeks = rate.nextByte();

        int output = ((salary/numberOfWeeks)/hours);
        System.out.println("Your hourly rate is: "+output);

    }
}
