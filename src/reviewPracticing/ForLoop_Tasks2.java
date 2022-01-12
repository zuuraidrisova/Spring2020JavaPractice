package reviewPracticing;

import java.util.Scanner;

public class ForLoop_Tasks2 {


    public static void main(String args[]) {
            /*
            1. write a program that can print all the ODD numbers between 0 ~ 100
        that can be divisible by 3 & 5
        */
        for (int i = 0; i <= 100; i++) {

            if(i % 2 != 0){

                if(i % 3 == 0 && i % 5 == 0){

                    System.out.print(i+" ");
                }
            }
        }

        System.out.println();
            /*

        2. write a program that can print all the EVEN numbers between 0 ~
        100 that can be divisible by 3 & 5

        */

        for (int i = 0; i <= 100; i++) {

            if(i % 2 == 0){

                if(i % 3 == 0 && i % 5 == 0){

                    System.out.print(i+" ");
                }
            }
        }

        System.out.println();
            /*

        3. write a program that can calculate the sum of all the even numbers
        between 1 ~ 100

        */

            int sum = 0;

        for (int i = 0; i <= 100; i++) {

            if(i % 2 == 0){

              sum += i;
            }
        }

        System.out.println("sum of all even numbers = " + sum);

            /*

        4. write a program that can calculate the sum of all the odd numbers
        between 1 ~ 100

        */
        int sum1 = 0;

        for (int i = 0; i <= 100; i++) {

            if(i % 2 != 0){

                sum1 += i;

            }
        }

        System.out.println("sum of all odd numbers = "+sum1);

            /*
        5. Write a program that will print out all letters in English
        alphabet in ascending order

        */

            for (char i = 65; i <= 90; i++ ){

                System.out.print(i+" ");
            }

        System.out.println();
            /*

        6. Write a program that will print out all letters in English
        alphabet in descedning order

        */

        for (char i = 90; i >= 65; i-- ){

            System.out.print(i+" ");
        }

        System.out.println();

            /*
        5. Write a program that will print out all letters in English
        alphabet in ascending order

        */

        for (char i = 'a'; i <= 'z'; i++ ){

            System.out.print(i+" ");
        }

            /*

        6. Write a program that will print out all letters in English
        alphabet in descedning order

        */

        System.out.println();

        for (char i = 'z'; i >= 'a'; i-- ){

            System.out.print(i+" ");
        }

        System.out.println();

        //print alphabets as Aa, Bb etc

        String upperCase = "";
        String lowerCase = "";

        for (char ch = 'A'; ch <= 'Z'; ch++){

            upperCase += ch;

        }

        for (char ch = 'a'; ch <= 'z'; ch++){

            lowerCase += ch;

        }

        String output = "";

        for (int i = 0; i <= upperCase.length()-1; i++){

            output += upperCase.charAt(i) +""+ lowerCase.charAt(i)+" ";

        }

        System.out.println(output);
            /*


        7. write a program that can calculate the sum of all numbers between
        1 to any given number

        ex:
        input: 100
        output: 5050
        input: 50
        output: 1275
        input : 200
        output : 20100
        Aa Bb Cc Dd  ...
     */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int number = scan.nextInt();

        int sumOfAllGivenNumbers = 0;

        for(int i = 1; i <= number; i++){

            sumOfAllGivenNumbers += i;

        }

        System.out.println("sumOfAllGivenNumbers = " + sumOfAllGivenNumbers);

        //remove duplicates from string

        String str = "abababababbabbababbababbabbababccccccccccccc";

        String result = "";

        for (int i = 0; i <= str.length()-1; i++){

            if(!result.contains(str.charAt(i)+"")){

                result += str.charAt(i)+"";
            }
        }

        System.out.println("result = " + result);

        scan.close();
    }

}
