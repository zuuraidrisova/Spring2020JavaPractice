package Replit_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class removeAllreplit {

    public static void main(String[] args) {

       /*
       Create a static method that:
is called removeAll
returns nothing
takes two parameters: an ArrayList of Strings called wordList, and
a String called targetWord

This method should go through every element of wordList and remove every
 instance of targetWord from the ArrayList.

Example:

ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));

removeAll(wordList,"hi");

now wordList is ["hey","yo"]
        */

       ArrayList<String>wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));

       String target = "hi";
       removeAll(wordList, target);

    }

    public static void removeAll(ArrayList<String> wordList, String targetWord){


        wordList.removeAll(Arrays.asList(targetWord));

        System.out.println(wordList);


    }
}
