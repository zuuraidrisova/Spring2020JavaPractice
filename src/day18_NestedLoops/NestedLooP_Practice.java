package day18_NestedLoops;

public class NestedLooP_Practice {

    public static void main(String[] args) {

      for(int a=0; a<5 ;a++) {

          for (int i = 1; i <= 5; i++) {

              System.out.print("Hello world!"+"    ");//print statement 5 times
          }
          System.out.println();//to break the line

      }

      for(int a=1;a<=7;a++){

          for(int b=1;b<=7;b++){

              System.out.print("*");
          }
          System.out.println();
      }

        System.out.println("====================");


      for(int x=0;x<7;x++) {

          int z = 1;

          while (z <= 10) {

              System.out.print(" *  ");

              z++;
          }
          System.out.println();
      }



    }
}
