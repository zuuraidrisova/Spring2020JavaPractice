package day22_ArraysLoopsRecap;

public class CountEvenOddIntegers {
    public static void main(String[] args) {

       /* write a program that can count the even and odd number
       from an array of integers
        MUST use for each loop

        */
       int [] arr = {1,2,3,4,5,6,7,8,9,10,11};

       int countEven = 0;
       int countOdd = 0;

       for(int each : arr){

           if(each % 2 ==0){

               countEven++;

           }else{

               countOdd++;
           }
       }

        System.out.println(countEven);
        System.out.println(countOdd);

    }
}
