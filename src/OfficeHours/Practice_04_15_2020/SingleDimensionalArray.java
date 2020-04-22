package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class SingleDimensionalArray {
    public static void main(String[] args) {

        int a = 100; //regular variable  stores a single  data

        int [] arr = {100,200,300};//variable array can store multiple data
        // indexes     0   1   2
        System.out.println(arr[0]);//we use index numbers to retrieve data from array

        for(int i = 0;  i < arr.length; i++){// represents index numbers of each element in the array

            //System.out.println(i);//it will print us index numbers of each data
            System.out.println(arr[i]);//now it will print us each data at index position i

        }

        System.out.println("========================");

        //we can also use while loop

        int i = 0;


        while(i < arr.length){

            int num = arr[i];
            System.out.println(num);
            i++;
        }


        System.out.println("============================");

        //reverse array of string  task with  for loop

        String [] names = {"Zuura","Sary","Chopa","Asan","Alina"};

        String [] reversed = new String [names.length];

        int k = 0;

        for(int j = names.length-1; j >= 0; j--){

            reversed[k] = names[j];
            k++;

        }

        System.out.println(Arrays.toString(reversed));


        System.out.println("=================");

        //reverse task with while loop

        int y = 0;//first index of original array
        int x = reversed.length-1;//last index num of reversed array

        while(y < names.length){

            reversed [x] = names[y];
            y++;
        }


        System.out.println(Arrays.toString(reversed));




    }
}
