package OfficeHours_Saim.day5_ArrayArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class reverse {
    /*
    3) Create a method that will accept an int array and reverse the order of
     elements. Return the reversed array.
4) Overload the method to accept an ArrayList of integers and reverse the order
 of the elements. Return the reversed ArrayList
     */

    public static void main(String[] args) {


        int[] array = {1,2,3,4,5,6};

        int []  reversed = reverse(array);

        System.out.println(Arrays.toString(reversed));

        ArrayList<Integer>list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));

        ArrayList<Integer> reversed2 = reverse(list);

        System.out.println(reversed2);


    }

    public static int [] reverse(int [] array){

        int [] reversed = new int[array.length];

        int k = 0;

        for(int i = array.length-1; i >= 0; i--){

            reversed[k] = array[i];

            k++;

        }

        return reversed;
    }

    public static int [] reverse2(int [] array){


        for(int i = 0; i < array.length / 2; i++){

            int temp = array[i];

            array[i] = array[array.length-1 - i];

            array[array.length-1 - i] = temp;

        }

        return array;

    }

    public static ArrayList<Integer> reverse(java.util.ArrayList<Integer> list){

        ArrayList<Integer> reversed = new ArrayList<Integer>();

        for(int  i = list.size()-1; i >= 0; i--){


            reversed.add(list.get(i));
        }

        return reversed;

    }
}
