package Replit_Practices;

public class BiggerString173 {
    /*
    the method gets two strings and return the longest one

biggerS("apple","orange") ==> "orange"


     */
    public static void main(String[] args) {

        String a = "apple";
        String b = "orange";

        String big = biggerS(a,b);

        System.out.println(big);
    }
    public static String biggerS(String a ,String b) {


        int x = a.length();
        int y = b.length();

        if (x > y) {

            return a;
        } else {

            return b;
        }
    }
}
