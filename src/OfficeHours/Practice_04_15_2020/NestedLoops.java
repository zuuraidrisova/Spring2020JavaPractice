package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class NestedLoops {

    public static void main(String[] args) {

        char [][] ch2D = { {'A','B','C'},{'D','E','F'},{'G','H','J'}};

       //ch2D[0] ==> single dimensional array

       for(int i = 0; i < ch2D[0].length; i++){
           System.out.println(ch2D[0][i]);
       }

       for(int j =0; j < ch2D[1].length;j++){
           System.out.println(ch2D[1][j]);
       }

       for(int k = 0; k < ch2D[2].length; k++){
           System.out.println(ch2D[2][k]);
       }


        System.out.println("=========================");

       for(int x = 0; x < ch2D.length; x++){

           for(int y = 0; y < ch2D[x].length; y++) {
               System.out.println(ch2D[x][y]);
           }
       }
        System.out.println("=======================");

       for(char [] eachArray : ch2D){

           for(char eachElement : eachArray){
               System.out.println(eachElement);
           }
       }


        System.out.println("======================");

        int[][]  numbers = {
                {5,4,3,2,1},
                {10,11,12,13,14,15},
                {16,17,18,19,20},
        };

        for(int i = 0; i < numbers.length; i++){// i : index num of single dimensional arrays

            for(int j = 0; j < numbers[i].length; j++){// j : index num of each element

                int element = numbers[i][j];//we assign it to a new variable

                if( element % 2 != 0){//condition to get rid of odd numbers

                    continue;
                }
                System.out.println(element);
            }
        }

        System.out.println("===========================");

        for(int [] eachArray : numbers){//iterate thru each single dimensional array

            for(int eachNumber : eachArray){//iterate thru each element inside single dimensional array

                if(eachNumber % 2 == 0) {//condition to get rid of even numbers

                    continue;//skip
                }
                System.out.println(eachNumber);//otherwise print
            }

        }






    }
}
