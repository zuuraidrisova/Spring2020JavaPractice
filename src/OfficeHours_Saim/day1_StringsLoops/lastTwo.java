package OfficeHours_Saim.day1_StringsLoops;

public class lastTwo {

    public static void main(String[] args) {

        /*

        Given a string of any length, return a new string where the last
         2 chars, if present, are swapped, so "coding" yields "codign".


lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
         */

        String str = "coding";

        String a = lastTwo(str);

        System.out.println(a);
    }

    public static String lastTwo(String str){

        if(str.length() == 0){

            return "";

        }else if(str.length() == 1){

            return str;

        }else if(str.length() == 2){

            return str.substring(str.length()-1) + str.substring(0,str.length()-1);

        }else if(str.length() > 2){

            return str.substring(0, str.length()-2)+str.substring(str.length()-1 )
                    +str.substring(str.length()-2,str.length()-1);
        }else{

            return "";
        }
    }
}
