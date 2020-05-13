package OfficeHours_Saim.day2_StringsLoops;

public class getSandwich {
    public static void main(String[] args) {
        /*

A sandwich is two pieces of bread with something in between.
Return the string that is between the first and last appearance of "bread"
 in the given string, or return the empty string "" if there are not two pieces of bread.


getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""

         */
    }

    public static String getSandwich(String str) {

        int first = str.indexOf("bread");
        int second = str.lastIndexOf("bread");

        if (second > first) {

            return str.substring(first+ "bread".length(), second);

        } else {
           return "";
        }




    }

}
