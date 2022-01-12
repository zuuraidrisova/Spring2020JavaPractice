package reviewPracticing;

import java.util.Arrays;

public class RowSum {

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

        int [] [] array = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };

        int [] rowSum = rowSum(array);

        System.out.println(Arrays.toString(rowSum));
    }

         public static int [] rowSum(int [][] array){

             int rowSum [] = new int[array.length];

             for (int i = 0;  i < array.length; i++){

                 for (int j = 0; j < array[i].length; j++){

                     rowSum[i] += array[i][j];
                 }
             }

             return  rowSum;

         }

}
