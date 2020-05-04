package OfficeHours_Saim.day1;

public class right2 {

    public static void main(String[] args) {
        /*
        Given a string, return a "rotated right 2" version where
         the last 2 chars are moved to the start. The string length
         will be at least 2.


right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"
         */
        String str = "java";

       String str1 =  right2(str);

        System.out.println(str1);
    }

    public static String right2(String str){

        if(str.length() == 0){

            return "";

        }else if(str.length() <= 2){

            return str;

        }else if(str.length() > 2){

            return str.substring(str.length()-2) + str.substring(0,str.length()-2);

        }else{

            return "";
        }
    }
}
