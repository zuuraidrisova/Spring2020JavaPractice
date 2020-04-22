package day23_CustomMethods;

import java.util.Arrays;

public class UniqueValues2 {

    public static void main(String[] args) {

        //print unique values from string array

        String [] arr = {"A","B","A","C","C","D"};


        for(int j = 0; j < arr.length; j++ ){

            int count = 0;

            for(int i = 0; i < arr.length; i++){

                if(arr[i].equals(arr[j])){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(arr[j]);
            }
        }


        for( String each : arr){

            int count2 = 0;

            for( String each2 : arr){

                if(each2.equals(each)){

                    count2++;
                }
            }
            if(count2 == 1){

                System.out.println(each);
            }
        }




    }
}
