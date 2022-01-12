package day17_WhileLoops;

public class WhileLoop_Practice2 {
    public static void main(String []args){

        for(int i=1; i<=100;i++){

            System.out.print("*");
        }

        System.out.println();

        int j =1;

        while (j <= 100){

            System.out.print("*");
            j++;
        }
        System.out.println();

        /*

        ***
        * *
        * *
        ***

         */

        int number = 3;
        System.out.println("***");

        while(number > 0){

            System.out.println("* *");
            number--;
        }
        System.out.println("***");








    }
}
