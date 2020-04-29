package day30_ArrayList;

import java.util.Scanner;

public class sumOfDigits3 {
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

        System.out.println("Please enter a word or your sentence: ");

        String str = scan.nextLine();

        char [] ch =  str.toCharArray();

        int sum = 0;


        for(int i = 0; i < ch.length; i++){

          if(ch [i] >= 48 && ch[i] <= 57){

           int num = Integer.parseInt(""+ch[i]);

           sum += num;

          }

        }

        System.out.println(sum);



        String str2 = scan.nextLine();

        char  [] ch2 = str2.toCharArray();

        int sum2 = 0;

        for(char each : ch2){

         if(Character.isDigit(each)){

            int num =  Integer.parseInt(""+each);

            sum2 += num;

         }

        }


        System.out.println(sum2);




    }
}
