package day20_ArraysContinue;

import java.util.Arrays;

public class ArraysUtilities {

    public static void main(String[] args) {

        int [] arr = {1,2,3};

        String arr1 = Arrays.toString(arr);

        System.out.println(arr1);//array must be converted to string before we print

        String [] names = {"Madina","Fatih","Osman"};

        String names1 = Arrays.toString(names);

        System.out.println(names1);

        String [] arr3 = new String [5];

        String arr4 = Arrays.toString(arr3);

        System.out.println(arr4);//will get null

        double [] num = {10,20,30,40};

        System.out.println(Arrays.toString(num));

        System.out.println(num[0]+1);










    }
}
