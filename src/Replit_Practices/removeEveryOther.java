package Replit_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class removeEveryOther {

    public static void main(String[] args) {

        /*
         Create a method that:

is called removeEveryOther
returns nothing
takes in a single parameter - an ArrayList of Strings called words

This method should take the ArrayList parameter and modify it by
 removing every other element in the list, starting with removing the 0th element.

For example, if the parameter is:
("hi","yo","sup","yolo","boop")
The modified ArrayList should be:
("yo","yolo")
         */

        ArrayList<String>words = new ArrayList<>(Arrays.asList("hi","yo","sup","yolo","boop"));

        removeEveryOther(words);
        removeEveryOther2(words);
        removeEveryOther3(words);
        removeEveryOther4(words);

    }

    public static void removeEveryOther(ArrayList<String> words){

        ArrayList<String > modified = new ArrayList<>();

        for(int i = 1; i < words.size(); i += 2){

            modified.add(words.get(i));
        }


        System.out.println(modified);

    }

    public static void removeEveryOther2(ArrayList<String> words){


        ArrayList<String > list = new ArrayList<>();

        for(int i = 0; i < words.size(); i++){

            if(i % 2 != 0){


                list.add(words.get(i));
            }

        }

        System.out.println(list);
    }

    public static void removeEveryOther3(ArrayList<String > words){

        for(int i = 0; i < words.size(); i++){

            if(i % 2 == 0){

               continue;
            }

            System.out.println(words.get(i));
        }


    }
    public static void removeEveryOther4(ArrayList<String> words) {

        for (int i = 0; i < words.size(); i++)

            words.remove(i);

        // hi yo sup yolo boop  i=0 < word size 5   remove index 0   i++
        // yo sup yolo boop     i=1 < word size 4   remove index 1   i++
        // yo yolo boop         i=2 < word size 3   remove index 2   i++
        // yo yolo              i=3 > word size 2   exit loop

        System.out.println(words);
    }

}
