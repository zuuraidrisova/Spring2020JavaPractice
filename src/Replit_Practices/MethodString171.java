package Replit_Practices;

public class MethodString171 {

    /*
    This method gets a string and an int, it returns a string.

what it dose is limit the inputted string to a certain number of characters.

for example:

limit("abcd",2)
returns "ab"

limit("bla bla",3)
returns "bla"
     */

    public static void main(String[] args) {

        String text  = "bla bla";
        int  maxLength = 3;


       String limit =  limit(text,maxLength);

        System.out.println(limit);
    }

    public static String limit(String text, int maxLength) {

        String limit = "";

        for (int i = 0; i < maxLength; i++){

              limit += text.charAt(i);

        }

        return limit;
    }
}
