package day22_ArraysLoopsRecap;

public class NestedLoops2 {

    public static void main(String[] args) {

        int [][] numbers = { {9,8,7 } , {6} ,{5,4,3,2,1,0 } };
                        //    0        1        2
        //        i        j
       // numbers[0] ==> {9,8,7}
        // numbers[1] ==> {6}
        //numbers [2] ==> {5,4,3,2,1,0 }


        for(int i = 0; i < numbers.length; i++){

            for(int j = 0; j < numbers[i].length; j++){

                System.out.print(numbers[i][j]+" ");
            }

            System.out.println();//to print each array in a separate line
        }

        System.out.println("==================");

        //reverse single dimensional array inside 2D array
        //  7 8 9 6 0 1 2 3 4 5

        for(int  k = 0; k < numbers.length; k++){// k: index number of single dimensional array

            for( int i = numbers[k].length-1; i >= 0; i--){// i : index number of each element in single dimensional array

                System.out.print(numbers[k][i] + " ");
            }
            //System.out.println();//to print each array in a separate line
        }

        System.out.println();

        System.out.println("====================");

        // 5 4 3 2 1 0 6 9 8 7  ==> printing from reversing single dimensional arrays but elements in regular order

        for(int k = numbers.length-1; k >= 0; k--){

            for(int i = 0; i < numbers[k].length; i++){

                System.out.print(numbers[k][i]+" ");
            }
           // System.out.println();
        }

        System.out.println();
        System.out.println("====================");
        // 0 1 2 3 4 5 6 7 8 9

        for(int k = numbers.length-1; k >= 0; k--){

            for(int i = numbers[k].length-1; i >= 0; i--){

                System.out.print(numbers[k][i]+" ");
            }
           // System.out.println();
        }





    }
}
