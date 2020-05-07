package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class assigningValuesToArraysArrayListLoop {

    public static void main(String[] args) {

        int [] arr = new int [10];

        for(int i = 0; i < 10; i ++){

            arr[i] = i + 1;
        }

        System.out.println(Arrays.toString(arr));


        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 10; i ++){

            list.add(i + 1);
        }

        System.out.println(list);


        Scanner scan = new Scanner(System.in);

        int [] arr2 = new int[5];

        for(int i = 0; i < 5; i ++){

            System.out.println("Enter a number "+ (i+1));

            arr2[i] = scan.nextInt();

        }

        System.out.println(Arrays.toString(arr2));

        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i = 0; i < 5; i++){

           list2.add(i+1);

        }

        System.out.println(list2);


    }
}
