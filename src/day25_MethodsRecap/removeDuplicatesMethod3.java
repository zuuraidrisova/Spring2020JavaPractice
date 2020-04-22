package day25_MethodsRecap;

import java.util.Scanner;
public class removeDuplicatesMethod3 {
    /*
     write a return method that accepts a String and removes duplicate values
     from the String
		Ex:
				RemoveDuplicate("aaabbbccc");  ==> "abc"
     */
    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = scan.next();

        String noDuplicates = removeDuplicates(word);

        System.out.println(noDuplicates);
    }
    public static String removeDuplicates(String str){

        String noDuplicates = "";

        for(int i = 0; i < str.length(); i++) {


            if (!noDuplicates.contains(""+str.charAt(i))) {

                noDuplicates += str.charAt(i);
            }
        }

        return noDuplicates;

    }
}
