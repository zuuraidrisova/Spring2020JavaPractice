package day20_ArraysContinue;

public class Array_Size {
    public static void main(String []args){

        int [] arr = {1,2,3};
      //  System.out.println(arr[100]);//outOfBound erros..bcs index 100 nonexistent in given array

        System.out.println(arr[1]);

        int [] arr1 = new int [2];
        arr1 [0] = 10;
        arr1 [1] = 11;
        //arr1 [2] = 12;  ==>array's size is fixed
        System.out.println(arr1 [0]);
        System.out.println(arr1 [1]);

        arr1 = new int [3];//it is resetting..now i cannot get 10 if i give index 0

        System.out.println(arr1 [0]);
        System.out.println(arr1 [1]);





    }
}
