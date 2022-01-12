package day26_MethodOverloading;


public class MinNumberArrayMethodOverloading {

    public static void main(String[] args) {

        int [] arr = {1826,92971,28812,1028,192};

        int min = minNumber(arr);

        System.out.println(min);

        double [] arr1 = {1.2, 8.9, 10.11, 5.6};

        double min1 = minNumber(arr1);

        System.out.println(min1);


    }
  /*
 3. write a method that can return the minimum number from an int array
4. write a method that can return the minimum number from a double array
    NOTE: MUST apply method overloading

   */

    public static int minNumber(int [] arr){

        int min = arr[0];

        for(int each : arr){

            if(each < min){

                min = each;
            }
        }

        return min;
    }

    public static double minNumber(double [] arr){

        double min = arr[0];

        for(int i = 0; i < arr.length; i++){

            if(arr[i] < min){

                min = arr[i];
            }
        }

        return min;
    }

}
