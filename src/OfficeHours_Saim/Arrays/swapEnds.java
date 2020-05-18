package OfficeHours_Saim.Arrays;

public class swapEnds {
    /*

Given an array of ints, swap the first and last elements in the array.
Return the modified array. The array length will be at least 1.


swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
swapEnds([1, 2, 3]) → [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
     */
    public int[] swapEnds(int[] nums) {

        int [] swapped = new int[nums.length];

        if(nums.length == 1){

            return nums;

        }else if(nums.length >= 2){

            for (int i = 0; i < nums.length; i++){

                swapped[i] = nums[i];
            }
            swapped[0] = nums[nums.length-1];
            swapped[swapped.length-1] = nums[0];

            return swapped;
        }else{

            return nums;
        }
    }

}
