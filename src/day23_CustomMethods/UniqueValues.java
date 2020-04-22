package day23_CustomMethods;

import java.util.Arrays;

public class UniqueValues {
    public static void main(String[] args) {
        /*
          Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
         */

        String [] arr = { "A","B","A","C","D","E","F","B" };

        for(String each2 : arr){//EACH ELEMENT IN THE ARRAY

            int count = 0;

            for(String each : arr){//EACH ELEMENT IN THE ARRAY

                if(each.equals(each2)){
                    count++;
                }

            }

            if(count == 1){

                System.out.println(each2);
            }
        }


        System.out.println("================================");


        String [] arr2 = { "Ali","Ali","Sary","Zuura"};

        for(int j = 0; j < arr2.length; j++){

            int counter = 0;

            for(int i = 0; i < arr2.length; i++){

                if(arr2[i].equals(arr2[j])){

                    counter++;
                }

            }

            if(counter == 1){
                System.out.println(arr2[j]);
            }

        }


        System.out.println("=====================");

        //String str = "AAABBCC" ==>Frequency

        String str = "AAABBCC";

        char [] ch = str.toCharArray();

        System.out.println(Arrays.toString(ch));

        int count1 = 0;

        for(char each2  : ch){

            for(char each : ch){

                if(each == each2){

                    count1++;
                }


            }

        }


        System.out.println(count1);

    }
}
