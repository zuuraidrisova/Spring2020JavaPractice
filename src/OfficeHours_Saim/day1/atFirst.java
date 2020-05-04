package OfficeHours_Saim.day1;

public class atFirst {
    public static void main(String[] args) {

        /*

        Given a string, return a string length 2 made of its first 2 chars.
         If the string length is less than 2, use '@' for the missing chars.


atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"
         */

        String str = "hi";

        String a = atFirst(str);

        System.out.println(a);
    }
    public static String atFirst(String str){

        if(str.length() == 0){

            return "@@";
        }else if(str.length() == 1){

            return str+"@";

        }else if(str.length() == 2){

            return str;

        }else if(str.length() > 2){

            return str.substring(0,2);
        }else{

            return str.substring(0,2);
        }
    }
}
