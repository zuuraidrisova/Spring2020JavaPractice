package day18_NestedLoops;

public class Triangle {
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
        int z=1;
        while(z<=9){
                   int i = 1;
                    while (i <= z) {

                       System.out.print("* ");
                        i++;
                     }

            System.out.println();
            z++;


        }

        System.out.println("========================");

        int y=9;
        while(y>=1){
            int i = 1;
            while (i <= y) {

                System.out.print("* ");
                i++;
            }

            System.out.println();
            y--;


        }










    }
}