package day23_CustomMethods.day27_DateTime;

import java.time.LocalDate;

public class dates {

    public static void main(String[] args) {

       /*
       declaration  of date:

       LocalDate date1 = LocalDate.of(year 2020, month 10, day 25);

        methods:

            isAfter(date2); == >checks which one comes after  and returns a boolean expression
            isBefore(date2) ==> checks which date comes before another and returns boolean
            isEqual(date) ==> compares two dates and returns boolean
            isLeapYear() ==> identifies whether the year is leap year or not, returns boolean
            toString ==> converts to string


        */

        LocalDate date1 = LocalDate.of(2020,10,17);

        System.out.println(date1);

        LocalDate birthDate = LocalDate.of(1990, 11, 17);

        System.out.println(birthDate);

        boolean result = date1.isAfter(birthDate);

        System.out.println(result);//true because bcs date1 comes after birthdate

        boolean result2 = date1.isBefore(birthDate);

        System.out.println(result2);//false because date1 does not come before birthdate

        boolean result3 = date1.isEqual(birthDate);

        System.out.println(result3);//false because dates are different

        boolean result4 = birthDate.isLeapYear();

        System.out.println(result4);//false, bcs that date is not a leap year

        //another way of declaring date

        System.out.println("================================");

        LocalDate now = LocalDate.now();// now() ==> prints current date

        System.out.println("Today is: "+now);

        String str = now.toString();

         str = str.replace("-"," ");

        System.out.println(str);




        LocalDate birthDay = LocalDate.of(1991,05,25);

        int month = birthDate.getMonthValue();
        int days = birthDay.getDayOfMonth();


    }

}
