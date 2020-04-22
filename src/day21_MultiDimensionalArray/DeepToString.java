package day21_MultiDimensionalArray;

import java.util.Arrays;

public class DeepToString {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3};

        System.out.println(Arrays.toString(arr1));//can convert only one dimensional array

        int [] [] arr2D = { {1,2,3},{4,5,6,7} };

        System.out.println(Arrays.deepToString(arr2D));

            //                     0        1              0           1
        int [] [] [] arr3D = { { {1,2,3},{4,5,6,7} }, { {8,9,10}, {11,12,13}} };//three dimensional array had 2 dimensional array in it
            //                          0                        1

        System.out.println(Arrays.deepToString(arr3D[1]));//bcs this is two dimensional array

        System.out.println(Arrays.toString(arr3D [0][1]));//bcs this is single dimensional array

       int num1 =  arr3D[1][1][2];//retrieving single element
        System.out.println(num1);


    }
}
