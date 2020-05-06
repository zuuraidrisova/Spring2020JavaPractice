package WarmUp_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysAssigningValuesThruLoop {

    public static void main(String[] args) {

        int [] arr = new int[10];

        for(int i = 0; i < 10; i++){

           arr[i] = i+1;

        }

        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 10; i++){

            list.add(i+1);
        }

        System.out.println(list);




    }
}
