package day24_MethodsContinue;


import java.util.Arrays;

public class ReverseMethod2 {
    public static void main(String[] args) {

        int [] arr = new int[10];

        for(int i = 0; i < 10; i++){

            arr[i] = i+1;
        }

        System.out.println(Arrays.toString(arr));

        reverse(arr);
    }
    //reverse an array method

    public static void reverse(int [] arr){

        int [] reverse = new int[arr.length];

        int k = 0;

        for(int j = arr.length-1; j >= 0; j --){

            reverse[k] = arr[j];
            k++;
        }

        System.out.println(Arrays.toString(reverse));



    }
}
