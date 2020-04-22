package day18_NestedLoops;

public class NestedLoop {
    public static void main(String []args){
/*
for(int;condition;iterator){
        for(int2;condition2;iterator2){
            (statements)
            }//inner loop
        }//outer loop
        //whenever we need to repeat the loop we need nested
 */


        for(int z=1;z<=5;z++) {//repeat inner loop five times
            System.out.println();
            for (int i = 1; i <= 5; i++) {//responsible to print only 1,2,3,4,5
                System.out.print(i + " ");
            }//inner loop closing braces
        }//outer loop closing braces
    }//main method closing braces
}//class closing braces
