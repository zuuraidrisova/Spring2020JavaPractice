package Replit_Practices;

public class PrintEven80to20 {
    public static void main(String[] args) {
        /*
        Write a for loop that prints all the even integers from 80
        through 20 inclusive, separated by spaces.
         MUST USE FOR EACH LOOP
         */



        int [] arr = { 80, 79, 78, 77, 76, 75, 74, 73, 72, 71, 70, 69, 68, 67, 66, 65,
                64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46,
                45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29,28,
                27, 26, 25, 24, 23, 22, 21, 20};
        for(int each : arr){
            if(each % 2 ==0 ){
                System.out.println(each);
            }
        }


    }
}
