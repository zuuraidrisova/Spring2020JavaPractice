package day24_MethodsContinue;

import java.util.Arrays;

public class sortDescendingVoidReturn {

    public static void main(String[] args) {

        int [] array1 = {6,7,8,9,10,5,4,3,2,1};

        int [] array2 = {200,150,450,230,470};

        int [] array3 = {100,800,300,450,700};

        sortDescending(array1);//this cannot return a value
        sortDescending(array2);
        sortDescending(array3);

        int[] arr4 = sortDescending2(array1);//we can return a value which is reusable
        int[] arr5 = sortDescending2(array2);
        int[] arr6 = sortDescending2(array3);

        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(arr6));
    }
    public static void sortDescending(int [] arr){

        Arrays.sort(arr);

        int [] arr2 = new int [arr.length];

        int k = 0;

        for(int i = arr.length-1; i >= 0; i--){

            arr2[k] = arr[i];
            k++;

        }

        System.out.println(Arrays.toString(arr2));
    }

    public static int[] sortDescending2(int [] arr2){

        Arrays.sort(arr2);

        int [] arr3 = new int[arr2.length];
        int z = 0;

        for(int x = arr2.length-1; x >= 0; x--) {

            arr3[z] = arr2[x];

            z++;
        }
           return arr3;
    }
}