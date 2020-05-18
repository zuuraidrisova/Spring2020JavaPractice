package Replit_Practices;

public class commonDivisor2 {
     /*
    Given two positive integers m and n, find their greatest common divisor,
    that is, the largest positive integer that evenly divides both m and n.
Example:
if m = 15 and n = 25, then result greatest common divisor is = 5.
     */
     public static void main(String[] args) {

         int a = 15;
         int b = 25;

         int common = commonDivisor(a,b);

         System.out.println(common);
     }
     public static int commonDivisor(int m, int n){

         int common = 0;

         for(int i = 1; i <= m && i <= n; i++){

             if(m % i == 0 && n % i == 0){

                 common = i;

             }
         }

       return common;
     }
}
