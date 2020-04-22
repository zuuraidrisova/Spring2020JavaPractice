package Replit_Practices;

import java.util.Scanner;

public class Next3Method {
    public static void main(String[] args) {
        /*
        Create a method called next3 . This method gets an int argument
        and prints the next 3 numbers after that number. Call the method from main
        method and pass num to it.

enter number
1
next 3 are:
2 3 4

(put a space between numbers)
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        next3(num);
    }

    public static void next3(int num){

        System.out.print((num+1)+" "+(num+2)+" "+(num+3));
    }


}
