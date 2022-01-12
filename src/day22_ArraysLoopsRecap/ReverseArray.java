package day22_ArraysLoopsRecap;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        /*
        write a program that can reverse the array
         */

        String [] names = {"Zuura","Sary","Asan","Alina"};

        String reverse = "";

        for (int i = names.length-1; i >= 0; i--){

            reverse  += names[i]+" ";
        }

        System.out.println(reverse);


        //reversing integers in array

        int [] arr = {1,2,3,4,5};

        for(int  i = arr.length-1; i >= 0; i--){

            int eachNum = arr[i];

            System.out.println(eachNum);

        }
        System.out.println("=====================");

        int [] reversedArr =  new int [arr.length];

        int j = arr.length-1;

        for(int i = 0 ;  i < arr.length; i++){

            reversedArr [i] = arr[j];

            j--;
        }

        System.out.println(Arrays.toString(reversedArr));
    }
}
