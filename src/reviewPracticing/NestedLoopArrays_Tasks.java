package reviewPracticing;

public class NestedLoopArrays_Tasks {

    public static void main(String[] args) {


        int [][] arr2D =   {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < arr2D.length; i++){

            for (int j = 0; j < arr2D[i].length; j++){

                System.out.print(arr2D[i][j]+" ");
            }

            System.out.println();
        }

        System.out.println("=====================================");


        for (int [] each : arr2D){

            for (int item : each){

                System.out.print(item+" ");
            }

            System.out.println();
        }

        System.out.println("========================================");
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
        int totalOfOdd = 0;


        for (int[] each : numbers){

            for (int every : each){

                if (every % 2 == 0){

                    System.out.print(every+" ");
                }

                if (every % 2 != 0){

                    countOdd++;

                    totalOfOdd += every;
                }
            }

        }

        System.out.println();

        System.out.println("countOdd = " + countOdd);
        System.out.println("totalOfOdd = " + totalOfOdd);

        System.out.println("========================================");


        //reverse single dimensional array inside 2D array
        //  7 8 9 6 0 1 2 3 4 5

        int [][] number = { {9,8,7 } , {6} ,{5,4,3,2,1,0 } };

        for (int i = 0; i <= number.length-1; i++){

            for (int j = number[i].length-1; j >= 0;  j--){

                System.out.print(number[i][j]+" ");
            }

        }

        System.out.println();

        System.out.println("========================================");


        // 5 4 3 2 1 0 6 9 8 7  ==> printing from reversing
        // single dimensional arrays but elements in regular order

        for (int k = number.length-1; k >= 0; k--){

            for (int j = 0; j <= number[k].length-1; j++){

                System.out.print(number[k][j]+" ");
            }
        }

        System.out.println();



    }
}
