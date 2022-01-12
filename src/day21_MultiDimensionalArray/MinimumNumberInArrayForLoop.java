package day21_MultiDimensionalArray;

public class MinimumNumberInArrayForLoop {

    public static void main(String[] args) {

         int [] arr = {1,90,2386,888,5,0};

         int min = 999999999;

         for(int i = 0; i < arr.length; i++){
             if(min > arr[i]){
                 min = arr[i];
             }
         }

        System.out.println(min);
    }
}
