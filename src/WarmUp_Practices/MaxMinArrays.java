package WarmUp_Practices;

import java.util.Arrays;

public class MaxMinArrays {
    public static void main(String[] args) {

      int [] arr = {1,2,3,4,5,6,7,8,9,99,-1,45,3444,233,76};

      int max = Integer.MIN_VALUE;

      for(int  i = 0; i < arr.length; i++){

          if(max < arr[i]){

              max = arr[i];
          }
      }

        System.out.println(max);

      int min = Integer.MAX_VALUE;

      for(int each : arr){

          if(min > each){

              min = each;
          }

      }

        System.out.println(min);


        Arrays.sort(arr);

        int max2 = arr[arr.length-1];

        System.out.println(max2);

        int min2 = arr[0];

        System.out.println(min2);



    }
}
