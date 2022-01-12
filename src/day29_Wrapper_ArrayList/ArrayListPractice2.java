package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        /*
        create a list of Integers
        add 5 Integers to it
        return max number from the list
        ** don't use sort method
         */

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(12);
        numbers.add(3);
        numbers.add(45);
        numbers.add(34);
        numbers.add(67);
        numbers.add(-1);
        numbers.add(1000);

        System.out.println(numbers);

        System.out.println("=================");

        int size = numbers.size();

        System.out.println(size);

        System.out.println("=================");

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.size(); i++){

            if(numbers.get(i) > max){

                max = numbers.get(i);
            }

        }

        System.out.println(max);

        System.out.println("=================");

        int max2 = Integer.MIN_VALUE;

        for(Integer each : numbers){

            if(each > max2){

                max2 = each;
            }
        }

        System.out.println(max2);

        System.out.println("=================");

        int max3 = findMaxArrayList(numbers);

        System.out.println(max3);
    }

    public static int findMaxArrayList(ArrayList<Integer> numbers){

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.size(); i++){

            if(numbers.get(i) > max){

                max = numbers.get(i);
            }
        }

        return max;

    }
}
