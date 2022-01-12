package reviewPracticing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Tasks3 {

    public static void main(String[] args) {

        //interview question ==> remove anyone with the name of Ahmad

        String [] arr = {"Ahmad","John","Aron","Ahmad","Daniel","Ahmad"};

        ArrayList<String> names = new ArrayList<>(Arrays.asList(arr));

        System.out.println("names = " + names);

        names.removeAll(Arrays.asList("Ahmad"));

        System.out.println("names = " + names);

        //predicate

        names.removeIf(p -> p.equals("Aron"));

        System.out.println("names = " + names);

              /*
         1. write a program that can return the sum of all the digits from a
        string
        ex:
        input: "a1b2c3"
        output: 6
        (1+2+3= 6)
        input: "Today's date is 04/27/2020"
        output: 17
        (0+4+2+7+2+0+2+0=17)
        HINT: on ascii table, the characters between #48 ~ #57 are
        digits
        */

              String str = "a1b2c3";

           char ch [] = str.toCharArray();

           int sum = 0;

           for (int i = 0; i <= ch.length-1; i++){

               if (Character.isDigit(ch[i])){

                   sum += Integer.parseInt(ch[i]+"");
               }
           }

        System.out.println("sum = " + sum);


           //remove duplicates from list

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Hello","Thanks","Sorry","Nice","Please","Please","Nice"));

        System.out.println("list = " + list);

        ArrayList<String> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){

            if (!list1.contains(list.get(i))){

                list1.add(list.get(i));
            }
        }

        System.out.println("list1 = " + list1);

        //sort descending way

        ArrayList<Integer> listNumbers = new ArrayList<>(Arrays.asList(1,3,5,2,6,4,8));

        Collections.sort(listNumbers);

        System.out.println("listNumbers = " + listNumbers);

        ArrayList<Integer> descending = new ArrayList<>();

        for (int i = listNumbers.size()-1; i >= 0; i--){

            descending.add(listNumbers.get(i));

        }

        System.out.println("descending = " + descending);

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

        int countOfZeros = Collections.frequency(zeros, 0);

        System.out.println("countOfZeros = " + countOfZeros);

        int max = Collections.max(zeros);

        System.out.println("max = " + max);

        int min = Collections.min(zeros);

        System.out.println("min = " + min);

        Collections.swap(zeros,0,1);

        System.out.println("zeros = " + zeros);

        Collections.sort(zeros);

        System.out.println("zeros = " + zeros);

        Collections.replaceAll(zeros, 0,5);

        System.out.println("zeros = " + zeros);

        //return unique values from ArrayList

        ArrayList<String> name =  new ArrayList<>();

        name.addAll(Arrays.asList("Zuura","Irina","Irina","Anna","Anna"));


        for (String each : name){

            int c = 0;

            for (String item :  name){

                if (each.equals(item)){

                    c++;
                }
            }

            if (c == 1){

                System.out.println(each);
            }
        }


/*
write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]
 */

        ArrayList<String> alphabet = new ArrayList<>();

        alphabet.addAll(Arrays.asList("A", "B", "B", "C", "D", "D"));

        System.out.println(alphabet);

        for (int i = 0; i < alphabet.size(); i++){

           int frequency =  Collections.frequency(alphabet,alphabet.get(i));

           if (frequency > 1){

               System.out.print(alphabet.get(i)+" ");
           }
        }

        System.out.println();


    }
}
