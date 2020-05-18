package OfficeHours_Saim.Arrays;

public class fix23 {
    /*
    Given an int array length 3, if there is a 2 in the array immediately followed
     by a 3, set the 3 element to 0. Return the changed array.


fix23([1, 2, 3]) → [1, 2, 0]
fix23([2, 3, 5]) → [2, 0, 5]
fix23([1, 2, 1]) → [1, 2, 1]
     */
    public int[] fix23(int[] nums) {

        int changed [] = {nums[0], nums[1], nums[2]};;

        if(nums[0] == 2 && nums[1] == 3)

            changed[1] = 0;

        if(nums[1] == 2 && nums[2] == 3)

           changed[2] = 0;

        return changed;
    }
}
