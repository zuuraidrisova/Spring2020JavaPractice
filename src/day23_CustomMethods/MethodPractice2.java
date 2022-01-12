package day23_CustomMethods;

public class MethodPractice2 {

    public static void main(String[] args) {

        printEven();

        printOdd();

    }

/*
write a method that can print all even number between 1 ~ 100
 */

    public static void printEven(){

     for(int i = 0; i <= 100; i++){

         if( i % 2 == 0 ) {

             System.out.print(i+" ");
         }
     }
        System.out.println();
    }

/*
write a method that can print all odd number between 1 ~ 100
 */

        public static void printOdd(){

            for(int i = 0; i <= 100; i++){

                if( i % 2 != 0 ) {

                    System.out.print(i+" ");
                }
            }

            System.out.println();
        }
}
