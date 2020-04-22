package day20_ArraysContinue;

public class MaximNumArray {
    public static void main(String[] args) {
        /*
        write a program that can find the maximum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE CLASS
         */
        int [] numbers = {100,2,3,44,5,60,7};//given array
        int lastIndex = numbers.length-1;//finding last index of array
        int Max = numbers [0];//temporary assigning value to max


        for(int i = 0; i <= lastIndex; i++){//looping thru each index in array
            if(numbers [i] > Max){//arrays index are compared with each other,
                // and whichever ig greater will be assigned to the max value
                Max = numbers [i];//assigning max number
            }

        }

        System.out.println(Max);//printing num

        /*
         write a program that can find the minimum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE
         */

        int arr [] = {10,922,45,2000,98,35};
        int last = arr.length-1;
        int min = arr [0];

        for(int i = 0; i <= last; i++){
            if(arr[i]  < min){
                min = arr [i];
            }
        }


        System.out.println(min);



    }
}
