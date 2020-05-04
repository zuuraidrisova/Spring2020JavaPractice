package OfficeHours_Saim.day1;

public class withoutX2 {

    public static void main(String[] args) {

        /*

Given a string, if one or both of the first 2 chars is 'x',
 return the string without those 'x' chars, and otherwise
  return the string unchanged. This is a little harder than it looks.


withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"

         */
    }

    public static String without2X(String str){

        if(str.startsWith("x") && str.substring(1).equals("x")){

            return str.substring(2);

        }else if(!str.startsWith("x") && str.substring(1).equals("x")){

            return str.substring(0,1) + str.substring(2);

        }else if(str.startsWith("x")){

            return str.substring(1);

        }else if(!str.startsWith("x") && !str.substring(1).equals("X")){

            return str;
        }else{

            return "";
        }
    }
}
