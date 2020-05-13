package day16_ForLoopContinueBreak;

public class DivisibleBy3_5 {
    public static void main(String[] args) {
          /*
         write a program that can print all the ODD numbers
         between 1 ~ 100 that can be divisible by 3 & 5
         */
        for(int a =1; a<=100;a++){

            if(a%2 ==0){ //to take it even we can also do  a%2==0;

                if(a%3==0 && a%5==0)

                System.out.print(a+" ");
            }

        }
    }
}
