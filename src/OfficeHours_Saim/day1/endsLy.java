package OfficeHours_Saim.day1;

public class endsLy {
    public static void main(String[] args) {
        /*
        Given a string, return true if it ends in "ly".


endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false

         */

        String str = "happily";

        System.out.println(endsLy(str));
    }
    public static boolean endsLy(String str){

        if(str.endsWith("ly")){

            return true;
        }else{

            return false;
        }
    }
}
