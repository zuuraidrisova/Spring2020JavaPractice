package reviewPracticing;

import java.util.Arrays;

public class Arrays_Tasks3 {

    public static void main(String[] args) {

        /*
         write a program that can return the longest string of text from an array
         */
        String [] names = { "Kubanychbek","Asan", "Zuura","Alina","Zeynep"};

        int maxLengthString = names [1].length();

        String longest = "";

        for(int i = 0; i < names.length; i++){

            if(names [i].length() > maxLengthString){

                maxLengthString = names[i].length();

                longest = names[i];

            }

        }


        System.out.println(longest);


          /*
         write a program that can return the shortest string of text from an array
         */

        String [] str = {"Asan", "Zuura", "Alina","Kubanychbek","Zeynep"};

        String shortest = "";

        int min = str[1].length();

        for (int i = 0; i < str.length; i++){

            if (str[i].length() < min){

                min = str[i].length();

                shortest += str[i];

            }
        }

        System.out.println(shortest);

         /*
         write a program that can return the average number from an array of integers
			ex:
				[1,2,3]
				average: 2
				[10, 15, 5, 6]
				average: 9
				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10
         */

         int [] arr = {4, 5, 6, 7, 8, 10, 20, 30, 0};

         int totalNumberOfElements = arr.length;

         int sum = 0;

         for(int i = 0; i < arr.length; i++){

             sum += arr[i];

         }

        System.out.println(sum / totalNumberOfElements);


         // max and min numbers in an array

        int [] array = {1,90,2386,888,5,0, -1};

        Arrays.sort(array);

        System.out.println("maximum number: "+array[array.length-1]);
        System.out.println("minimum number: "+array[0]);

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++){

            if (array[i] > maximum){

                maximum = array[i];
            }

            if (array[i] < minimum){

                minimum = array[i];
            }
        }

        System.out.println(maximum);
        System.out.println(minimum);

        //to charArray

        String name = "Java";

        char ch [] =  name.toCharArray();

        System.out.println(Arrays.toString(ch));

        //to split method and reverse array

        String string = "I like Java";

        String words [] = string.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println(words.length);

        String [] wordsReversed = new String[words.length];

        int j = 0;

        for (int i = words.length-1; i >= 0; i--){

            wordsReversed[j] = words[i];

            j++;
        }


        System.out.println(Arrays.toString(wordsReversed));

        /*
         given an array:
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com",
         "Cybertek@hotmail.com", "Cybertek@outlook.com"}
        elements could be more in the array
    print all the email addresses excluding the gmail addresses
        NOTE: MUST USE FOR EACH LOOP
         */

        String [] email = {"Cybertek@gmail.com", "Cybertek@yahoo.com",
                "Cybertek@hotmail.com", "Cybertek@outlook.com"};

        for (String each : email){

            if (each.endsWith("gmail.com")){

                continue;
            }

            System.out.println(each);
        }


    }
}
