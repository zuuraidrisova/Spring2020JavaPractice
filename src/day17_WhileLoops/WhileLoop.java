package day17_WhileLoops;

public class WhileLoop {
    public static void main(String[] args) {

        if(10 > 9){//if condition is true, the statement will run once

            System.out.println("Hello World!");
        }
      /*  while(10>9){//as long as condition true, statement will run forever
            System.out.println("Hello World!");
        }

       */

      for(int i = 0;i <= 5; i++){

          //counter; condition; updater
          System.out.println(i);

      }

        System.out.println("+++++++++++");

      int i = 0;

      while(i <= 5){//repeated if statement

          i++;//if u put it here u will get 1,2,3,4,5

          System.out.println(i);
         // i++;//if u put it here u will get 0,1,2,3,4,5
      }


    }
}
