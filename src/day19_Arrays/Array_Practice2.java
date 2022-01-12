package day19_Arrays;

import java.util.Scanner;

public class Array_Practice2 {

    public static void main(String[] args) {

        int [] arr = {10,20,30};//size is 3 now//3 elements

        System.out.println(arr.length);//returns the length of array ==> 3

        int [] arr2 = new int [5];//length is 5 but index is 4
        //compiler assigns default value to size of  arr2

        System.out.println(arr2 [0]);//0 --> by default it is zero bcs it is not initialized
        System.out.println(arr2[1]);//0 --> by default it is zero

        String [] testers = new String [3];//three positions available, {"Reem","Madina","Osman"};
                                // 0,1,2 ==>index
        System.out.println(testers[0]);//it returns null by default bcs we have not assigned anything to it yet

        testers [0] = "Reem";

        System.out.println(testers[0]);//now it returns Reem, bcs we assigned index 0 to Reem
        System.out.println(testers[1]);//it is by default null
        System.out.println(testers [2]);//it is null by default

        testers [1] = "Osman";//now we have initialized so it is gonna return Osman
        System.out.println(testers[1]);

        testers [2] = "Zuura";//we assigned index 2 to Zuura
        System.out.println(testers[2]);//so it will return Zuura now

        System.out.println(testers.length);//it is 3

        System.out.println("========================");





    }
}
