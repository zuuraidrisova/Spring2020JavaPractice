package day22_ArraysLoopsRecap;

public class NestedLoop3 {

    public static void main(String[] args) {

        int[][] numbers = {

                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
            };

        int countOdd = 0;

        for(int k = 0; k < numbers.length; k++){// k: represents index number of single dimensional array

            for(int i = 0 ; i < numbers[k].length; i++){// i :  represents each element in single dimensional array

                     int num =  numbers [k] [i];//assigning to int what we get from arrays

                if( num  % 2 != 0 ){// getting only odd numbers

                    countOdd++;//counting all odd numbers

                }else{// getting the even numbers

                    System.out.print(numbers[k][i]+" ");
                }
            }

            System.out.println();
        }


        System.out.println(countOdd);

    }
}
