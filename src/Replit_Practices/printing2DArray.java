package Replit_Practices;

import java.util.Arrays;

public class printing2DArray {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < arr[i].length; j++){

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int [] ar = new int[arr.length];


        for(int i = 0; i < arr.length; i++ ){

            for(int j = 0; j < arr[i].length; j++){

                ar[i] += arr[i][j];
            }
        }

        System.out.println("sum of single dimensional array"+ Arrays.toString(ar));
    }
}
