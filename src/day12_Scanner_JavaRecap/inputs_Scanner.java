package day12_Scanner_JavaRecap;
import java.util.Scanner;
public class inputs_Scanner {

    public static void main(String[] args) {
        /*
        2. Ask user to enter two words. Then add them together and print.
                        Input:
                            one
                            eight
                        Output:
                            one eight
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your word: ");
        String word = scan.next();

        System.out.println("Enter your second word: ");
        String word2 = scan.next();

        System.out.println( word+word2);



    }
}
