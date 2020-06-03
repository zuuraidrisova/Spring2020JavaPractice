package Replit_Practices;

import java.util.Scanner;

public class catsdosCount {

    public static void main(String[] args) {

        //print true if the "dog" and "cat" count appear the same number
        // of times in a given string

        Scanner scan  = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String str = scan.next();

        int countCat = 0;
        int countDog = 0;

        while(str.contains("cat")){

            countCat++;

            str = str.replaceFirst("cat","");

        }

        while(str.contains("dog")){

            countDog++;

            str = str.replaceFirst("dog","");

        }

        if(countCat == countDog){

            System.out.println(true);

        }else{

            System.out.println(false);
        }


    }
}
