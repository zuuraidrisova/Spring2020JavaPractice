package day23_CustomMethods.day27_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class birthday {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy, MMM, dd");

        LocalDate date1 = LocalDate.of(1990, 11, 17);

        System.out.println(date1.format(dtf));


        LocalTime time = LocalTime.now();

        System.out.println(time);



    }
}
