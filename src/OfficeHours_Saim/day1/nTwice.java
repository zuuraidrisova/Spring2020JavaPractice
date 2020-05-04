package OfficeHours_Saim.day1;

public class nTwice {
    public static void main(String[] args) {

        /*

Given a string and an int n, return a string made of the first and
 last n chars from the string. The string length will be at least n.


nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce"
         */

        String str = "hello";
        int a = 3;

       String b =  nTwice(str,a);

        System.out.println(b);
    }
    public static String nTwice(String str, int n) {
        if(n == 4){

            return str.substring(0,4) + str.substring(str.length()-4);

        } else if(n == 3){

            return str.substring(0,3) + str.substring(str.length()-3);

        }else if(n == 2){

            return str.substring(0,2) + str.substring(str.length()-2);

        }else if(n == 1){

            return str.substring(0,1) + str.substring(str.length()-1);
        }else{
            return "";
        }

    }
}
