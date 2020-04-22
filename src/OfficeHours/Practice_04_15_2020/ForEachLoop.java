package OfficeHours.Practice_04_15_2020;

public class ForEachLoop {
    public static void main(String[] args) {
/*
For each loop is always for data structures... it is already iterated loop

        for(Data Type variableName : ArrayName ){

        }
 */

        int [] arr = {1,2,3,4,5};

        for(int each : arr){

            if(each == 3){
                continue;
            }
            System.out.println(each);
        }

        System.out.println("===================");

        for(int each : arr){

            if(each == 3){
                break;
            }
            System.out.println(each);
        }
        System.out.println("===================");

        int [] arr1 = {1,2,3,4,5,6,7,8,9,10};

        for(int each : arr1){

            if(each % 2 != 0){
                continue;
            }
            System.out.println(each);
        }

    }
}
