package Replit_Practices;

public class CleanString170 {
    /*
    This method gets two strings (text and badWord)  and returns a string.

basically what it does is take out all the occurrences of badWord in text.

for example:

clean ("one two three","two")
returns "one three"

clean ("foo bar","foo")
returns "bar"

clean ("he said bla bla bla","bla")
returns "he said "
     */

    public static void main(String[] args) {


        String text = "he said bla bla bla bla";
        String bad = "he said";

        String clean = clean(text,bad);

        System.out.println(clean);
    }

    public static String clean (String text ,String badWord) {

        if(text.contains(badWord)){

            return text.replace(badWord,"");
        }else{

            return text;
        }

    }
}
