package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class removeZeros {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10,20,0,0,30,0,0,40,0,0));

        System.out.println(list);

        int count = 0;

        for(int  i = 0; i < list.size(); i++){//identifying how many zeros we have

            if(list.get(i) == 0){//condition to find zero

                count++;//counting0
            }
        }

        System.out.println(count);

        list.removeAll(Arrays.asList(0));//removing all 0

        for(int i = 0; i < count; i++){//running loop for as long as count

            list.add(0);//adding zeros at the end
        }

        System.out.println(list);

        System.out.println("===================");

        //my original solution

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(10,20,0,0,30,0,0,40,0,0));

        ArrayList<Integer> zerosBack = new ArrayList<>();

        for(int i = 0; i < list2.size(); i++){

            if(list2.get(i) > 0){

                zerosBack.add(list2.get(i));
            }
        }

        for(int i = 0; i < list2.size(); i++){

            if(list2.get(i) == 0){

                zerosBack.add(list2.get(i));
            }
        }

        System.out.println(zerosBack);

        System.out.println("======================");

        //Collections.frequency() method

        ArrayList<Integer> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList(10,20,0,0,30,0,0,40,0,0));

        int count1 = Collections.frequency(list3,0);

        list3.removeAll(Arrays.asList(0));

        for(int i = 0; i < count1; i++){

            list3.add(0);
        }

        System.out.println(list3);



    }
}
