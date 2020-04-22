package Replit_Practices;
import java.util.Arrays;
import java.util.Scanner;
public class FindingNoDuplicatesInArray {
    public static void main(String[] args) {
        /*
        Given an array nums with 7 integers every element is repeated
        twice - except one. Find that element and print it to console.

Example:

nums -> [1, 1, 2, 3, 4, 3, 4]
         2

         */

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),
                input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below

      for(int i = 0; i <= nums.length-1; i++){

          int count = 0 ;

          for(int j = 0; j <= nums.length-1; j++){

              if(nums [i] == nums [j]){

                  count++;
              }
          }

          if(count == 1){

              System.out.println(nums[i]);
          }


      }


    }
}
