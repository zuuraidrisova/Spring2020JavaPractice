package reviewPracticing;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysLoop_Tasks {

    public static void main(String[] args) {

            /*
           1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to print out all the even numbers.
                MUst use continue statement
         */

            int [] array = new int[100];

            for (int i = 0; i < 100; i++){

                array[i] = i+1;
            }

        System.out.println(Arrays.toString(array));

            for (int each : array){

                if (each % 2 != 0){

                    continue;
                }

                System.out.print(each+" ");
            }

        System.out.println();
        /*
         4. write a program that can count the even and odd number from an
        array of integers
        MUST use for each  loop
         */

        int [] arr = {1,2,3,4,5,6,7,8,9,10,11};

        int countEven = 0;
        int countOdd = 0;

        for (int each : arr){

            if (each % 2 == 0){

                countEven++;

            }else{

                countOdd++;
            }
        }

        System.out.println("countEven = " + countEven);
        System.out.println("countOdd = " + countOdd);
        /*
       1. write a program that can reverse the array
       */

        int [] arr1 = {1,2,3,4,5,6,7,8,9,10,11};

        int [] reversed = new int[arr1.length];

        int j = 0;

        for (int i = arr1.length-1; i >= 0; i--){

            reversed[j] = arr1[i];

            j++;

        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(reversed));

          /*
        3. write a program that can return the number of appearances of
        java and python anywhere in the sentence
        But this time you MUST use arrays and for each loop)
                 */

        String sentence = "Java is fun, I like Java and Javascript, Python is easy";

        String []  words = sentence.split(" ");

        int countJava = 0;
        int countPython = 0;

        for (String each: words){

            if (each.equalsIgnoreCase("java")){

                countJava++;

            }

            if (each.equalsIgnoreCase("python")){

                countPython++;
            }
        }

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);

        /*
        2. write a program that sort the array in descending order
        */

        int [] arr2 = {1,2,3,4,5,6,7,8,9};

        Arrays.sort(arr2);

        int [] arrDesc = new int[arr2.length];

        int k = 0;

        for (int i = arr2.length-1; i >= 0; i--){

            arrDesc[k] = arr2[i];

            k++;

        }

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arrDesc));


                     /*
         1.Write a program that will take five Strings and save them into an array
          called arr.
        2. use for each loop to print out the first three letter of each element
         of arr, one per line. You can assume that every element of arr is at least
         3 letters long.
            Example:
                arr -> ["apple", "banana"]
                prints: app
                        ban

                        Arrays ==> Scanner ==> For loop ==> for each ==> substring

         */

        Scanner scanner = new Scanner(System.in);

        String names [] =  new String[5];

        for (int i = 0; i < 5; i++){

            System.out.println("Enter a name: ");

            names[i] = scanner.next();

        }


        System.out.println(Arrays.toString(names));

        for (String each :  names){

            System.out.println(each.substring(0,3));
        }

        scanner.close();

    }
}
