package day20_ArraysContinue;

import java.util.Arrays;

public class Array_Equals {

    public static void main(String[] args) {

        int [] arr = {1,2,3};
        int [] arr2 = {1,2,3};

        boolean b = Arrays.equals(arr,arr2);

        System.out.println(b);//we can assign it to boolean bcs it returns boolean
        System.out.println(Arrays.equals(arr,arr2));//returns true bcs they are same

        int [] arr3 = {3,2,1};
        int [] arr4 = {1,2,3};

        boolean b2 = Arrays.equals(arr3,arr4);//false, bcs values at index position are different
        System.out.println(b2);

        int [] arr5 = {3,2,1};
        int [] arr6 = {1,2,3};
        Arrays.sort(arr5);
        Arrays.sort(arr6);

        boolean b3 = Arrays.equals(arr5,arr6);//true, because we sorted before comparing

        System.out.println(b3);

        int [] arr7 = {1,2,3};
        int [] arr8 = {1,2,3,4};

        boolean b4 = Arrays.equals(arr7,arr8);//false, because they have different length
        System.out.println(b4);


    }
}
