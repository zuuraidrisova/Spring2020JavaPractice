package InterviewQuestions;

import java.util.Arrays;

public class sortNumberLetter {
    /*
    Given alphanumeric String, we need to split the string into
     substrings of consecutive letters or numbers, sort the individual
      string and append them back together

Ex:

Input:  "DC501GCCCA098911"

OutPut: "CD015ACCCG011899"
     */

    public static void main(String[] args) {

        String str = "DC501GCCCA098911";

        char ch [] = str.toCharArray();

        Arrays.sort(ch);

        String result = "";

        for(int  i = 0; i < ch.length; i++){

            result += ch[i];
        }

        System.out.println(result);
    }
}
