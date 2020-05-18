package Replit_Practices;
import java.util.Scanner;
public class timeConversion {
    /*
    Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
Function Description
It should print a new string representing the input time in 24 hour format.
timeConversion has the following parameter(s):
s: a string representing time in  12 hour format

Input: 07:05:45PM
Output: 19:05:45
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
        s = s.toLowerCase();

        if(s.endsWith("am")){

            s = s.replace("am","");

        } else{

            s = s.replace("pm","");

            Integer a = Integer.valueOf(s.substring(0,s.indexOf(":")));

            int b = a + 12;

            s = "" + b + s.substring(s.indexOf(":"));
        }
        System.out.println(s);

    }

    public static void timeConversion1(String s){

        if(s.charAt(1) == ':'){

            s = "0" + s;
        }

        int a1 = Integer.parseInt(s.substring(0,2));

        if(s.contains("PM")){

            s = (a1 + 12) + s.substring(2,s.length()-2);

        } else{

            s = s.substring(0,s.length()-2);
        }

        System.out.println(s);

    }
}
