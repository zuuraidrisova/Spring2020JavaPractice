package day21_MultiDimensionalArray;

import java.util.Arrays;

public class MaximumNumberArray {

    public static void main(String[] args) {

        int [] arr = {2,3,61,3,9,322};

        Arrays.sort(arr);

        System.out.println("Minimum number is: "+arr[0 ]);

        System.out.println("Maximum number is: "+arr[arr.length-1]);

    }
}
