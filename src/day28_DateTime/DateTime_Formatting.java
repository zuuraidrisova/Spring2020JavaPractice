package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatting {

    public static void main(String[] args) {

        LocalDateTime dateTime1 = LocalDateTime.of(2015,12,25,10,35,30);

        System.out.println(dateTime1);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE MM/dd/yyyy hh:mm a");

        System.out.println(dateTime1.format(dtf));

        String str = dateTime1.toString();

        System.out.println(str);

    }
}
