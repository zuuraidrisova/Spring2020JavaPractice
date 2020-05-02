package Replit_Practices;

import java.util.ArrayList;

public class combineALL187 {

    public static void main(String[] args) {

        /*

        Create a static method that:
is called combineAL
returns an ArrayList
takes two parameters: an ArrayList of Strings called wordList1, and an ArrayList
 of Strings called wordList2

This method should create a new ArrayList of Strings, add all the words
(in order) from wordList1, then add all the words (in order) from wordList2.
  In other words, it is combining all the elements from the two parameters.
                */

        ArrayList<String> wordList1 = new ArrayList<String>();
        wordList1.add("hello");
        wordList1.add("please");

        ArrayList<String> wordList2 = new ArrayList<String>();

        wordList2.add("thanks");
        wordList2.add("bye");
        wordList2.add("nice");

        ArrayList<String> list = new ArrayList<String>();

        list = combineALL(wordList1,wordList2);

        System.out.println(list);



    }
    public static ArrayList<String> combineALL(ArrayList<String> wordList1,
                                              ArrayList<String> wordList2){

        ArrayList<String> list = new ArrayList<String>();


        for(int i = 0; i < wordList1.size(); i++){

            list.add(wordList1.get(i));
        }

        for(String each : wordList2){

            list.add(each);
        }

        return list;

    }
}
