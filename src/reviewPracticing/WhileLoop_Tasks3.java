package reviewPracticing;

import java.util.Scanner;

public class WhileLoop_Tasks3 {

    public static void main(String[] args) {

         /*
        write a program that can check if user entered a string of text is palindrome
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = scanner.next();

        String reversed = "";

        int lastIndex = word.length()-1;

        while (lastIndex >= 0){


            reversed += word.charAt(lastIndex);

            lastIndex--;

        }

        System.out.println(reversed);

        if (word.equals(reversed)){

            System.out.println("palindrome");

        }else{

            System.out.println("not a palindrome");
        }

        /*
        ask the user to enter yes or no
        if the user enters other than yes or no
        repeat the question
         */

        scanner = new Scanner(System.in);

        System.out.println("Enter yes or no: ");
        String str = scanner.next();

        while (!(str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("no"))){


            System.out.println("Re-enter yes or no: ");
            str = scanner.next();

            if (str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("no")){

                System.out.println("you entered yes or no");
                break;

            }
        }

        scanner.close();

        //count how many times java is used
        String string = "Java is fun, Java is cool".toLowerCase();//abcd

        int count = 0;

        while (string.contains("Java")){

            count++;

            string.replaceFirst("Java","");

        }

        System.out.println("count = " + count);


    }
}
