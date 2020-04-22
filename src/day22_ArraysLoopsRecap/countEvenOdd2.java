package day22_ArraysLoopsRecap;

public class countEvenOdd2 {
    public static void main(String[] args) {

//count even and odd numbers in an array of integers

        int [] arr = {1,2,3,4,5,6,7,8,9,10,11};

        int countEven = 0;
        int countOdd = 0;

        for(int each : arr){
            if(each % 2 == 0){
                countEven++;
            }else{
                countOdd++;
            }
        }

        System.out.println(countEven);
        System.out.println(countOdd);
    }
}
