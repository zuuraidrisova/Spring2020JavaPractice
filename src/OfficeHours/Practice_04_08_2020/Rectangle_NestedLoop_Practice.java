package OfficeHours.Practice_04_08_2020;

public class Rectangle_NestedLoop_Practice {
    public static void main(String[] args) {
        /* vertical 6, horizontal 8
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *

         */
        // j- horizontal, i - vertical
        for(int j = 1;j <= 20; j++) {

            for (int i = 1; i <= 15; i++) {

                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("=========================");

        /*
        *
        *  *
        *  *  *
        *  *  *  *
        *  *  *  *  *
        *  *  *  *  *  *
        *  *  *  *  *  *  *
        *  *  *  *  *  *  *  *
         */

        for(int a = 1; a <= 7;a++){
            for(int b = 1; b <= a; b++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("=======================");
            //to reverse the triangle
        for(int a = 7; a >= 1;a--){
            for(int b = 1; b <= a; b++){
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
