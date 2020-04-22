package Replit_Practices;
import java.util.Scanner;
public class Replit075 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String result ="";

        boolean endsWithX =(""+  word.charAt(word.length()-1)).equalsIgnoreCase("X");
        boolean startWithX = (""+word.charAt(0)).equalsIgnoreCase("x");

        if(endsWithX && startWithX){
            result= word.substring(1, word.length()-1);
        } else if(endsWithX){
            result = word.substring(0, word.length()-1);
        } else if(startWithX){
            result = word.substring(1);
        }else{
            result = word;
        }

        System.out.println(result);




    }
}
