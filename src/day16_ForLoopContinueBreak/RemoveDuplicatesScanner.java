package day16_ForLoopContinueBreak;
import java.util.Scanner;
public class RemoveDuplicatesScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your word: ");
        String word = scan.next();
        String result = "";//we should get ab

        for (int i = 0; i <= word.length() - 1; i++) {//0,1,2,3 ==>INDEXES

            if (!result.contains("" + word.charAt(i)))

                result += word.charAt(i);//ab

        }

        System.out.println(result);
    }
}

