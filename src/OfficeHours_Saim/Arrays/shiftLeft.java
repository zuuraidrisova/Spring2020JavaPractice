package OfficeHours_Saim.Arrays;

import java.util.Arrays;

public class shiftLeft {
    /*

Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
 You may modify and return the given array, or return a new array.


shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
shiftLeft([1, 2]) → [2, 1]
shiftLeft([1]) → [1]
     */
    public static void main(String[] args) {

        int [] arr = {6, 2, 5, 3};

       int arr2 [] =  shiftLeft(arr);

        System.out.println(Arrays.toString(arr2));

    }
    public static int[] shiftLeft(int[] nums) {

        if(nums.length >= 2){

            int temp = nums[0];

            for(int i = 0; i < nums.length - 1; i++)

                nums[i] = nums[i+1];

                nums[nums.length-1] = temp;
        }

        return nums;
    }
}
