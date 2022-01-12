package day27_DateTime;

import java.time.LocalDate;

public class Dates {

    public static void main(String[] args) {


        LocalDate date1 = LocalDate.of(2020,04,23);

        System.out.println(date1);

        LocalDate today = LocalDate.now();

        System.out.println("Today is "+today);

        LocalDate bDay = LocalDate.of(1990,11,17);

        System.out.println("My Birthday is "+bDay);

        /*
        LocalDate: used for creating date(year, month, day);

        methods:

                isAfter(date2) ==> checks whether date 1 comes after date 2 and returns boolean
                isBefore(date2) ==> checks whether date 1 came before date 2 and returns boolean
                isEqual(date1,date2) ==> compares whether date 1 is same as date 2 and returns boolean
                isLeap(year) ==> checks whether the given year is leap year or not, returns boolean
         */

        boolean b = date1.isAfter(today);

        System.out.println(b);//false bcs date 1 does not come after today

        boolean b1 = date1.isBefore(today);

        System.out.println(b1);//true bcs date 1 comes before today

        boolean b3 = bDay.isLeapYear();

        System.out.println(b3);//false bcs 1990 was not leap year

        boolean b4 = date1.isEqual(today);

        System.out.println(b4);//false bcs date 1 is not same as today

        String str = today.toString();

        str = str.replace("-","/");

        System.out.println(str);


    }
}
