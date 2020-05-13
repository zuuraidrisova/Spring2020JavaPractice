package OfficeHours_Saim.day1_StringsLoops;

import java.util.Scanner;

public class theEnd {
    public static void main(String[] args) {

/*
        Given a string, return a string length 1 from its front, unless
        front is false, in which case return a string length 1 from its back.
        The string will be non-empty.


        theEnd("Hello", true) → "H"
        theEnd("Hello", false) → "o"
        theEnd("oh", true) → "o"

 */

        Scanner scan =  new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String str = scan.nextLine();
        System.out.println("Please enter true of false: ");
        boolean front = scan.nextBoolean();

        String s = theEnd(str,front);

        System.out.println(s);
    }

    public static String theEnd(String str, boolean front){

        if(front == true){

            return str.substring(0,1);

        }else{

            return str.substring(str.length()-1);
        }



    }
}
