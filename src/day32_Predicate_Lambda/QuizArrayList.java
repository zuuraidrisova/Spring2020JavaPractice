package day32_Predicate_Lambda;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizArrayList {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Robb","Bran","Rick","Bran"));

        if(names.remove("Bran")){// true and return Robb Rick Bran

            names.remove("John");//false, because we dont have John in list
        }


        System.out.println(names);

        System.out.println("========================");

        ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(1,2,3,4,5));

        list.set(0,list.get(4)); // 5 2 3 4 5
        //setting element at index 0 with element at index 4

        list.set(4,list.get(0)); // 5 2 3 4 5
        //setting element at  index 4 with element at index 0

        System.out.println(list);// 5 2 3 4 5

        System.out.println("===========================");

        ArrayList<Character> ls = new ArrayList<>();

        for(char i = 'a'; i <= 'z'; i++){

            ls.add(i);
        }

        boolean result = ls.contains(Arrays.asList('a','c','D'));

        System.out.println(result);//false, bcs we dont have D in list


        System.out.println("====================");

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1,2,3,4,5,6,7));

        for(Integer each : nums){

            if(each % 2 != 0){

                continue;
            }

            System.out.println(each);
            break;//after printing fist even number it exits the loop
        }


    }
}
