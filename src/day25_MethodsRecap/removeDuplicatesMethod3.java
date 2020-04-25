package day25_MethodsRecap;

import java.util.Arrays;
import java.util.Scanner;
public class removeDuplicatesMethod3 {
    /*
     write a return method that accepts a String and removes duplicate values
     from the String
		Ex:
				RemoveDuplicate("aaabbbccc");  ==> "abc"
     */
    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = scan.next();

        String noDuplicates = removeDuplicates(word);

        System.out.println(noDuplicates);

        System.out.println("===================");

        String noDuplicates2 = removeDuplicates2(word);

        System.out.println(noDuplicates2);

        System.out.println("===================");

        String noDuplicates3 = removeDuplicates3(word);

        System.out.println(noDuplicates3);

        System.out.println("===================");

        String str1 = "zuura zuura zuura zuura zuura";

        String str2 = "zuura";

        int count = frequency(str1,str2);

        System.out.println(count);

        System.out.println("===================");

        int count2 = frequency1(str1,str2);

        System.out.println(count2);

        System.out.println("===================");

        int count3 = frequency3(str1,str2);

        System.out.println(count3);


    }
    public static String removeDuplicates(String str){

        String noDuplicates = "";

        for(int i = 0; i < str.length(); i++) {


            if (!noDuplicates.contains(""+str.charAt(i))) {

                noDuplicates += str.charAt(i);
            }
        }

        return noDuplicates;

    }
    public static String removeDuplicates2(String str){//using charAt()

        String noDuplicates = "";

        for(int i = 0; i < str.length(); i++){

            if(!noDuplicates.contains(""+str.charAt(i))){

                noDuplicates += str.charAt(i);
            }
        }

        return noDuplicates;
    }
    public static String removeDuplicates3(String str){//using substring()

        String noDuplicates = "";

        for(int i = 0; i < str.length(); i++){

            if(! noDuplicates.contains(str.substring(i, i+1))){

                noDuplicates += str.substring(i,i+1);
            }
        }
        return noDuplicates;
    }

    public static int frequency(String str1, String str2){//for loop
        int count = 0;

        for(int i = 0; i < str1.length(); i++){

            if(str1.contains(str2)){

                count++;

                str1 = str1.replaceFirst(str2,"");
            }
        }

        return count;
    }

    public static int frequency1(String str1, String str2){//while loop

        int count = 0;

        while(str1.contains(str2)){

            count++;

            str1 = str1.replaceFirst(str2,"");
        }

        return count;
    }

    public static int frequency3(String str1, String str2){

        int count = 0;

        String [] arr = str1.split(" ");

        for(String each : arr){

            if(each.contains(str2)){

                count ++;
            }

        }

        return count;
    }

}
