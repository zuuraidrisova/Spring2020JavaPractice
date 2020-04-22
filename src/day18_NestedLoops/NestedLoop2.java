package day18_NestedLoops;

public class NestedLoop2 {
    public static void main(String[] args) {
        /*
            *
            * *
            * * *
            * * * *
            * * * * *
            * * * * * *
            * * * * * * *
            * * * * * * * *
            * * * * * * * * *
         */

        for(int j = 1; j<=9;j++) {//vertical
            for (int i = 1; i <=j; i++) {//horizontal
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("=====================================");

        for(int j=9;j>=1; j--){
            for(int i=1;i<=j;i++){
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
        a
        a b
        a b c
        a b c d
        a b c d e

       a .............z
         */


        System.out.println("===============================");

        for(char ch1 ='a';ch1<='z';ch1++) {
            for (char ch = 'a'; ch <= ch1; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

        System.out.println("========================================================");


        for(char ch1 ='z';ch1>='a';ch1--) {
            for (char ch = 'a'; ch <= ch1; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }








    }
}
