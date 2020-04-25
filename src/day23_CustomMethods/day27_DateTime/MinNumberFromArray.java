package day23_CustomMethods.day27_DateTime;

public class MinNumberFromArray {

    /*
    write a return method that can return the minimum number from an int array
     */

    public static void main(String[] args) {


        int [] arr = {2,3,4,5,6,1,7,8};

        int min = minNumber(arr);

        System.out.println(min);

        double [] arr1 = {7.0,9.0,6.7, 2.1,1.2,3.3,5.5,4.4};

        double min1 = minNumber(arr1);

        System.out.println(min1);

    }
    public static int minNumber(int [] arr){

        int min = arr[0];

        for(int i = 0; i < arr.length; i++){

            if(min > arr[i]){

                min = arr[i];
            }
        }

        return min;
    }
/*
        write a return method that can return the minimum number from a double array
 */
    public static double minNumber(double [] arr){

        double min = arr[0];

        for(double each : arr){

           if(each < min){

               min = each;
           }
        }

        return min;
    }




}
