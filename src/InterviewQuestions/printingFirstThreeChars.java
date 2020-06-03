package InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class printingFirstThreeChars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter you words:");

        String [] array = new String[5];

        for(int i = 0; i < 5; i++){

            array[i] = scan.next();
        }

        System.out.println(Arrays.toString(array));


        for(int i = 0 ; i < array.length; i ++){

           String a =   array[i].substring(0,3);

            System.out.println(a);

        }

        System.out.println("=========================");

        System.out.println("Please enter words again: ");

        String [] arr = new String[5];

        for(int i = 0; i < 5; i++){

            arr[i] = scan.next();

        }

        System.out.println(Arrays.toString(arr));

        for(int j = 0; j < arr.length; j++){

            int count = arr[j].length();

            String b = arr[j].charAt(0) + ""+arr[j].charAt(count-1);

            System.out.println(b);
        }



    }
}
