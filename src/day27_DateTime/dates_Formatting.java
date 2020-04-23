package day27_DateTime;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class dates_Formatting {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");//MM for numeric

        LocalDate date1 = LocalDate.now();

        System.out.println(date1.format(dtf));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");//MMM for alphabetic

        System.out.println(date1.format(dtf2));

        //days_month_year

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd_MM_yyyy");

        System.out.println(date1.format(dtf3));

        //create a date called birthDay : month / days/ year
        //ex: Apr/23/20

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("EEE MMMM/dd/yy");//MMMM will print month in full alphabetic way

        LocalDate date2 = LocalDate.of(1990,11,17);

        String str  = date2.format(dtf4);//since it is string u can assign it to a new variable to make it reusable

        System.out.println(str);

        LocalDate date3 = LocalDate.of(1989, 04,01);

        System.out.println(date3.format(dtf4));

    }
}
