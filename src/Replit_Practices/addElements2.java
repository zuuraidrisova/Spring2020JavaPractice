package Replit_Practices;

import java.util.Arrays;

public class addElements2 {
    /*
    Method addElements accepts 2 int arrays and adds each element value of
     two arrays and returns a new array. You can assume that each array has 5 elements

addElements(new int[][10, 40, 50, 3, 1],
            new int[][11, 0, 500, 44, 1101]);
--------
return array after adding values in the arrays:
             [21, 40, 550, 47, 1102]

     */
    public static void main(String[] args) {

        int [] arr1 = {10, 40, 50, 3, 1};
        int [] arr2 = {11, 0, 500, 44, 1101};

        int []  added = addElements(arr1,arr2);

        System.out.println(Arrays.toString(added));
    }

    public static int [] addElements(int [] arr1, int [] arr2){

        int [] newArray = new int [arr1.length];


        for(int i = 0; i < arr1.length && i < arr2.length; i++){

                newArray[i] = arr1[i] + arr2[i];

        }

        return newArray;

    }
}
