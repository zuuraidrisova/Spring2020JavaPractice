package day21_MultiDimensionalArray;

public class MaximumNumberInArrayForLoop {
    public static void main(String[] args) {

        int [] arr = {1,90,2386,888,5,0};

        int max = -999999999;

        for(int i = 0; i < arr.length; i++){
            if(max < arr[i] ){
                max = arr[i];
            }
        }
        System.out.println(max);


    }
}
