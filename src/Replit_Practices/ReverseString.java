package Replit_Practices;
import java.util.Scanner;
public class ReverseString {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        String word =scan.next();

        int reversed = word.length();

        if(reversed == 5){
            String reversedWord = ""+ word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);
            System.out.println(reversedWord);
        }else if(reversed > 5){
            System.out.println("Too long!");
        }else{
            System.out.println("Too short!");
        }


    }
}
