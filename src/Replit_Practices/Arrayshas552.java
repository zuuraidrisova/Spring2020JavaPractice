package Replit_Practices;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayshas552 {
            /*
Given an array of ints, print true if the array contains a 5 next to a 5
 anywhere in the array. If no consecutive 5s or no 5s are detected in your code
  then print false.

nums → [1, 5, 5, 1, 1] → true
nums → [1, 8, 5, 5, 0] → true
nums → [1, 5, 4, 1, 5] → false
nums → [1, 4, 4, 1, 99] → false

         */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] arr = {scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(),scan.nextInt()};

        System.out.println(Arrays.toString(arr));

        boolean result = false;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] == 5 && arr[i + 1] == 5){

                result = true;

            }
        }

        System.out.println(result);

      }
}
