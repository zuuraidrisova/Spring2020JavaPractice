package OfficeHours.Practice_04_08_2020;

public class Nested_Loop_Practice {
    public static void main(String[] args) {
        /*
        Nested loop: loop inside another loop
        u have: inner loop and outer loop
        outer loop will repeat inner loop multiple times
         */
//anything we can repeat can be placed in the loop body

        for(int j = 1; j<= 5; j++) {//repeats inner loop five times

            for (int i = 10; i <= 50; i += 10) {//prints 10,20,30,40,50
                System.out.print(i+" ");
            }
            System.out.println();//to break the line
        }

        System.out.println("==========================");

        int a=5;
        while(a <= 10){//it will start from 5 to 10..so repeats inner for loop 5 times
            for(int i = 10; i <= 50; i+=10){//it starts from 10, continues until 50
                //but increments every 10 times
                System.out.print(i+" ");
            }
            a++;
            System.out.println();
        }






    }
}
