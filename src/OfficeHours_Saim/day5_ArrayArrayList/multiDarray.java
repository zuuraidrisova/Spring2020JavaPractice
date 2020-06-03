package OfficeHours_Saim.day5_ArrayArrayList;

import java.util.Arrays;

public class multiDarray {
    /*
    7) Create a method that will accept a String of multiple words separated
     by a space and return a 2D array. Each array in the multidimensional
      array will have two elements: the number of uppercase letters and
       the number of lowercase letters
     */

    public static void main(String[] args) {

        String str = "The House IS Big manY WOrds";

        int [] [] count = countAll(str);

        System.out.println(Arrays.deepToString(count));

        System.out.println("==================");

        int [][] count2 = countUpperAndLower(str);

        System.out.println(Arrays.deepToString(count2));
    }

    public static int [][] countAll(String str){

        String [] words = str.split(" ");

        int [] [] count = new int[words.length][words.length];


        int index = 0;

        for(String each : words){

            int upperLetters = 0;
            int lowerLetters = 0;


            for(int  i = 0; i < each.length(); i++){

                if(Character.isUpperCase(each.charAt(i))){

                    upperLetters++;

                }else if(Character.isLowerCase(each.charAt(i))){

                    lowerLetters++;

                }
            }

            int [] singleD = {upperLetters, lowerLetters};

            count[index] = singleD;

            index++;

        }

        return count;
    }



    public static int [] countUpperLower(String word){

        int upper = 0;
        int lower = 0;

        for(int i = 0; i < word.length(); i++){

            if(Character.isUpperCase(word.charAt(i))){

                upper++;

            }else if(Character.isLowerCase(word.charAt(i))){

                lower++;
            }

        }
        int [] each = {upper, lower};

        return each;
    }

    public static int [] [] countUpperAndLower(String word){

        String[] words = word.split(" ");

        int [][] count = new int[words.length][2];

        int index = 0;

        for(String each : words){

            count[index++] = countUpperLower(each);

        }

        return count;

    }




}
