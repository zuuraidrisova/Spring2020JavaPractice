package day21_MultiDimensionalArray;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {

        /*
        for(dataType variableName : ArrayName){
        }
         */

        int [] nums = {1,2,3,4,5};

        for(int each : nums){

            System.out.println(each);
        }


        String [] students = {"Zuura","Asiya","Sary"};

        for(String each : students){

            System.out.println(each+" is the best");
        }


        int [] arr1 = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0; i < arr1.length; i++){

            if(arr1[i] > 5){

                System.out.print(i+" ");
            }
        }


        System.out.println();
        //we can also do the same exercise above with for each loop

        for(int each : arr1){

            if(each < 5){

                continue;
            }

            System.out.print(each+" ");
        }

        System.out.println();

        System.out.println("=======================");

        String sentence = "I like java";

        String [] str = sentence.split(" ");

        System.out.println(Arrays.toString(str));

        for(String each : str){

            System.out.println(each);
        }

        String result = "";

        for(int i = str.length-1; i >= 0; i--){

           String reversed = str[i]+" ";

           result += reversed;
        }

        System.out.println(result);
    }
}
