package OfficeHours_Saim.day1_StringsLoops;

public class withoutEnd2 {

    public static void main(String[] args) {
        /*

Given a string, return a version without both the first and last
 char of the string. The string may be any length, including 0.


withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""
         */

        String s = "ab";

        String a = withoutEnd2(s);

        System.out.println(a);
    }

    public static String withoutEnd2(String str){

        if(str.length() == 0){

            return str;

        }else if(str.length() == 1){

            return "";

        }else if(str.length() > 2){

           return str.substring(1,str.length()-1);
        }else{

            return "";
        }
    }
}
