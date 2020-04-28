package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class difference {

    public static void main(String[] args) {

        /*

        Default values:

                0 : byte, short, int, long
             0.0 :  float, double
            false:  boolean
            " " : char --> empty space

        Default Values of  all Wrapper class is null!!


        wrapper class is object vs primitive is primitive data type

         */


        boolean [] arr = new boolean[3];
        //default value is false;

        System.out.println(Arrays.toString(arr));

        int [] arr1 = new int[3];

        System.out.println(Arrays.toString(arr1));

        double [] arr2 = new double[3];

        System.out.println(Arrays.toString(arr2));

        System.out.println("=========================");

        Boolean [] arr3 = new Boolean[3];
        //default value is null

        System.out.println(Arrays.toString(arr3));

        Integer [] arr4 = new Integer[3];

        System.out.println(Arrays.toString(arr4));

        Double [] arr5 = new Double[3];

        System.out.println(Arrays.toString(arr5));
    }
}
