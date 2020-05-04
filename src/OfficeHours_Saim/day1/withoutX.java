package OfficeHours_Saim.day1;

public class withoutX {
    public static void main(String[] args) {
        /*

Given a string, if the first or last chars are 'x',
 return the string without those 'x' chars, and otherwise return the string unchanged.


withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
         */

    }

    public static String withoutX(String str) {

       if(!str.startsWith("x") && str.endsWith("x")){

           str.substring(0, str.length()-1);

       }else if(str.startsWith("x") && ! str.endsWith("x")){

           str.substring(1);

       }else if(str.startsWith("x") && str.endsWith("x")){

            return str.substring(1, str.length()-1);

        }else{

           return str;
       }
        return "";

    }
}
