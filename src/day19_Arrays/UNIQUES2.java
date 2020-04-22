package day19_Arrays;

import java.util.Scanner;

public class UNIQUES2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a word: ");
        String str = scan.next();

        String result = "";//to store  the uniques characters

        for(int j = 0; j <= str.length()-1; j++) {
            char ch1 = str.charAt(j);
            int count = 0;//to count occurrence  of the character

            for (int i = 0; i <= str.length()-1; i++) {
                char ch = str.charAt(i);

                if (ch == ch1) {//check how many times the character is occurred in the string
                    count++;
                }

            }
            if (count == 1) {//if the character at index j is unique it will concatenated to the result
                result += ch1;
            }
        }
        System.out.println(result);











    }
}
