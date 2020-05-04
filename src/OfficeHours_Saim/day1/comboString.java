package OfficeHours_Saim.day1;

public class comboString {

    public static void main(String[] args) {

        /*

Given 2 strings, a and b, return a string of the form short+long+short,
 with the shorter string on the outside and the longer string on the inside.
  The strings will not be the same length, but they may be empty (length 0).


comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"
         */
        String a = "Hello";
        String b = "Hi";

      String c =   comboString(a,b);

        System.out.println(c);
    }

    public static String comboString(String a, String b){

        if(a.length() == 0 && b.length() > 1){

            return b;

        }else if(a.length() > 1 && b.length() == 0){

            return a;

        }else if(a.length() >  b.length() ) {

            return b + a + b;

        }else if(b.length() > a.length()){

            return a + b + a;
        }else{

            return "";
        }

    }
}
