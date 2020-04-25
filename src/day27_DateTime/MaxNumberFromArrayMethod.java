package day27_DateTime;

public class MaxNumberFromArrayMethod {

    public static void main(String[] args) {

        int [] arr = {1,90,67,98,17,-1,0};

       int max =  maxNumber(arr);

        System.out.println(max);

        double [] arr1 = {1.1,2.3,9.0,4.5,8.9,5.6};

        double max1 = maxNumber(arr1);

        System.out.println(max1);

    }
    //method that returns max number from an int array as an int

    public static int maxNumber(int [] arr){

        int max = arr[0];

        for(int i = 0; i < arr.length; i++){

            if(max < arr[i]){

                max = arr[i];
            }
        }


        return max;
    }

    //method that returns max number from a double array as a double

    public static double maxNumber(double [] arr){

        double max = arr[0];

        for(int i = 0; i < arr.length; i++){

            if(max < arr[i]){

                max = arr[i];
            }
        }


        return max;
    }
}
