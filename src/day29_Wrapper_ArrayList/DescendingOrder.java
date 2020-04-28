package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class DescendingOrder {

    public static void main(String[] args) {

        int [] arr = {12,90,34,19,0};//5

        Arrays.sort(arr);//0,12,19,34,90

        System.out.println(Arrays.toString(arr));

        int [] ascending = new int[arr.length];//4

        int j = 0;

        for(int i = arr.length-1; i >= 0; i--){

            ascending[j] = arr[i];

            j++;
        }

        System.out.println(Arrays.toString(ascending));



    }


}
