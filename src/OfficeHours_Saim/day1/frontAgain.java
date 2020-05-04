package OfficeHours_Saim.day1;

public class frontAgain {

    public static void main(String[] args) {
        /*

Given a string, return true if the first 2 chars in the string also
 appear at the end of the string, such as with "edited".


frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true
         */

        String str = "ed";

        boolean a = frontAgain(str);

        System.out.println(a);
    }
    public static boolean frontAgain(String str){


        if(str.length() == 1){

            return false;

        }else if(str.length() == 2){

            return true;

        }else if(str.length() > 2){


            if(str.substring(0,2).equals(str.substring(str.length()-2))){

                return true;
            }else{

                return false;
            }

        }else if(str.contains("")){

            return false;

        }else{
            return false;
        }
    }
}
