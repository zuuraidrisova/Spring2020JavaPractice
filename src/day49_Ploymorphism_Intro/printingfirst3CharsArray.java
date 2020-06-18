package day49_Ploymorphism_Intro;

import java.util.Scanner;

public class printingfirst3CharsArray {

    public static void main(String[] args) {


        String [] arr = {"apple","banana","thank you", "hello"};

        for(int i = 0; i < arr.length; i++){

            String threeChars = arr[i].substring(0,3);

            System.out.println(threeChars);
        }

        System.out.println("===========================================");

        Scanner scan = new Scanner(System.in);

        String [] words = {scan.next(), scan.next(),scan.next(),scan.next()};

        for(String each :  words){

           String word = each.charAt(0)+""+each.charAt(each.length()-1);

            System.out.println(word);
        }


    }
}
