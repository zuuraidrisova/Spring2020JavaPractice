package day29_Wrapper_ArrayList;

public class FindMinValue {

    public static void main(String[] args) {

      /*
        String[] arr = {"1","2.5", "3", "3.5", "4.5"}
        find the maximum and minimum numbers
        NOTE: Do not use sort method

       */

       String[] arr = {"1","2.5", "3", "3.5", "4.5"};

        double min1 = Double.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){

           double num =  Double.parseDouble(arr[i]);

            if(num < min1){

                min1 = num;

            }

        }

        System.out.println(min1);


        double [] arr1 = {1.2, 2.4, 6.7, 3.3, 9.0};

        double min = Double.MAX_VALUE;

        for(double each : arr1){

            if(each < min){

                min = each;
            }
        }

        System.out.println(min);

        double min2 = Double.MAX_VALUE;

        for(int i = 0; i < arr1.length; i++){

            if(arr1[i] < min2){

                min2 = arr1[i];
            }
        }

        System.out.println(min2);








    }
}
