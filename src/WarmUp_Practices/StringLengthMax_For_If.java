package WarmUp_Practices;
import java.util.Scanner;
public class StringLengthMax_For_If {
    public static void main(String[] args) {
        /*
         write a program that can ask the user to "enter a word"
         five times and returns the word that has the maximum length
         */
        Scanner scan =new Scanner(System.in);

        String word = "";

        for(int i = 0; i<=word.length(); i++){
            System.out.println("Enter a word: ");
            String wordLength = scan.next();
            if(word.length()>wordLength.length()){
                word=wordLength;
            }
            System.out.println(word+ " has the longest characters");
        }


    }
}
