package OfficeHours_Saim.day1_StringsLoops;

public class extraFront {
    public static void main(String[] args) {
        /*
        Given a string, return a new string made of 3 copies of the
        first 2 chars of the original string. The string may be any length.
        If there are fewer than 2 chars, use whatever is there.


extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH"
         */
        String str = "a";

        String extra = extraFront(str);

        System.out.println(extra);
    }

    public static String extraFront(String str){

        if(str.length() == 1){

            return str+str+str;

        }else if(str.length() >= 2){

            String str1 = str.substring(0,2);

            return str1+str1+str1;

        }else{

            return "";

        }

    }
}
