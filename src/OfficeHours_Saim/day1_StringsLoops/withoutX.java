package OfficeHours_Saim.day1_StringsLoops;

public class withoutX {
    public static void main(String[] args) {
        /*

Given a string, if the first or last chars are 'x',
 return the string without those 'x' chars, and otherwise return the string unchanged.


withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
         */

        String str = "";

       String a =  withoutX(str);

        System.out.println(a);

    }

    public static String withoutX(String str) {

        if(!str.startsWith("x") && str.endsWith("x")){

            return str.substring(0, str.length()-1);

        }else if(str.startsWith("x") && ! str.endsWith("x")){

            return str.substring(1);

        }else if(str.length() > 1){

            if(str.startsWith("x") && str.endsWith("x")){

                return str.substring(1, str.length()-1);

            }else{

                return str;

            }

        }else if(str.length() == 1 && str.equals("x")){

            return "";
        }else{

            return str;
        }

    }
}
