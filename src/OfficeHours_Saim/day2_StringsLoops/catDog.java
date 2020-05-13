package OfficeHours_Saim.day2_StringsLoops;

public class catDog {
    public static void main(String[] args) {
        /*

Return true if the string "cat" and "dog" appear the same number
 of times in the given string.


catDog("catdog") → true
catDog("catcat") → false
         */

    }
    public static boolean catDog(String str) {

        int countDog = 0;
        int countCat = 0;

        for(int i = 0; i < str.length(); i++){

            if(str.contains("dog")){

                countDog++;

                str = str.replaceFirst("dog","");

            }
        }

        for(int j = 0; j< str.length(); j++){

            if(str.contains("cat")){

                countCat++;

                str = str.replaceFirst("cat","");
            }
        }
        if(countCat == countDog){

            return true;
        }else{

            return false;
        }
    }

    public static boolean catDog1(String str){

        int countCat = 0;
        int countDog = 0;

        for(int i = 0; i < str.length(); i++){

            if(str.contains("dog")){

                countDog++;

                str = str.replaceFirst("dog","");

            }else if(str.contains("cat")){

                countCat++;

                str =str.replaceFirst("cat","");
            }
        }

        if(countCat ==countDog){

            return true;
        }else{

            return false;
        }
    }
}
