package OfficeHours_Saim.day1_StringsLoops;

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


            String word = str.substring(2);

            if(str.charAt(1) == 'b'){

                word = "b"+ word;
            }

            if(str.charAt(0) == 'a'){

                word = "a"+word;

            }

            return word;

    }
}
