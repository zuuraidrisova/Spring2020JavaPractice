package OfficeHours_Saim.day1_StringsLoops;

public class seeColor {

    public static void main(String[] args) {

        /*

Given a string, if the string begins with "red" or "blue" return that
 color string, otherwise return the empty string.


seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
         */
        String str = "redxx";

        String a = seeColor(str);

        System.out.println(a);

    }

    public static String seeColor(String str){

        if(str.startsWith("red")){

            return "red";

        }else if(str.startsWith("blue")){

            return "blue";

        }else{

            return  "";
        }

    }
}
