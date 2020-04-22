package day22_ArraysLoopsRecap;

import java.util.Arrays;

public class Multi_DArrays2 {
    public static void main(String[] args) {

        int [][] arr2D =   {{1,2,3},{4,5,6},{7,8,9}};


        for(int i = 0; i < arr2D[0].length; i++){

            System.out.println(arr2D[0][i]);
        }

        for(int i = 0; i < arr2D[1].length; i++){

            System.out.println(arr2D[1][i]);
        }

        for(int i = 0; i < arr2D[2].length; i++){

            System.out.println(arr2D[2][i]);
        }

        // all three for loops can be done with nested loop like below

        for(int j = 0; j < arr2D.length; j++){

            for(int i = 0; i < arr2D[j].length; i++){

                System.out.println(arr2D[j][i]);
            }
        }

        //numbers in arrays and arrays in a reverse order

        for(int j = arr2D.length-1; j >= 0; j --){

            for(int i = arr2D[j].length-1; i >= 0; i-- ){

                System.out.print(arr2D[j][i]+ " ");
            }
        }
        System.out.println();


        for(int i = arr2D[2].length-1; i >= 0; i--){

            System.out.println(arr2D[2][i]);
        }


        for(int [] eachArray : arr2D){

           for(int eachElement : eachArray){

               System.out.print(eachElement+ " ");
           }
        }

        System.out.println();


        System.out.println(Arrays.deepToString(arr2D));



        for(int [] eachArray : arr2D){

            System.out.println(Arrays.toString(eachArray));
        }

    }


}
