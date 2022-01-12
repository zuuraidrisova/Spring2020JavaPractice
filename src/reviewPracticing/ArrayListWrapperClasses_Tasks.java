package reviewPracticing;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListWrapperClasses_Tasks {

    public static void main(String[] args) {
         /*

        create a list of Integers
        add 5 Integers to it
        return max number from the list
        ** don't use sort method

         */

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 5; i++){

            numbers.add(i);
        }

        System.out.println(numbers);

        int max = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++){

            if (max < numbers.get(i)){

                max = numbers.get(i);
            }
        }


        System.out.println("max = " + max);

        int max2 = findMaxNumberFromArrayListOfIntegers(numbers);

        System.out.println("max2 = " + max2);

        int min = findMinNumberFromArrayListOfIntegers(numbers);

        System.out.println("min = " + min);

         /*
        String[] arr = {"1","2.5", "3", "3.5", "4.5"}
        find the maximum and minimum numbers
        NOTE: Do not use sort method

       */

        String[] arr = {"1","2.5", "3", "3.5", "4.5"};

        double maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){

            if (maxNumber < Double.parseDouble(arr[i])){

                maxNumber =  Double.parseDouble(arr[i]);
            }
        }

        System.out.println("maxNumber = " + maxNumber);

        /*
         String[] arr = {"1","2.5", "3", "3.5", "4.5"}
         find the maximum and minimum numbers
         use sort method
         */

        String[] arr1 = {"1","2.5", "3", "3.5", "4.5"};

        double minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < arr1.length; i++){

            if (minNumber > Double.parseDouble(arr1[i])){

                minNumber = Double.parseDouble(arr1[i]);
            }
        }

        System.out.println("minNumber = " + minNumber);


        //create arrayList of integers and add 10 values and print odd and even numbers separately

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++){

            list.add(i + 1);
        }

        System.out.println(list);

        //odd

        for (int i = 0; i < list.size(); i++){

            if (list.get(i) % 2 == 0){

                continue;
            }

            System.out.print(list.get(i)+" ");
        }

        System.out.println();

        //even

        for (Integer each : list){

            if (each % 2 == 0){

                System.out.print(each+" ");
            }
        }

        System.out.println();

        /*


        write a program that can combine two String arrays into one arrayList
        ex:
        arr1 = {"A", "B", "C"};
        arr2 = {"D", "E", "F", "G"};
        list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */

        String [] array1 = {"A", "B", "C"};
        String [] array2 = {"D", "E", "F", "G"};

        ArrayList<String> listOfString = new ArrayList<>();

        for (int i = 0; i < array1.length; i++){

            listOfString.add(array1[i]);
        }

        System.out.println(listOfString);

        for (int i = 0; i < array2.length; i++){

            listOfString.add(array2[i]);
        }

        System.out.println(listOfString);

         /*

        write a program that can print the list of integers in reversed order
		ex:
			list=> {1,2,3,4,5}
			output: 5 4 3 2 1

         */

         ArrayList<Integer> listNumbers =  new ArrayList<>();

         for (int i = 0; i < 10; i++){

             listNumbers.add(i+1);
         }

        System.out.println(listNumbers);

         for (int j = listNumbers.size()-1; j >= 0; j--){

             System.out.print(listNumbers.get(j)+" ");
         }

        System.out.println();

         /*
       write a program that can find the unique elements from an ArrayList of integers
       and stores into another list called uniques

    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}
        */

        ArrayList<Integer> list1 = new ArrayList<Integer>();

        list1.add(1); list1.add(1); list1.add(2);
        list1.add(3); list1.add(3);list1.add(4); list1.add(5);

        System.out.println(list1);

        ArrayList<Integer> uniques = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++){

            int count = 0;

            for (int j = 0; j < list1.size(); j++){

                if (list1.get(i) == list1.get(j)){

                    count++;
                }
            }

            if (count == 1){

                uniques.add(i);
            }
        }

        System.out.println(uniques);


    }

    /*
        create a method which finds  max number from list of integers
         */

    public static int findMaxNumberFromArrayListOfIntegers(ArrayList<Integer> list){

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++){

            if (max < list.get(i)){

                max = list.get(i);

            }
        }

        return max;
    }

     /*
        create a method which finds  min number from list of integers
         */

     public static int findMinNumberFromArrayListOfIntegers(ArrayList<Integer> list){

         int min = Integer.MAX_VALUE;

         for (int i = 0; i < list.size(); i++){

             if (min > list.get(i)){

                 min = list.get(i);
             }
         }

         return min;
     }




}
