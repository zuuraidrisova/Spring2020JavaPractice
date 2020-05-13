package OfficeHours_Saim.day1_StringsLoops;

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
        int a = 2;

       String b =  nTwice(str,a);

        System.out.println(b);

        String str2 = "Chocolate";
        int c = 3;

        String n = nTwice(str2,c);

        System.out.println(n);


    }
    public static String nTwice(String str, int n) {//my solution
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

    public String nTwice1(String str, int n) {//great solution

        String front = str.substring(0, n);
        String end = str.substring(str.length()-n);


        return front + end;
    }
}
