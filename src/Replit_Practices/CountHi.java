package Replit_Practices;

import java.util.Scanner;

public class CountHi {
    public static void main(String[] args) {
        /*
        Print out the number of times that the string "hi"
        appears anywhere in the given string.
Example:
input: abc hi how hi
output: 2

Example:
input: hi code java please
output: 1
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String str = scan.nextLine();


        int count = 0;

        for(int i = 0;  i <= str.length()-1; i++){

            if(str.substring(i).startsWith("hi")){
                count++;
            }
        }

        System.out.println(count);
    }
}
