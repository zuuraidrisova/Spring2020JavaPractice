package day44_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class moveZerosToTheEnd {
    /*
    Write a method that can move all the zeros to  last indexes of the array
    (Do Not Use Sort Method)

Ex:

input:  {1,0,2,0,3,0,4,0};

output: [1, 2, 3, 4, 0, 0, 0, 0]
     */
    public static void main(String[] args) {

        int arr [] = {1,0,2,0,3,0,4,0};

        zerosBack(arr);
    }


    public static void zerosBack(int [] arr){

        Integer arr1 [] = new Integer[arr.length];
        //declare an integer array to store int array elements

        for(int i = 0; i < arr.length; i++){ //

            arr1[i] = arr[i]; //storing here bu running loop
        }

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr1));
        //declare an arraylist of integers  to story integer array

        int count = 0;

        for(int i = 0 ; i < list.size(); i++){ //run loop again

            if(list.get(i) == 0){//to identify whether it is 0 or not

                count++;//if yes variable counts
            }
        }

        list.removeIf(p -> p == 0); //removing all zeros first

        for(int i = 0; i < count; i++){

            list.add(0); //then adding it to list again at the end
        }

        System.out.println(list);

    }
}
