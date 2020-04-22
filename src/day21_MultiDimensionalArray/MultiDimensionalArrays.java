package day21_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int [] arr = {1,2,3};//one dimensional array

        int [] [] arr2D = { {1,2,3}, {4,5,6,7}};
        //index of  array is   0   ,    1

        int num1 = arr2D[1][3];

        System.out.println(num1);

        System.out.println(arr2D.length);//2

        int [] [] arrD = { arr,{4,5,6} };//we can store one dimensional array by giving its variable name

        int arr2 [] = arrD[1]; // {4,5,6}//one dimensional array


        System.out.println(Arrays.toString(arr2));


        char [] [] ch2D = { {'A','B','C'}, {'D','E','F','G'}};

        char ch1 =  ch2D[1][0];

        System.out.println(ch1);


//                             0   1   2      0   1   2      0   1   2  ==>columns
        char [] [] ch2DD = { {'A','B','C'}, {'D','E','F'}, {'G','H','I'}};
        //                         0              1              2  ==> rows
         char ch2 = ch2DD [2][0];
        System.out.println(ch2);
         char [] ch = ch2DD[0];
        System.out.println(Arrays.toString(ch));


        int [] [] [] D3 = { { {} },{ {} }  };//three dimensional array


    }
}
