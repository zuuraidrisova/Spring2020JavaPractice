package OfficeHours_Saim.day2_StringsLoops;

import java.util.Arrays;

public class rowSum {

    public static void main(String[] args) {


      int [] [] array = {

              {1,2,3},
              {4,5,6},
              {7,8,9}
                        } ;


      int [] arr = new int [array.length];


      for(int i = 0; i < array.length; i++){

          for(int j = 0; j < array[i].length; j++){

              arr[i] += array[i][j];

          }
      }

        System.out.println(Arrays.toString(arr));


    }
}
