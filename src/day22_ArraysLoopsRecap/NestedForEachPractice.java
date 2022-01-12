package day22_ArraysLoopsRecap;

public class NestedForEachPractice {

    public static void main(String[] args) {
        /*
        int[][] numbers = {
                            {1,2,3},
                            {4,5,6,7,8,9},
                            {10,11,12,13,14},
                            {15,16,17,18,19,20,21}
                          };
        // 1. print all even numbers ina same line
        // 2. count odd numbers ==> return the total odd number
         */

        int[][] numbers = {

                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };


        int countOdd = 0;
        int sumOfOdd = 0;
        int sumOfEven = 0;

        for(int[] each1DArray : numbers){

            for(int eachNum : each1DArray){

                if(eachNum % 2 == 0){

                    System.out.print(eachNum+" ");
                    sumOfEven += eachNum;

                }else{

                    sumOfOdd += eachNum;
                    countOdd++;

                }
            }
            System.out.println();

        }

        System.out.println("count of odd numbers is: "+countOdd);
        System.out.println("sum of all odd numbers is: "+sumOfOdd);
        System.out.println("sum of all even numbers is: "+sumOfEven);

    }
}
