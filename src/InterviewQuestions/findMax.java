package InterviewQuestions;

import java.util.Arrays;

public class findMax {

    public static void main(String[] args) {

        /*
        Write a method that can find the maximum number from an int Array
         */
        int [] arr = {1,90,443,23,-1,24,78,0};

        Arrays.sort(arr);

        System.out.println(arr[arr.length-1]);

        int max = maxArray(arr);

        System.out.println(max);

    }

    public static int maxArray(int [] arr){

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){

            if( max  < arr[i]){

                max = arr[i];
            }
        }

        return max;
    }
}
