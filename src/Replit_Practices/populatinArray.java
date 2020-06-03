package Replit_Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class populatinArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        Integer size =  scan.nextInt();
        int [] arr = new int [size];

        for(int i = 0; i < size; i++){

            arr[i] = i+1; // plus 1 is just for starting at 1
        }

        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < size; i++){

            list.add(i+1);
        }

        System.out.println(list);


    }
}
