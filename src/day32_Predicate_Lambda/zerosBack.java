package day32_Predicate_Lambda;

import java.util.ArrayList;
import java.util.Arrays;

public class zerosBack {

    public static void main(String[] args) {

        /*
Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1,0,2,0,3,0,4,0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT declear  any extra lists

 */

        ArrayList<Integer> zeros = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));

        System.out.println("zeros = " + zeros);

        int count = 0;

        for (int i = 0; i <= zeros.size()-1; i++){

            if (zeros.get(i) == 0){

                count++;
            }
        }

        zeros.removeIf(p -> p == 0);

        System.out.println("zeros = " + zeros);

        for (int i = 0; i < count; i++){

            zeros.add(0);
        }

        System.out.println("zeros = " + zeros);
    }
}
