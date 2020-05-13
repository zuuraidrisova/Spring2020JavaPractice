package OfficeHours_Saim.day1_StringsLoops;

public class minCat {

    public static void main(String[] args) {

        /*

Given two strings, append them together (known as "concatenation")
and return the result. However, if the strings are different lengths,
 omit chars from the longer string so it is the same length as the
 shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.


minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
         */
    }

    public static String minCat(String a, String b){

        int count = a.length();
        int count2 = b.length();

        if(count == count2){

            return a + b;

        }else if(count > count2 -1){

            return a.substring(1) + b;

        }else if(count2 > count -1){

            return a + b.substring(1);

        }else if(count > count2 -2){

           return a + b.substring(1);

        }else{

            return "";
        }
    }
}
