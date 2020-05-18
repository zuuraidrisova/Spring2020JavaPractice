package Replit_Practices;

public class atChar33 {
       /*
    at3 gets two strings and returns a string.

the first string is the one that will be manipulated.
at the 3rd char position of target you will insert the word argument.

example use:

at3("longword","foo")
will return: "lonfoogword"

at3("blabla","a")
will return: "blaabla"

     */
       public static void main(String[] args) {

           String a = "blabla";
           String b = "a";

          String c =  gets3(a,b);

           System.out.println(c);

       }

       public static String gets3(String str, String str2){

           String str3 =  str.substring(0,3) + str2 + str.substring(3);

           return str3;
       }
}
