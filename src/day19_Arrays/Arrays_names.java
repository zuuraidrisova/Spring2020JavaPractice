package day19_Arrays;

import java.util.Scanner;

public class Arrays_names {
    public static void main(String[] args) {

        //array of student with length of 10, using Scanner
        Scanner scan = new Scanner (System.in);
        String [] students = new String [5];
        for(int i = 0; i < 5 ; i++){
            System.out.println("Enter a name: ");
            students [i] = scan.next();
        }

        for(int i = 0; i < 5; i++){
            System.out.println(students[i]);
        }

    }
}
