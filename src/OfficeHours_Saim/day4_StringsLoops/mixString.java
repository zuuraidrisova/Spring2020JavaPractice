package OfficeHours_Saim.day4_StringsLoops;

public class mixString {

    /*
    Given two strings, a and b, create a bigger string made of the first char of a,
     the first char of b, the second char of a, the second char of b, and so on. Any
     leftover chars go at the end of the result.


mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
     */

    public String mixString(String a, String b) {

        int max = Math.max(a.length(), b.length());

        String c = "";

        for(int i = 0; i < max; i++){

            c += a.charAt(i) +""+b.charAt(i);
        }

        return c;
    }
}
