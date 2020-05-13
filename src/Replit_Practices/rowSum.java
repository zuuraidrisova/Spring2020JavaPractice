package Replit_Practices;

import java.util.Arrays;

public class rowSum {

      /*
      Complete the method so that it takes in a 2-D array and returns the sums
      of the rows as an integer array.

For example, the if we run rowSums for the following 2D array:
{
  {1,1,2}, //sum = 4
  {3,1,2}, //sum = 6
  {3,5,3}, //sum = 11
  {0,1,2}  //sum = 3
}


Then we should get the following array back:
{4,6,11,3}
     */
      public static void main(String[] args) {

       int [] [] nums =    {
              {1,1,2}, //sum = 4
              {3,1,2}, //sum = 6
              {3,5,3}, //sum = 11
              {0,1,2}  //sum = 3
          };

       int a [] = rowSums(nums);

          System.out.println(Arrays.toString(a));

      }


    public static int[] rowSums(int[][] nums){


        int [] sum = new int[nums.length];

        for(int i = 0; i < nums.length; i++){

            for (int j = 0; j < nums[i].length; j++){

                sum[i] += nums[i][j];

            }
        }

        return sum;
    }
}
