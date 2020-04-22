package day24_MethodsContinue;

import java.util.Arrays;

public class ReturnMethodArray {
    public static void main(String[] args) {
        /*
        create a function  that can return the max number from given array
         */
       int [] arr = {1,0,29,39,77,-1};

       int max = maxNumber(arr);

        System.out.println(max);

        int min = minNumber(arr);

        System.out.println(min);
    }

    public static int maxNumber(int [] arr){

        int max = arr[0];

        for(int i = 0; i < arr.length; i++){

            if(max < arr[i]){

                max = arr [i];
            }
        }
        return max;
    }
    public static int minNumber(int [] arr){

        Arrays.sort(arr);

        return arr[0];
    }


}
