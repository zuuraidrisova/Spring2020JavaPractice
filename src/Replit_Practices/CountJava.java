package Replit_Practices;
import java.util.Scanner;
public class CountJava {
    public static void main(String[] args) {
        /*
        Return the number of times that the string "java"
        appears anywhere in the given string word.

Example:
input: javaxjava
output: 2

Example:
input: javaxjavaapplepearjavaegg
output: 3
         */
        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int count = 0;

        for(int i = 0;  i <= word.length()-1; i++){
            if(word.contains("java")){
                count++;
                word = word.replaceFirst("java","");
            }

        }
        System.out.println(count);;






    }
}
