package Replit_Practices;

public class AppearTwice {
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

        String target = "laptop";

        String sentence = "I would like to buy a new laptop, because my laptop is too old";

        boolean a = appearsTwice(target,sentence);

        System.out.println(a);
    }

    public static boolean appearsTwice(String target, String sentence) {

        int count = 0;

        while(sentence.contains(target)){

            count++;

            sentence = sentence.replaceFirst(target, "");

        }

        if(count == 2){

            return true;

        }else{

            return false;
        }



    }
}
