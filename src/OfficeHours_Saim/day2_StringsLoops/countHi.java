package OfficeHours_Saim.day2_StringsLoops;

public class countHi {

    public static void main(String[] args) {
        /*
        Return the number of times that the string "hi" appears
         anywhere in the given string.


countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
         */

        String str = " hihi hi ho";

       int count =  countHi(str);

        System.out.println(count);
    }

    public static int countHi(String str){

        int count = 0;

        for(int i = 0; i < str.length(); i++){

            if(str.contains("hi")){

                count++;

                str = str.replaceFirst("hi", "");
            }
        }

        return count;
    }
}
