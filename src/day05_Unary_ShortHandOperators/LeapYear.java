package day05_Unary_ShortHandOperators;

public class LeapYear {
    public static void main(String []args){
        /*
        write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
            year = 2020
        output:    2020 is leap year: true

         */
        short year = 2026;
        boolean LeapYear = year%4 ==0;
        String result = year + " is a leap year: "+ LeapYear;
        System.out.println(result);


    }


}

