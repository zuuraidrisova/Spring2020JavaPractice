package Replit_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class addElements {
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

        int [] a = {10,40,50,3,1};
        int [] b = {11,0,500,44,1101};

        int newArr [] = addElements(a,b);

        System.out.println(Arrays.toString(newArr));
    }
    public static int[] addElements(int[] ints1, int[] ints2) {

        int [] newArray = new int [ints1.length];

        for(int i = 0; i < ints1.length && i < ints2.length; i++){

           // for(int j = 0; j < ints2.length; j++){

                newArray[i]  = ints1[i] + ints2[i];

           // }
        }

        return newArray;

    }
}
