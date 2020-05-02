package WarmUp_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class moveAllZeros {

    public static void main(String[] args) {

        /*
        Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1,0,2,0,3,0,4,0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method

         */

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));

        System.out.println(list);

        ArrayList<Integer> zerosBack =  new ArrayList<>();


        for(int i = 0; i < list.size(); i++){

            if(list.get(i) != 0){

                zerosBack.add(list.get(i));
            }
        }

        System.out.println(zerosBack);

        for(int i = 0; i < list.size(); i++){

            if(list.get(i) == 0 ){

                zerosBack.add(list.get(i));
            }
        }

        System.out.println(zerosBack);

        System.out.println("===================");








    }
}
