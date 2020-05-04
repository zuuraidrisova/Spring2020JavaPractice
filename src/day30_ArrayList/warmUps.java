package day30_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class warmUps {

    public static void main(String[] args) {
/*
        1. write a program that can return the sum of all the digits from a string
        ex:
        input: "a1b2c3"
        output: 6
        (1+2+3= 6)

        input: "Today's date is 04/27/2020"
        output: 17
        (0+4+2+7+2+0+2+0=17)

        HINT: on ascii table, the characters between #48 ~ #57 are digits

        2. write a program that can print the list of integers in reversed order
        ex:
        list=> {1,2,3,4,5}
        output: 5 4 3 2 1

        3.  write a program that can find the unique elements
         from an ArrayList of integers and stores into another list called uniques

        ex: list==> {1,1,2,3,3,4,5}
        uniques ==> {2,4,5}


        4. write a program that can combine two String arrays into one arrayList
        ex:
        arr1 = {"A", "B", "C"};
        arr2 = {"D", "E", "F", "G"};
        list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */

        //  task 1

        String abc = "a1b2c3";

        char [] ch = abc.toCharArray();

        int sum = 0;

        for(int a = 0; a < ch.length; a++){

           if(Character.isDigit(ch[a])){

            int  num = Integer.parseInt(""+ch[a]);

            sum += num;


           }

        }
        System.out.println(sum);

        System.out.println("=========================");

        // task 2

        ArrayList<Integer> list =  new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5));

        System.out.println(list);

        ArrayList<Integer> reversed = new ArrayList<>();

        for(int i = list.size()-1; i >= 0; i--){

            reversed.add(list.get(i));
        }

        System.out.println(reversed);

        System.out.println("===========================");

        // task 3

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,1,2,3,3,4,5));

        System.out.println(list2);

        ArrayList<Integer> uniques = new ArrayList<>();

        for(int i = 0; i < list2.size(); i++){

            int count = 0;

            for(int j = 0; j < list2.size(); j++){

                if(list2.get(i) == list2.get(j)){

                    count++;
                }
            }

            if(count == 1){

                uniques.add(list2.get(i));
            }
        }

        System.out.println(uniques);

        System.out.println("=======================================");

        // task 4

        String [] arr = {"hello","quick","bye"};
        String [] arr1 = {"thanks","please","nice","always"};

        ArrayList<String> list4 = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){

            list4.add(arr[i]);
        }

        for(int i = 0; i < arr1.length; i++){

            list4.add(arr1[i]);

        }

        System.out.println(list4);

        System.out.println("===============================");

        // task  1 again

        String str = "Today's date is 04/27/2020";

        char [] ch2 = str.toCharArray();

        int sum2 = 0;

        for(char each : ch2){


            if(Character.isDigit(each)){

              int num =   Integer.parseInt(""+each);

              sum2 += num;

            }

        }

        System.out.println(sum2);




    }
}
