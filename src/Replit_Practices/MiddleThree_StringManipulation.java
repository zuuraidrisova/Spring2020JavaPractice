package Replit_Practices;
import java.util.Scanner;
public class MiddleThree_StringManipulation {
    public static void main(String[] args) {
        /*
 You have a word, do the following:

If the word has odd number of characters
and has 5 or more characters, print the middle three
characters of the word.

Otherwise print "invalid".

fifteen ==> fte
apple ==> ppl
hey ==> invalid
java ==> invalid
whatsup ==> ats
$ ==> invalid
         */
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int mid =  word.length()/2;

        if(word.length()%2 !=0 && word.length() >= 5){

            System.out.println(word.substring(mid-1, mid+2));

        }else{

            System.out.println("invalid");
        }






    }
}

