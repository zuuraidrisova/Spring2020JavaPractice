package reviewPracticing;

import java.util.Scanner;

public class ForLoop_Tasks {

    public static void main(String[] args) {

        //1. Write a program that displays each even/odd number in popup between 1 and 32

        for(int i = 1; i <= 32; i++){

            if(i % 2 == 0){

                System.out.println(i);
            }
        }

        System.out.println("=====================================");

        for(int i = 1; i <= 32; i++){

            if(i % 2 != 0){

                System.out.println(i);
            }
        }

        System.out.println("=====================================");

        for(int i = 1; i <= 5; i++){

            System.out.println("Hello world");
        }

        System.out.println("=====================================");

        /*
        write a program to identify if a string is palindrome or not.
         if yes==> true,.otherwise ==> false
                level ==> level ==> palindrome
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String str = scan.next();

        String reversed = "";

        for(int i = str.length()-1; i >= 0; i--){

            reversed += str.charAt(i);

        }

        System.out.println(reversed);

        if(str.equals(reversed)){

            System.out.println("It is palindrome");
        }else{

            System.out.println("It is not palindrome");
        }

        scan.close();

        /*
2. Write a program that the user to declare a positive integer. It should then print the
multiplication table of that number.
         */



    }
}
