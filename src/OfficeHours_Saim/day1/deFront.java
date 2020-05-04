package OfficeHours_Saim.day1;

public class deFront {
    public static void main(String[] args) {

        /*

Given a string, return a version without the first 2 chars.
 Except keep the first char if it is 'a' and keep the second
  char if it is 'b'. The string may be any length. Harder than it looks.


deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
         */
    }
    public static String deFront(String str){

        if(str.startsWith("a")){

            return str.substring(0,1)+ str.substring(2);

        }else if(str.substring(1).equals("b")){

            return str.substring(1);

        } else if(str.length() == 0){

            return "";

        }else{

           return  str.substring(2);
        }
    }
}
