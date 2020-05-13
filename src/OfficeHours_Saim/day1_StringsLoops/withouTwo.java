package OfficeHours_Saim.day1_StringsLoops;

public class withouTwo {
    public static void main(String[] args) {
        /*

Given a string, if a length 2 substring appears at both its beginning
and end, return a string without the substring at the beginning, so
"HelloHe" yields "lloHe". The substring may overlap with itself, so
"Hi" yields "". Otherwise, return the original string unchanged.


without2("HelloHe") → "lloHe"
without2("HelloHi") → "HelloHi"
without2("Hi") → ""
         */

        String str = "Hi";

        String a = without2(str);

        System.out.println(a);
    }

    public static String without2(String str){

        if(str.length() < 2){

            if(str.length() == 1 && str.equals("x")){

                return "x";

            }else{

                return "";
            }

        }else if( str.length() > 2){

            if(str.substring(0,2).equals(str.substring(str.length()-2))){

                return str.substring(2);

            }else{

                return str;
            }

        }else{

            return "";

        }
    }
}
