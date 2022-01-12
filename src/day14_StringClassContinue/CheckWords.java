package day14_StringClassContinue;

import java.util.Scanner;
public class CheckWords {
    /*
     Write a program CheckWords:
	Program accepts 3 words and :
	- if they are same length:      print "All words are same length"
	- if some same length and others not:    print "Not Same nor Different lengths"
	- if all different length :  print "All different length"
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first word: ");
        String first = scan.next();
        System.out.println("Please enter second word: ");
        String second = scan.next();
        System.out.println("Please enter third word: ");
        String third = scan.next();

        int length1 = first.length();
        int length2 = second.length();
        int length3 = third.length();

        if(length1 ==length2 && length2 == length3){
            System.out.println("All words are same length");

        }else if(length1 != length2 && length2!=length3 && length1 != length3 ){
            System.out.println("All different length ");

        }else{
            System.out.println("Nor same length, nor different");
        }


    }
}
