package Replit_Practices;

public class MaxMinReturn {
    public static void main(String[] args) {
        /* max function gets two ints, x and y.
x is the test case, max is what we test against.
if  x is bigger then max return max
in any other case return x. for example:
max(1,10)
returns 1
max(11,5)
returns 5
         */
       int result =  max(11,5);
        System.out.println(result);
    }
    public static int max(int x,int  y){

        int maxMin = y;

        if(x > maxMin){

            return maxMin;

        }else{

            return x;
        }
    }
}
