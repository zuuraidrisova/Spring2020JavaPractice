package day22_ArraysLoopsRecap;

import java.util.Arrays;

public class NestedForEach {

    public static void main(String[] args) {


        int [] arr = {1,2,3,4,5};

        for(int each : arr){//print each element from single dimensional array

            System.out.println(each);
        }


        System.out.println("======================");

        int [][] arr2D = {  {1,2,3,4},{5,6,7,8} };

        for(int [] each: arr2D){//print single dimensional array as a string from two dimensional array

            System.out.println(Arrays.toString(each));
        }

        System.out.println("====================");

        for(int [] each1DArray : arr2D){// getting single dimensional array from two dimensional array

            for(int eachElement: each1DArray){//getting each element from single dimensional array

                System.out.println(eachElement);

            }
        }

        char [][] ch2D = { {'A','B'},{ 'C','D','E'}};

        for(char [] each1D: ch2D){

            for(char eachChar : each1D){

                System.out.println(eachChar);
            }
        }


    }
}
