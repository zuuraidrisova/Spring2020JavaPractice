package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {

        int [] arr1D = {1,2,3,4}; //in single dimensional array contains single elements

        int [] [] arr2D = { {1,2,3}, {4,5,6}};//two dimensional array contains single dimensional arrays
        // [0] [1] index number of inner array , and second brackets represent index number of elements


        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(arr2D[0][1]);






    }
}
