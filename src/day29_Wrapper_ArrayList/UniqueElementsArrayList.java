package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class UniqueElementsArrayList {

    public static void main(String[] args) {

      /*
       write a program that can print out the unique elements from an int array

        HINT: store all the unique elements of array into a list of integers
        Ex: array==> {1,1,2,3,3,4,5}
        output: {2,4,5}

       */

        ArrayList<Integer> list = new ArrayList<Integer>();

       int arr [] =  {1,1,2,3,3,4,5};

       for(int i = 0; i < arr.length; i++){

          int count = 0;

          for(int j = 0; j < arr.length; j++){

              if(arr[i] == arr[j]){

                  count++;
              }
          }

          if(count == 1){

              list.add(arr[i]);

          }
      }


        System.out.println(list);


    }
}
