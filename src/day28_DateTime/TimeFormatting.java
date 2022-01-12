package day28_DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatting {

    public static void main(String[] args) {

                /*
        DateTimeFormatting :

                year : yy =two digits, yyyy = four digits
                month: MM =number, MMM = first three letters of month, MMMM = full name of month
                days: dd = two digits
                days name : E = first three letters, EEEE = full name of days

                hours: hh = two digits
                minutes: mm = two digits
                seconds: ss = two digits
                am/pm :  a --> automatically converts by default

         */

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");

        LocalTime time1 = LocalTime.of(10,45,23);

        System.out.println(time1.format(dtf));

        LocalTime time2 = LocalTime.of(17,00,12);

        System.out.println(time2.format(dtf));

        boolean result = time1.isAfter(time2);

        System.out.println(result);//false bcs time1 does not come after time2

        boolean result2 = time1.isBefore(time2);

        System.out.println(result2);//true bcs time1 comes before time2

        boolean result3 = time1.equals(time2);

        System.out.println(result3);//false bcs time1 and time2 does not match, are not equal

    }
}
