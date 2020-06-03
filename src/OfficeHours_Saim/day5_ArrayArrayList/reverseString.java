package OfficeHours_Saim.day5_ArrayArrayList;

public class reverseString {
    /*
    6) Create a method that will accept a String of multiple words separated
     by a space and return the String with which part reversed.

     ex: "The house is big ";
     output: "ehT esuoh si gib"


     */

    public static void main(String[] args) {


        String str = "The house is big";

        String reversed = reverseEachString(str);

        System.out.println(reversed);

        String reversed2 = reverseEachWord(str);

        System.out.println(reversed2);
    }

    public static String reverseEachString(String str){

        String [] arr = str.split(" ");

        String reverse = "";

       for(String each : arr){

           for(int i = each.length()-1; i >= 0; i--){

               reverse += each.charAt(i);
           }

       }

       return reverse;
    }

    public static String reverseEachWord(String str){

        String [] arr = str.split(" ");

        String reversed = "";

        for(String each: arr){

            String rev = "";

            for(int i = each.length()-1; i >= 0; i--){

                rev += each.charAt(i);
            }

            reversed += rev+" ";

        }

        return reversed;
    }

    public static String reverse(String str){

        String rev = "";

        for(int  i = str.length()-1; i >= 0; i--)
        {

            rev += str.charAt(i);

        }

        return rev;
    }
}
