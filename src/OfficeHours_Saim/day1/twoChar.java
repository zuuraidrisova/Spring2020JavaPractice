package OfficeHours_Saim.day1;

public class twoChar {

    public static void main(String[] args) {

        /*

Given a string and an index, return a string length 2 starting at the
 given index. If the index is too big or too small to define a string
 length 2, use the first 2 chars. The string length will be at least 2.


twoChar("java", 0) → "ja"
twoChar("java", 2) → "va"
twoChar("java", 3) → "ja"
         */
    }

    public static String twoChar(String str, int index){

        if(str.length() == 0){

            return "";

        }else if( str.length() == 1){

            return str;

        }else if(str.length() ==  2 && index == 0){

            return str;

        }else if(str.length() > 2 && index == 0){

            return str.substring(0,2);

        }else if(str.length()  < 4 && index == 1){

            return str.substring(1);

        }else if( str.length() >=4 && index == 2){

            return str.substring(2);

        }else if(str.length() == 4 && index == 3){

            return str.substring(0,2);

        } else if(index == 3){

            return str.substring(str.length()-1, 0);

        }else{

            return str.substring(0,2);
        }

    }
}
