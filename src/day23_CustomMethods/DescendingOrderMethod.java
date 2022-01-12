package day23_CustomMethods;

import java.util.Arrays;

public class DescendingOrderMethod {

    public static void main(String[] args) {

        int [] arr1 = {1,4,3,8,6,2,7,5,9,0};

        printArrayDescendingOrder(arr1);

        reverseString("Zuura");

    }

    public static void printArrayDescendingOrder(int [] arr){

        Arrays.sort(arr);

        for(int i = arr.length-1; i >= 0; i--){

            System.out.print(arr[i]+ " ");

        }
        System.out.println();

    }

    public static void reverseString(String reverse){

        String reversed = "";

        for(int i = reverse.length()-1; i >= 0; i--){

            reversed += reverse.charAt(i);

        }
        System.out.println(reversed);
    }


}
