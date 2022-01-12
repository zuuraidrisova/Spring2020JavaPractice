package day16_ForLoopContinueBreak;

public class SumNumbersForLoopEvenOdd {
    public static void main(String []args){

        /*
        write a program that can calculate
        the sum of all the even numbers between 1 ~ 100
         */

        int sum1 = 0;
        int sum2 =0;

        for(int a = 0; a <= 100; a++) {

            if (a % 2 == 0) {//even

                sum1+=a;

            }else{//odd
                sum2+=a;
            }
        }

        System.out.println("Sum of all even numbers: "+sum1);
        System.out.println("Sum of all odd numbers: "+sum2);




    }
}
