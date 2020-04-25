package Replit_Practices;

import java.util.Arrays;

public class sortArrayDescending {

    public static void main(String[] args) {

        int [] arr = {7,2,9,6,8,3,5,4,1,0,10};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int [] arr1 = new int[arr.length];

        int k = 0;

        for(int i = arr.length-1; i >= 0 ; i--){

            arr1 [k] = arr [i];

            k++;

        }

        System.out.println(Arrays.toString(arr1));
    }
}
