package OfficeHours_Saim.day1;

public class hasBad {

    public static void main(String[] args) {
        /*

Given a string, return true if "bad" appears starting at index 0
or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx".
The string may be any length, including 0. Note: use .equals() to compare 2 strings.


hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
         */
        String str = "";

       boolean b =  hasBad(str);

        System.out.println(b);
    }

    public static boolean hasBad(String str){

         if(str.isEmpty()) {

             return false;
         }else if (str.startsWith("bad")){

            return true;

        }else if(str.substring(1).startsWith("bad")){

            return true;

        }else if(str.substring(2).contains("bad")){

            return false;

        }else{

            return false;
        }

    }
}
