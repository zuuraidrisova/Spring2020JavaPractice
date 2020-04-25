package day27_DateTime;

public class MinNumberFromArrayMethod {

    public static void main(String[] args) {

        int [] arr = {1,90,67,98,17,-1,0};

        int minNumber = minNumber(arr);

        System.out.println(minNumber);

        double [] arr1 = {1.1,2.3,9.0,4.5,8.9,5.6};

        double minNumber1 = minNumber(arr1);

        System.out.println(minNumber1);

    }
    //method that returns min number from an int array as an int

    public static int minNumber(int [] arr){

        int min = arr [0];

        for(int i = 0; i < arr.length; i++){

            if(min > arr[i]){

                min = arr[i];
            }
        }

        return min;
    }
    //method that returns min number from a double array as a double

    public static double minNumber(double [] arr){

        double min = arr[0];

        for(int i = 0; i < arr.length; i++){

            if(min > arr[i]){

                min = arr[i];
            }
        }

        return min;
    }
}
