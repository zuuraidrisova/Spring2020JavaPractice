package reviewPracticing;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Tasks {

    public static void main(String[] args) {

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

                /*
        2. write a program that can print the list of integers in reversed
        order
        ex:
        list=> {1,2,3,4,5}
        output: 5 4 3 2 1
        */

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i ++) {

            list.add(i+1);
        }

        System.out.println(list);

        for (int j = list.size()-1; j >= 0; j--){

            System.out.print(list.get(j)+" ");
        }

        System.out.println();

                /*
        3. write a program that can find the unique elements from an
        ArrayList of integers and stores into another list called uniques
        ex: list==> {1,1,2,3,3,4,5}
        uniques ==> {2,4,5}
        */

          ArrayList<Integer> list1 = new ArrayList<>();

          list1.add(1);
          list1.add(1);
          list1.add(1);
          list1.add(3);
          list1.add(5);

          for (int i = 0; i < list1.size(); i++){

              int count = 0;

              for (int j = 0; j < list1.size(); j++){

                  if (list1.get(i) == list1.get(j)){

                      count++;
                  }
              }

              if (count == 1){

                  System.out.print(list1.get(i)+" ");
              }
          }

        System.out.println();


                /*
        4. write a program that can combine two String arrays into one
        arrayList
        ex:
        arr1 = {"A", "B", "C"};
        arr2 = {"D", "E", "F", "G"};
        list ==> {"A", "B", "C", "D", "E", "F", "G"}
                 */

         String array1 [] = {"A", "B", "C"};
         String array2 [] = {"D", "E", "F", "G"};

         ArrayList<String > letters = new ArrayList<>();

         for (int i = 0 ;  i< array1.length; i++){

             letters.add(array1[i]);
         }

        for (int i = 0 ;  i < array2.length; i++){

            letters.add(array2[i]);
        }

        System.out.println(letters);

        //thru Scanner assign int values to arrayList of integers and sort Descending order

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 5; i++){

            System.out.println("Enter a number: "+ (i+1));

            numbers.add(scan.nextInt());
        }

        System.out.println(numbers);

        for (int i = numbers.size()-1; i >= 0; i --){

            System.out.print(numbers.get(i)+" ");
        }

        System.out.println();
    }
}
