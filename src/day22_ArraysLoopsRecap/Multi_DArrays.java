package day22_ArraysLoopsRecap;

import java.util.Arrays;

public class Multi_DArrays {

    public static void main(String[] args) {
//n dimensional array contains  (n-1) dimensional arrays

        int [] arr = {1,2,3};//regular array that can contain multiple elements

        //index of elements  0 1 2   0 1 2   0 1 2
        int [][] arr2D =   {{1,2,3},{4,5,6},{7,8,9}};//two-dimensional array that can contain multiple single dimensional array
    //              index   0       1         2 ==> return single dimensional array

        int [] arr1 = arr2D[0];//assigning single dimensional array from two dimensional array to a new single dimensional array

        System.out.println(Arrays.toString(arr1));//prints any single dimensional array as a string


        System.out.println(Arrays.deepToString(arr2D));//prints two dimensional array as a string

        System.out.println(arr2D[1][1]);//prints element from single dimensional array at index 1 inside two dimensional array

        for(int each : arr2D[0]){

            System.out.print(each+" ");
        }

        System.out.println();

        for(int i = 0; i < arr2D[0].length; i++){

           int numbers =  arr2D[0][i];

            System.out.print(numbers+" ");
        }



    }
}
