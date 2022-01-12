package day20_ArraysContinue;

import java.util.Arrays;

public class Array_DescendingOrder {

    public static void main(String[] args) {

        int [] arr = {3,100,-2,98,5,76};

        int [] arrDescending = new int [arr.length];//{0,0,0,0,0,0,};

        Arrays.sort(arr);//they always sort in ascending order,small to large
                        // [-2,3,5,76,98,100]==>printed
                        //   0,1,2,3, 4, 5  ==> indexes

        System.out.println(Arrays.toString(arr));

        int j = 0;

        for(int i = arr.length-1; i >= 0; i--){

          arrDescending[j] = arr[i];

          j++;
        }

        System.out.println(Arrays.toString(arrDescending));

    }
}
