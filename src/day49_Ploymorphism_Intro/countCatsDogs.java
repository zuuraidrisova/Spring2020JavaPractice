package day49_Ploymorphism_Intro;

import java.util.Scanner;

public class countCatsDogs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.next();

        System.out.println(word);

        int countCats = 0;
        int countDogs = 0;

        while(word.contains("cat")){

            countCats++;

            word = word.replaceFirst("cat", "");
        }

        while(word.contains("dog")){

            countDogs++;

            word = word.replaceFirst("dog","");

        }

        System.out.println("Number of cats: "+countCats);
        System.out.println("Number of dogs: "+countDogs);

        if(countCats == countDogs){

            System.out.println("number of cats and dogs are equal");
        }else{

            System.out.println("number of cats and dogs are not equal");
        }


       char firstChar =  word.charAt(0);
       char lastChar =  word.charAt(word.length()-1);

        System.out.println(firstChar+" "+lastChar);
    }
}
