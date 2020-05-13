package InterviewQuestions;

import java.util.Arrays;

public class findMin {
    public static void main(String[] args) {
        /*
        Write a method that can find the maximum number from an int Array
         */

        int [] arr = {1,90,443,23,-1,24,78,0};

        Arrays.sort(arr);

        System.out.println(arr[0]);

       int min =  min(arr);

        System.out.println(min);

    }

    public static int min(int [] arr){

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){

            if(min > arr[i]){

                min = arr[i];
            }
        }

        return min;
    }
}
