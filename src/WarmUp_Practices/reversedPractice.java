package WarmUp_Practices;

import java.util.Scanner;

public class reversedPractice {
    public static void main(String[] args) {
        /*
         write a program that can reverse the following string:
				String str = "Java";
				output: avaJ
			please provide two solutions:
						first solution, you MUST use substring method
						second solution, you MUST use charAt method
         */
        //Scanner scan = new Scanner(System.in);
        //System.out.println("Please enter a word: ");
        String word =  "Java";

        String reversed = word.substring(3)+word.substring(2,3)+word.substring(1,2)
                +word.substring(0,1);
        System.out.println(reversed);

        String reversed2 =""+ word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);

        System.out.println(reversed2);
    }
}
