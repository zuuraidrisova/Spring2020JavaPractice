package day27_DateTime;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        /*

        year : yyyy --> full digits, yy --> two digits
        month : MM --> numbers, MMM --> first three letters of month, MMMM -- > full name of month
        day : dd --> numbers
        week: EEE --> first three letters of days name, EEEE --> full name of days

         */

        LocalDate date = LocalDate.now();

        System.out.println(date.format(dtf));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEE MMMM/dd/yyyy");

        System.out.println(date.format(dtf2));

    }
}