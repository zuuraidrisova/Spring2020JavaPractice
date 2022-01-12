package day30_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        /*

        write a program that can return the sum of all the digits from a string
			ex:
				input: "a1b2c3"
				output: 6
					(1+2+3= 6)
				input: "Today's date is 04/27/2020"
				output: 17
					(0+4+2+7+2+0+2+0=17)
			HINT: on ascii table, the characters between #48 ~ #57 are digits

         */

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        char [] ch = str.toCharArray();//create char array out of a string

        System.out.println(Arrays.toString(ch));

        int sum = 0;//will contain sum of all digits

       for(char each : ch){//iterate each element in array

           boolean isDigit = each >= 48 &&  each <= 57;

           if(isDigit){

                 int num = Integer.parseInt(""+each);

                 sum += num;

               }
       }

        System.out.println(sum);

    }
}
