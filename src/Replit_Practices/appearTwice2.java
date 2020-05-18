package Replit_Practices;

public class appearTwice2 {
    /*

    Write a a method appearsTwice() that returns true if value of variable
    target appears only twice in the string sentence, otherwise return false.

Examples:
Main.appearsTwice("java", "java is fun!") - returns false, because java appears
only once.

Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop
is too old.") - returns true, because laptop appears twice.

     */
    public static void main(String[] args) {

        String str =  "I would like to buy a new laptop, because my laptop is too old.";
        String s = "laptop";

        boolean b = appearTwice(str,s);

        System.out.println(b);
    }
    public static boolean appearTwice(String str, String s){

        int count = 0;

        while (str.contains(s)){

            count++;

            str = str.replaceFirst(s,"");
        }

        if(count == 2){

            return true;

        }else{

            return false;
        }

    }
}
