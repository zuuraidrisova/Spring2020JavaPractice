package OfficeHours_Saim.day1;

public class middleTWO {
    public static void main(String[] args) {

        /*

Given a string of even length, return a string made of the middle
two chars, so the string "string" yields "ri". The string length will be at least 2.


middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
         */
        String s = "pick";

        String mid = middleTwo(s);

        System.out.println(mid);
    }

    public static String middleTwo(String str){

        if(str.length() % 2 == 0){

            int mid = str.length() / 2;

            return str.substring(mid-1,mid+1);

        }

            return str;



    }
}
