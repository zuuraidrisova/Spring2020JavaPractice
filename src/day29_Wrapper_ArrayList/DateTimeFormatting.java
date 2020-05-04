package day29_Wrapper_ArrayList;


import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeFormatting {

    public static void main(String[] args) {


        LocalDate  date = LocalDate.of(2020,12,2);

        System.out.println(date);

        LocalDate today = LocalDate.now();

        System.out.println(today);

        LocalTime now = LocalTime.now();

        System.out.println(now);

        LocalTime present = LocalTime.of(2,30,55);

        System.out.println(present);



    }
}
