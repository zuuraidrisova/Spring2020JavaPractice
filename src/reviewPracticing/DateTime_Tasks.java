package reviewPracticing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime_Tasks {

    public static void main(String[] args) {

        /*
    1. create an array of string, store five of your friends names in it
    2. create Array of localdates and store thier birthdays in the same order
    3. use for loop to print out your friends' names and their birthdays
     */

        String [] names = {"Zuura", "Safiya","Alina","Chopa","Sary"};

        LocalDate zuuraB = LocalDate.of(1990,11,17);
        LocalDate safiyaB = LocalDate.of(2021,2,19);
        LocalDate alinaB = LocalDate.of(1989,4,1);
        LocalDate chopaB = LocalDate.of(1990,12,8);
        LocalDate saryB = LocalDate.of(1991,5,2);

        LocalDate [] birthdays = {zuuraB,safiyaB,alinaB,chopaB,safiyaB};

        for (String each : names){

            System.out.println(each);
        }
        for (LocalDate each : birthdays){

            System.out.println(each);
        }


        LocalDate date = LocalDate.now();

        System.out.println("date = " + date);

        LocalTime time = LocalTime.now();

        System.out.println("time = " + time);

        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("dateTime = " + dateTime);
    }
}
