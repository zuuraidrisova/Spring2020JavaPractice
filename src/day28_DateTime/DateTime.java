package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();

        System.out.println(dt);

        //2020=03-20 11:25:20;

        LocalDate date1 = LocalDate.of(2020,03,20);

        LocalTime time1 = LocalTime.of(11,25,20);

        LocalDateTime dateTime = LocalDateTime.of(date1, time1);

        System.out.println(dateTime);

        LocalDateTime dateTime2 = LocalDateTime.of(2020,04,24,11,30);

        System.out.println(dateTime2);


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd");
        //   it is gonna print only month and day, because we did not put year, even if it is in variable

        LocalDate dt3 = LocalDate.of(2019,11,17);

        System.out.println(dt3.format(dtf));





    }
}
