package WarmUp_Practices;

import java.util.Arrays;
import java.util.Scanner;

public class largestof3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] nums = new int[3];
        for(int i = 0; i < 3; i++){

            System.out.println("Enter number "+(i+1)+ ":");
            nums[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(nums));

        int max = nums[0];

        for(int i = 0; i < nums.length; i++){

            if(nums[i] > max){

                max = nums[i];
            }
        }

        System.out.println(max);



    }
}
