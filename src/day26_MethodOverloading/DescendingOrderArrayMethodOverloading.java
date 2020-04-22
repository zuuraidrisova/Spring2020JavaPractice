package day26_MethodOverloading;

import java.util.Arrays;

public class DescendingOrderArrayMethodOverloading {
    /*
    	5. write an int[] return method that can sort an int array in descending order
	6. write a double[] return method that can sort a double array in descending order
	7. write a char[] return method that can sort a char array in descending order
			NOTE: MUST apply method overloading
     */

    public static void main(String[] args) {

        int [] arr = {1,3,7,2,4,9,8,5,0};

        int [] desc = sortDescending(arr);

        System.out.println(Arrays.toString(desc));

        double [] arr1 = {1.0,3.0,7.0,2.0,4.0,9.0,8.0,5.0,0.0};

        double [] desc2 = sortDescending(arr1);

        System.out.println(Arrays.toString(desc2));

        char [] arr2 = {'A', 'B','E','W','T','P','L','K','H'};

        char [] arr3 = sortDescending(arr2);

        System.out.println(Arrays.toString(arr3));
    }


    public static int [] sortDescending(int [] arr){

        Arrays.sort(arr);

        int [] descending = new int [arr.length];
        int j = 0;

        for(int i = arr.length-1; i >= 0; i--){

            descending[j] = arr[i];
            j++;

        }

        return descending;

    }

    public static double [] sortDescending(double [] arr){

        Arrays.sort(arr);

        double [] descending = new double[arr.length];

        int j = 0;

        for(int i = arr.length-1; i >= 0; i--){

            descending[j] = arr[i];

            j++;
        }


        return descending;

    }

    public static char [] sortDescending(char [] arr){

        Arrays.sort(arr);

        char [] descending = new char [arr.length];

        int j = 0;

        for(int i = arr.length-1; i >= 0; i--){

            descending[j] = arr[i];

            j++;

        }

        return descending;
    }
}
