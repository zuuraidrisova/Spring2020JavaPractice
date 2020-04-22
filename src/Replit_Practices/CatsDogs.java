package Replit_Practices;
import java.util.Scanner;
public class CatsDogs {
    public static void main(String[] args) {
        /*
        Print true if the string "cat" and "dog" appear
        the same number of times in the given string word.
Example:
input: catdog
output: true

Example:
input: catcat
output: false

Example:
input: cat-cheetah-dog-cat
output: false
         */
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

       for(int i = 0; i <= word.length()-1; i++){
           if(word.contains("dog")){
               countOfDogs++;
               word = word.replaceFirst("dog","");

           }
           if(word.contains("cat")){
               countOfCats++;
               word = word.replaceFirst("cat","");
           }


       }
       if(countOfDogs == countOfCats){
           System.out.println("true");
       }else{
           System.out.println("false");
       }


    }
}
