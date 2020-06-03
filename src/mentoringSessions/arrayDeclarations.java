package mentoringSessions;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayDeclarations {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};

        for(int i = 0; i < arr.length; i++){

            System.out.print(arr[i]+" ");
        }

        System.out.println();

        System.out.println("=============================");
                        //  0 1 2   0 1 2    0 1 2
        int[][] twoDarr = {{1,2,3},{4,5,6,},{7,8,9}};
                            //0        1        2

        for(int j = 0; j < twoDarr.length; j++){

            System.out.println(Arrays.toString(twoDarr[j]));
        }

        System.out.println("======================================");

        for (int i = 0; i < twoDarr.length; i++){

            for(int j = 0; j < twoDarr[i].length;j++){

                System.out.println(twoDarr[i][j]);
            }
        }

        double [] arr2 = new double[5];

        boolean [] bool = {true, true, false};

        System.out.println(arr2.equals(bool));


        System.out.println("================================");
        //how to find a missing number in an array

        int array [] = {1,2,3,5,6,7};

        //actual size is  6 + 1 ==> 7 bcs one of the numbers is missing

        int realSize = array.length + 1;

        int total = realSize * (realSize + 1) / 2;

        System.out.println(total);

        int sum = 0;

        for(int i = 0; i < array.length; i++){

            sum += array[i];
        }

        System.out.println(sum);

        System.out.println("The missing number is: "+ (total - sum));

        System.out.println("============================");

        //removing duplicates
        /*
        any Collection Type does not support primitive, so when you use add method
        even if you pass primitives to it , it will automatically be converted
         to it’s wrapper class and then will be added into the arraylist
         */

        int arr3 [] = {1,2,3,2,3,4,5,4};

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr3.length; i++){

            if(! list.contains(arr3[i])){

                list.add(arr3[i]);
            }
        }

        System.out.println(list);











    }
}
