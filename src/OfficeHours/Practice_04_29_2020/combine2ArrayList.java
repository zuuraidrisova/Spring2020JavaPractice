package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class combine2ArrayList {

    public static void main(String[] args) {

       int [] arr = {1,2,3,4,5};
       int [] arr1 = {6,7,8,9};

        ArrayList<Integer>list = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++){

            list.add(arr[i]);

        }

        for(int j = 0; j < arr1.length; j++){

            list.add(arr1[j]);

        }

        System.out.println(list);


        int [] combined = new int [arr.length + arr1.length];

        for(int i = 0; i <arr.length; i++){

            combined[i] = arr[i];

        }

        for(int j = 0 ; j < arr1.length; j++){

            combined[arr.length + j] = arr1[j];
        }


        System.out.println(Arrays.toString(combined));

    }
}
